package com.practice.instagramcomposesample

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import com.practice.instagramcomposesample.ui.NavGraphs
import com.practice.instagramcomposesample.ui.theme.InstagramComposeSampleTheme
import com.ramcosta.composedestinations.DestinationsNavHost

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            InstagramComposeSampleTheme {
                DestinationsNavHost(navGraph = NavGraphs.root)
            }
        }
    }
}