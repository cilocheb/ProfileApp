package com.example.profile.ui.components

import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview

/**
 * Компонент с кнопками действий.
 *
 * @param isSubscribed Состояние подписки.
 * @param onSubscribeClick Обработчик нажатия на кнопку подписки.
 * @param onResetClick Обработчик нажатия на кнопку сброса.
 * @param modifier Модификатор для настройки внешнего вида.
 *
 * @author Лаврентьев Аврам Петрович
 * @since 2026-09-03
 */
@Composable
fun ActionButtons(
    isSubscribed: Boolean,
    onSubscribeClick: () -> Unit,
    onResetClick: () -> Unit,
    modifier: Modifier = Modifier
) {
    Button(
        onClick = onSubscribeClick,
        modifier = modifier
    ) {
        Text(text = if (isSubscribed) "Отписаться" else "Подписаться")
    }

    Button(
        onClick = onResetClick
    ) {
        Text(text = "Сбросить")
    }
}
@Preview(showBackground = true)
@Composable
fun ActionButtonsPreview() {
    ActionButtons(
        isSubscribed = false,
        onSubscribeClick = {},
        onResetClick = {}
    )
}