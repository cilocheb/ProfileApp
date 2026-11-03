package com.example.profile.ui

import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.example.profile.data.User
import com.example.profile.ui.components.ActionButtons
import com.example.profile.ui.components.Avatar
import com.example.profile.ui.components.ProfileInfo
import androidx.compose.ui.tooling.preview.Preview

/**
 * Основной экран профиля пользователя.
 *
 * @param user Исходные данные пользователя.
 * @param modifier Модификатор для настройки внешнего вида.
 *
 * @author Лаврентьев Аврам Петрович
 * @since 2026-09-03
 */
@Composable
fun ProfileScreen(
    user: User = User(),
    modifier: Modifier = Modifier
) {
    var currentUser by remember { mutableStateOf(user) }
    var counter by remember { mutableIntStateOf(0) }
    var editedName by remember { mutableStateOf(user.name) }

    Column(
        modifier = modifier
            .fillMaxSize()
            .padding(16.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.spacedBy(16.dp)
    ) {
        Avatar()

        ProfileInfo(
            user = currentUser.copy(name = editedName)
        )

        TextField(
            value = editedName,
            onValueChange = { editedName = it },
            label = { Text("Имя") },
            modifier = Modifier.fillMaxWidth()
        )

        Divider()

        ActionButtons(
            isSubscribed = currentUser.isSubscribed,
            onSubscribeClick = {
                currentUser = currentUser.copy(
                    isSubscribed = !currentUser.isSubscribed,
                    followers = if (currentUser.isSubscribed)
                        currentUser.followers - 1
                    else currentUser.followers + 1
                )
            },
            onResetClick = {
                editedName = user.name
                currentUser = user
            }
        )

        Text(text = "Количество нажатий: $counter")

        Button(onClick = { counter++ }) {
            Text(text = "+")
        }
    }
}
@Preview(showBackground = true)
@Composable
fun ProfileScreenPreview() {
    ProfileScreen()
}