package com.practice.instagramcomposesample.ui.splash

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.requiredHeight
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.practice.instagramcomposesample.R
import com.practice.instagramcomposesample.ui.destinations.LoginScreenDestination
import com.practice.instagramcomposesample.ui.theme.InstagramComposeSampleTheme
import com.ramcosta.composedestinations.annotation.Destination
import com.ramcosta.composedestinations.annotation.RootNavGraph
import com.ramcosta.composedestinations.navigation.DestinationsNavigator
import com.ramcosta.composedestinations.navigation.EmptyDestinationsNavigator
import kotlinx.coroutines.delay

@RootNavGraph(start = true)
@Destination
@Composable
fun SplashScreen(navigator: DestinationsNavigator) {
    Box(
        modifier = Modifier.fillMaxSize(),
        contentAlignment = Alignment.Center
    ) {
        InstagramLogo()
    }
    LaunchedEffect(Unit) {
        delay(3000)
        navigator.popBackStack()
        navigator.navigate(LoginScreenDestination)
    }
}

@Composable
fun InstagramLogo() {
    Image(
        painter = painterResource(id = R.drawable.instagram_logo),
        contentDescription = "Splash",
        modifier = Modifier
            .requiredHeight(58.dp)
            .fillMaxWidth()
    )
}

@Preview
@Composable
fun SplashPreview() {
    InstagramComposeSampleTheme {
        Surface(
            modifier = Modifier.fillMaxSize(),
            color = MaterialTheme.colorScheme.background
        ) {
            SplashScreen(navigator = EmptyDestinationsNavigator)
        }
    }
}