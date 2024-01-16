package com.practice.instagramcomposesample

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.requiredHeight
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.practice.instagramcomposesample.destinations.MainScreenDestination
import com.practice.instagramcomposesample.ui.theme.InstagramComposeSampleTheme
import com.ramcosta.composedestinations.DestinationsNavHost
import com.ramcosta.composedestinations.annotation.Destination
import com.ramcosta.composedestinations.annotation.RootNavGraph
import com.ramcosta.composedestinations.manualcomposablecalls.composable
import com.ramcosta.composedestinations.navigation.DestinationsNavigator
import com.ramcosta.composedestinations.navigation.EmptyDestinationsNavigator
import kotlinx.coroutines.delay

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

@RootNavGraph(start = true)
@Destination
@Composable
fun SplashScreen(navigator: DestinationsNavigator) {
    Box(
        modifier = Modifier.fillMaxSize(),
        contentAlignment = Alignment.Center
    ) {
        Image(
            painter = painterResource(id = R.drawable.instagram_logo),
            contentDescription = "Splash",
            modifier = Modifier
                .requiredHeight(58.dp)
                .fillMaxWidth()
        )
    }
    LaunchedEffect(Unit) {
        delay(3000)
        navigator.popBackStack()
        navigator.navigate(MainScreenDestination)
    }
}

@Destination
@Composable
fun MainScreen(navigator: DestinationsNavigator) {
    Text(
        text = "Hello, Main Screen!",
        modifier = Modifier.padding(16.dp)
    )
}

@Preview
@Composable
fun SimpleComposablePreview() {
    InstagramComposeSampleTheme {
        Surface(
            modifier = Modifier.fillMaxSize(),
            color = MaterialTheme.colorScheme.background
        ) {
//            SplashScreen(navigator = EmptyDestinationsNavigator)
            MainScreen(navigator = EmptyDestinationsNavigator)
        }
    }
}