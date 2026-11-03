package com.example.profile.ui.components

import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Person
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.unit.dp
import androidx.compose.ui.tooling.preview.Preview

/**
 * Компонент отображения аватара пользователя.
 *
 * Использует стандартную иконку [Icons.Default.Person]
 * в круглой обёртке.
 *
 * @param modifier Модификатор для настройки внешнего вида.
 *
 * @author Лаврентьев Аврам Петрович
 * @since 2026-09-03
 */
@Composable
fun Avatar(modifier: Modifier = Modifier) {
    Icon(
        imageVector = Icons.Default.Person,
        contentDescription = "Аватар пользователя",
        modifier = modifier
            .size(120.dp)
            .clip(CircleShape),
        tint = MaterialTheme.colorScheme.primary
    )
}
@Preview(showBackground = true)
@Composable
fun AvatarPreview() {
    Avatar()
}