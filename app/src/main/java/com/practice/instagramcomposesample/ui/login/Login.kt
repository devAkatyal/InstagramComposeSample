package com.practice.instagramcomposesample.ui.login

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Divider
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.practice.instagramcomposesample.R
import com.practice.instagramcomposesample.ui.components.InstaTextFieldEmail
import com.practice.instagramcomposesample.ui.components.InstaTextFieldPassword
import com.practice.instagramcomposesample.ui.splash.InstagramLogo
import com.practice.instagramcomposesample.ui.theme.InstagramComposeSampleTheme
import com.ramcosta.composedestinations.annotation.Destination
import com.ramcosta.composedestinations.navigation.DestinationsNavigator
import com.ramcosta.composedestinations.navigation.EmptyDestinationsNavigator

@Destination
@Composable
fun LoginScreen(navigator: DestinationsNavigator) {
    Column(
        modifier = Modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        InstagramLogo()
        Spacer(modifier = Modifier.height(42.dp))
        InstaTextFieldEmail(
            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 30.dp)
        )
        Spacer(modifier = Modifier.height(16.dp))
        InstaTextFieldPassword(
            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 30.dp)
        )
        Spacer(modifier = Modifier.height(16.dp))
        Button(
            onClick = {
                //your onclick code here
            },
            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 30.dp),
            shape = RoundedCornerShape(5.dp),
            colors = ButtonDefaults.buttonColors(containerColor = colorResource(id = R.color.blue))
        ) {
            Text(
                text = "LOGIN", modifier = Modifier
                    .padding(vertical = 6.dp), fontSize = 16.sp,
                fontWeight = FontWeight.Bold
            )
        }
        HorizontalLinesWithText()
        Text(
            text = "Sign Up with Email",
            modifier = Modifier
                .padding(top = 20.dp), fontSize = 16.sp,
            fontWeight = FontWeight.Bold,
            color = colorResource(id = R.color.blue)
        )
    }
}

@Composable
fun HorizontalLinesWithText() {
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .padding(horizontal = 30.dp)
            .padding(top = 45.dp),
        horizontalArrangement = Arrangement.Center,
        verticalAlignment = Alignment.CenterVertically
    ) {
        Divider(
            modifier = Modifier
                .weight(1f)
                .height(1.dp)
                .background(colorResource(id = R.color.grey_3))
        )
        Text(
            text = "OR",
            modifier = Modifier
                .padding(horizontal = 16.dp),
            fontSize = 16.sp,
            color = colorResource(id = R.color.grey_2)
        )

        Divider(
            modifier = Modifier
                .weight(1f)
                .height(1.dp)
                .background(colorResource(id = R.color.grey_3))
        )
    }
}


@Preview
@Composable
fun SimpleComposablePreview() {
    InstagramComposeSampleTheme {
        Surface(
            modifier = Modifier.fillMaxSize(),
            color = MaterialTheme.colorScheme.background
        ) {
            LoginScreen(navigator = EmptyDestinationsNavigator)
        }
    }
}