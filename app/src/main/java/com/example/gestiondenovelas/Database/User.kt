package com.example.gestiondenovelas

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "users")
data class User(
    @PrimaryKey val username: String,
    val password: String,
    val novelas: MutableList<Novela> = mutableListOf() // Add a list of novels
)