package com.example.practical_5_mad_22012011012

import LoginScreen
import RegisterScreen
import android.content.Context
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.rememberNavController
import androidx.navigation.compose.composable



@Composable
fun AppNavigation(context: Context) {
    val navController = rememberNavController()
    NavHost(navController = navController, startDestination = "login") {
        composable("login") {
            LoginScreen(context as Modifier, navController = navController)
        }
        composable("registration") {
            RegisterScreen(context, navController = navController)
        }
    }
}
fun navigateToRegistrationScreen(navController: NavController) {
    navController.navigate("registration") {
        popUpTo("login") { inclusive = true }
    }
}

fun navigateToLoginScreen(navController: NavController) {
    navController.navigate("login") {
        popUpTo("registration") { inclusive = true }
    }
}
