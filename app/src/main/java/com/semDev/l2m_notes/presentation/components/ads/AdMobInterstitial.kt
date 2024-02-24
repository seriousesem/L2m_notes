package com.semDev.l2m_notes.presentation.components.ads
import android.app.Activity
import android.content.Context
import android.util.Log
import com.google.android.gms.ads.AdError
import com.google.android.gms.ads.AdRequest
import com.google.android.gms.ads.FullScreenContentCallback
import com.google.android.gms.ads.LoadAdError
import com.google.android.gms.ads.interstitial.InterstitialAd
import com.google.android.gms.ads.interstitial.InterstitialAdLoadCallback
import com.semDev.l2m_notes.R
import javax.inject.Inject

class AdMobInterstitial @Inject constructor(
    private val context: Context
) {
    private var interstitialAd: InterstitialAd? = null
    private val adUnitId = context.getString(R.string.interstitial_ad_unit_id)

    fun loadAds() {
        val adRequest = AdRequest.Builder().build()

        InterstitialAd.load(context, adUnitId, adRequest, object : InterstitialAdLoadCallback() {
            override fun onAdFailedToLoad(loadAdError: LoadAdError) {
                super.onAdFailedToLoad(loadAdError)
                interstitialAd = null
            }

            override fun onAdLoaded(ad: InterstitialAd) {
                super.onAdLoaded(ad)
                interstitialAd = ad
            }
        })
    }

    fun showAds(activity: Activity) {
        interstitialAd?.let { ad ->
            ad.fullScreenContentCallback = object : FullScreenContentCallback() {
                override fun onAdDismissedFullScreenContent() {
                    super.onAdDismissedFullScreenContent()
                    interstitialAd = null
                    loadAds()
                }

                override fun onAdFailedToShowFullScreenContent(error: AdError) {
                    super.onAdFailedToShowFullScreenContent(error)
                    interstitialAd = null
                    loadAds()
                }
            }
            ad.show(activity)
            loadAds()
        } ?: kotlin.run {
            loadAds()
            Log.d("TAG", "mInterstitialAd = null")
        }
    }
}