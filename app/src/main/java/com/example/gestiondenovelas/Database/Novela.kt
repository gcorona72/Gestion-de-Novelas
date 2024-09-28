package com.example.gestiondenovelas

data class Novela(
    val titulo: String,
    val autor: String,
    val anoPublicacion: Int,
    val sinopsis: String,
    val isFavorite: Boolean = false,
    val reseñas: List<String> = emptyList()
)