package com.practice.instagramcomposesample.ui.components

import android.annotation.SuppressLint
import android.view.MotionEvent
import android.view.View
import android.widget.EditText
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.viewinterop.AndroidView
import com.practice.instagramcomposesample.R

@SuppressLint("ClickableViewAccessibility")
@Composable
fun InstaTextFieldEmail(modifier: Modifier) {
    AndroidView(factory = {
        View.inflate(it, R.layout.edittext_email, null)
    }, modifier = modifier,
        update = {
            val editText = it.findViewById<EditText>(R.id.edt1)

            editText.setOnTouchListener { _, event ->
                if (event.action == MotionEvent.ACTION_UP) {
                    // Check if the touch is within the right drawable area
                    if (event.rawX >= (editText.right - editText.compoundDrawables[2].bounds.width())) {
                        editText.text.clear()
                        return@setOnTouchListener true
                    }
                }
                return@setOnTouchListener false
            }
        })
}

@Composable
fun InstaTextFieldPassword(modifier: Modifier) {
    AndroidView(factory = {
        View.inflate(it, R.layout.edittext_password, null)
    }, modifier = modifier,
        update = {
        })
}

@Composable
fun InstaTextFieldName(modifier: Modifier) {
    AndroidView(factory = {
        View.inflate(it, R.layout.edittext_name, null)
    }, modifier = modifier,
        update = {
        })
}