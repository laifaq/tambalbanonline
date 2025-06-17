package com.example.tambalbanonline.ui

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Chat
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Person
import androidx.compose.material.icons.filled.Store
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.tambalbanonline.ui.theme.TambalBanOnlineTheme

sealed class Screen(val route: String, val icon: ImageVector) {
    object Home : Screen("home", Icons.Default.Home)
    object Chat : Screen("chat", Icons.Default.Chat)
    object Marketplace : Screen("marketplace", Icons.Default.Store)
    object Profile : Screen("profile", Icons.Default.Person)
}

@Composable
fun TambalBanOnlineApp() {
    TambalBanOnlineTheme {
        MainScreen()
    }
} 