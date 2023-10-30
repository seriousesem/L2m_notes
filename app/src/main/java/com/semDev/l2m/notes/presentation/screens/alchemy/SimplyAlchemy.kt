package com.semDev.l2m.notes.presentation.screens.alchemy

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.CutCornerShape
import androidx.compose.material.ButtonDefaults
import androidx.compose.material.DropdownMenu
import androidx.compose.material.DropdownMenuItem
import androidx.compose.material.Icon
import androidx.compose.material.OutlinedButton
import androidx.compose.material.Text
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowDropDown
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.hilt.navigation.compose.hiltViewModel
import coil.compose.AsyncImage
import com.semDev.l2m.notes.R
import com.semDev.l2m.notes.domain.model.alchemy.AlchemyInsertCombinationItemModel
import com.semDev.l2m.notes.domain.model.alchemy.AlchemyInsertCombinationModel
import com.semDev.l2m.notes.presentation.components.DescriptionDialog
import com.semDev.l2m.notes.presentation.components.HorizontalSpacing
import com.semDev.l2m.notes.presentation.components.VerticalSpacing


@Composable
fun SimplyAlchemy(
    viewModel: AlchemyViewModel = hiltViewModel()
) {
    val state = viewModel.viewState.value

    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(horizontal = 8.dp, vertical = 16.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        AlchemyStageDropDown(
            viewModel = viewModel
        )
        VerticalSpacing(spacing = 32)
        AlchemyCombinationTitle(stringResource(id = R.string.alchemy_insert_combination_title))
        VerticalSpacing(spacing = 16)
        AlchemyInsertCombinations(
            alchemyInsertCombinations = viewModel.slotsCombination,
            viewModel = viewModel
        )
        VerticalSpacing(spacing = 16)
        AlchemyCombinationTitle(stringResource(id = R.string.alchemy_result_combination_title))
        VerticalSpacing(spacing = 16)
        AlchemyResultCombinations()
        VerticalSpacing(spacing = 16)
        ResultItems()
    }
    DescriptionDialog(
        showDialog = viewModel.viewState.value.isShowDialog,
        onDismiss = { viewModel.setEvent(AlchemyProvider.Event.CLOSE_DIALOG, null) },
        description = stringResource(id = viewModel.viewState.value.alchemyInsertSlotDescription)
    )
}

@Composable
private fun AlchemyStageDropDown(
    viewModel: AlchemyViewModel
) {
    val dropdownModifier = Modifier.size(200.dp)

    Column(modifier = Modifier) {
        DropdownMenu(
            modifier = dropdownModifier,
            expanded = viewModel.viewState.value.isDropdownOpen,
            onDismissRequest = {
                viewModel.setEvent(AlchemyProvider.Event.CLOSE_DROPDOWN, null)
            }
        ) {
            viewModel.simplyAlchemyStages.forEach { alchemyStage ->
                DropdownMenuItem(
                    onClick = {
                        viewModel.setEvent(AlchemyProvider.Event.SELECT_ALCHEMY_STAGE, alchemyStage)
                    }
                ) {
                    Text(text = alchemyStage)
                }
            }
        }
        Row(
            modifier = Modifier.clickable {
                viewModel.setEvent(AlchemyProvider.Event.OPEN_DROPDOWN, null)
            },
            verticalAlignment = Alignment.CenterVertically
        ) {
            Icon(
                modifier = Modifier.padding(horizontal = 8.dp),
                imageVector = Icons.Default.ArrowDropDown,
                contentDescription = null,
            )
            Text(
                text = "${stringResource(id = R.string.stage_of_alchemy)} - ${viewModel.viewState.value.selectedAlchemyStage}",
                fontSize = 18.sp,
                fontWeight = FontWeight.Bold
            )
        }
    }
}

@Composable
private fun AlchemyCombinationTitle(
    title: String
) {
    Text(
        text = title,
        fontSize = 18.sp,
        fontWeight = FontWeight.Bold
    )
}

@Composable
private fun AlchemyInsertCombinations(
    alchemyInsertCombinations: List<AlchemyInsertCombinationModel>,
    viewModel: AlchemyViewModel
) {
    LazyColumn {
        items(alchemyInsertCombinations) { alchemyInsertCombination ->
            LazyRow(
                modifier = Modifier
                    .padding(8.dp)
                    .fillMaxWidth(),
                horizontalArrangement = Arrangement.Center,
            ) {
                items(alchemyInsertCombination.alchemyInsertCombinationItems) { alchemyInsertCombinationItemModel ->
                    HorizontalSpacing(spacing = 8)
                    AlchemyInsertCombinationItem(
                        alchemyInsertCombinationItemModel = alchemyInsertCombinationItemModel,
                        viewModel = viewModel
                    )
                    HorizontalSpacing(spacing = 8)
                }
            }
        }
    }
}

@Composable
private fun AlchemyInsertCombinationItem(
    alchemyInsertCombinationItemModel: AlchemyInsertCombinationItemModel,
    viewModel: AlchemyViewModel
) {

    OutlinedButton(
        onClick = {
            viewModel.setEvent(
                event = AlchemyProvider.Event.SHOW_DIALOG,
                data = alchemyInsertCombinationItemModel.description
            )

        },
        modifier = Modifier
            .size(48.dp),
        shape = CircleShape,
        contentPadding = PaddingValues(0.dp),
        colors = ButtonDefaults.outlinedButtonColors(
            backgroundColor = alchemyInsertCombinationItemModel.slotColor,
            contentColor = Color.DarkGray
        ),
    ) {
        Text(
            text = alchemyInsertCombinationItemModel.itemEnchant,
            fontSize = 14.sp,
            fontWeight = FontWeight.Bold
        )
    }
}

@Composable
private fun AlchemyResultCombinationItem(

) {

    OutlinedButton(
        onClick = {},
        modifier = Modifier.size(48.dp),
        shape = CutCornerShape(16.dp),
        border = BorderStroke(1.dp, Color.LightGray),
        contentPadding = PaddingValues(0.dp),
        colors = ButtonDefaults.outlinedButtonColors(backgroundColor = Color.LightGray)
    ) {
        AsyncImage(
            model = "https://assets.playnccdn.com/gamedata/powerbook/l2m/icon/Icon_128/Item/Icon_Item_Usable_Rune_STR_02.png",
            contentDescription = null,
            modifier = Modifier
                .size(40.dp)
        )
    }
}

@Composable
private fun AlchemyResultCombinations() {
    LazyRow(
        modifier = Modifier.fillMaxWidth(),
        horizontalArrangement = Arrangement.Center,
    ) {
        items(5) {
            HorizontalSpacing(spacing = 8)
            AlchemyResultCombinationItem()
            HorizontalSpacing(spacing = 8)
        }
    }
}

@Composable
private fun ResultItem() {

    Row(
        modifier = Modifier.fillMaxWidth(),
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.Center
    ) {
        AsyncImage(
            model = "https://assets.playnccdn.com/gamedata/powerbook/l2m/icon/Icon_128/Item/Icon_WP_Sword_G4_005.png",
            contentDescription = null,
            modifier = Modifier
                .size(32.dp)
                .padding(end = 8.dp)
        )
        Text(text = "+0 Меч Гигантов (0.0033%)")
    }
}

@Composable
private fun ResultItems() {
    LazyColumn {
        items(50) {
            ResultItem()
        }
    }

}

