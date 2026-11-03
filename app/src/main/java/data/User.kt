package com.example.profile.data

/**
 * Data class, представляющий пользователя.
 *
 * @property name Имя пользователя.
 * @property surname Фамилия пользователя.
 * @property status Статус пользователя (например, "Онлайн").
 * @property followers Количество подписчиков.
 * @property isSubscribed Подписан ли текущий пользователь.
 *
 * @author Лаврентьев Аврам Петрович
 * @since 2026-09-03
 */
data class User(
    val name: String = "Алексей",
    val surname: String = "Смирнов",
    val status: String = "Занимаюсь мобильной разработкой 📱",
    val followers: Int = 128,
    val isSubscribed: Boolean = false
)
