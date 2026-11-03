package com.example.profile.ui.components

import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp
import com.example.profile.data.User
import androidx.compose.ui.tooling.preview.Preview

/**
 * Компонент отображения информации о пользователе.
 *
 * @param user Данные пользователя.
 * @param modifier Модификатор для настройки внешнего вида.
 *
 * @author Лаврентьев Аврам Петрович
 * @since 2026-09-03
 */
@Composable
fun ProfileInfo(
    user: User,
    modifier: Modifier = Modifier
) {
    Text(
        text = "${user.name} ${user.surname}",
        fontSize = 24.sp,
        fontWeight = FontWeight.Bold,
        modifier = modifier
    )

    Text(
        text = user.status,
        fontSize = 16.sp,
        color = MaterialTheme.colorScheme.secondary
    )

    Text(
        text = "Подписчиков: ${user.followers}",
        fontSize = 14.sp
    )
}
@Preview(showBackground = true)
@Composable
fun ProfileInfoPreview() {
    ProfileInfo(user = User())
}