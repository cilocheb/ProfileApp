package com.example.profile

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.ui.Modifier
import com.example.profile.ui.ProfileScreen
import com.example.profile.ui.theme.ProfileAppTheme

/**
 * Главная Activity приложения.
 * Отображает экран профиля с использованием Jetpack Compose.
 *
 * @author Лаврентьев Аврам Петрович
 * @version 1.0
 * @since 2026-09-03
 */
class MainActivity : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContent {
            ProfileAppTheme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    ProfileScreen()
                }
            }
        }
    }
}
