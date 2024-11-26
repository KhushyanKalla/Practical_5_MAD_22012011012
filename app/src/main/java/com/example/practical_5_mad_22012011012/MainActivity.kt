package com.example.practical_5_mad_22012011012

import LoginScreen
import android.annotation.SuppressLint
import android.content.Context
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.ui.Modifier
import com.example.practical_5_mad_22012011012.ui.theme.Practical_5_MAD_22012011012Theme

    class MainActivity : ComponentActivity() {
        @SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
        override fun onCreate(savedInstanceState: Bundle?) {
            super.onCreate(savedInstanceState)
            enableEdgeToEdge()
            setContent {
                Practical_5_MAD_22012011012Theme {
                    Scaffold(modifier = Modifier.fillMaxSize()) {
                        AppNavigation(context = this)
                    }
                }
            }
        }
    }
