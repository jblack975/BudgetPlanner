package com.blackfox.budgetplanner.android

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.blackfox.budgetplanner.Greeting
import android.widget.TextView
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.padding
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController

fun greet(): String {
    return Greeting().greeting()
}

class MainActivity  : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContent {
            MaterialTheme {
                MainLayout()
            }
        }
    }

    @Composable
    fun MainLayout() {
        val navController = rememberNavController()

    }

    sealed class Screen(val title: String) {
        object HomeScreen : Screen("Home")
        object SettingsScreen : Screen("Settings")
        object EditPasswordScreen : Screen("Edit")
        object PasswordDetailScreen: Screen("ArticleDetail")
    }

    @Preview
    @Composable
    fun DefaultPreview() {
        MainLayout()
    }
}