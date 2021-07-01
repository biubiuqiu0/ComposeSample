package com.castledrv.manageshowcase_compose

import android.os.Bundle
import android.util.Log
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.viewModels
import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.material.Button
import androidx.compose.material.ExperimentalMaterialApi
import androidx.compose.material.Text
import androidx.compose.runtime.*
import androidx.compose.runtime.livedata.observeAsState
import androidx.compose.ui.unit.ExperimentalUnitApi
import com.castledrv.manageshowcase_compose.ui.showcase.ManageShowcaseScreen


class MainActivity : ComponentActivity() {
    private val viewModel: ManageShowcaseViewModel by viewModels()

    @ExperimentalUnitApi
    @ExperimentalMaterialApi
    @ExperimentalFoundationApi
    @ExperimentalComposeApi
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ManageShowcaseScreen()
        }
    }

}
