package com.example.gestiondenovelas.Database

import com.example.gestiondenovelas.User
import com.example.gestiondenovelas.Novela

object UserManager {
    private val users = mutableListOf<User>()
    private val userNovelas = mutableMapOf<String, MutableList<Novela>>()

    fun addNovelaToUser(userName: String, novela: Novela) {
        val novelas = userNovelas.getOrPut(userName) { mutableListOf() }
        novelas.add(novela)
    }

    fun deleteNovelaFromUser(userName: String, novela: Novela) {
        userNovelas[userName]?.remove(novela)
    }

    fun getNovelasForUser(userName: String): List<Novela>? {
        return userNovelas[userName]
    }

    fun getInitialNovels(): List<Novela> {
        // Devuelve una lista de novelas iniciales
        return listOf()
    }

    fun deleteNovelaFromInitial(novela: Novela) {
        // Implementa la lógica para eliminar una novela de la lista inicial
    }

    fun getUser(username: String, password: String): User? {
        return users.find { it.username == username && it.password == password }
    }

    fun createUser(username: String, password: String) {
        val newUser = User(username, password)
        users.add(newUser)
    }
}

// Crear el usuario "pepe" con la contraseña "123"
fun main() {
    UserManager.createUser("pepe", "123")
}