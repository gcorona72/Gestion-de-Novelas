package com.example.gestiondenovelas.Database

import com.example.gestiondenovelas.User
import com.example.gestiondenovelas.Novela

object UserManager {
    private val users = mutableListOf<User>()
    private val mutableInitialNovels = mutableListOf<Novela>()

    init {
        users.add(User("1", "1"))
    }

    fun addUser(user: User) {
        users.add(user)
    }

    fun getUser(username: String, password: String): User? {
        return users.find { it.username == username && it.password == password }
    }

    fun addNovelaToUser(username: String, novela: Novela) {
        val user = users.find { it.username == username }
        user?.novelas?.add(novela)
    }

    fun getNovelasForUser(username: String): List<Novela>? {
        return users.find { it.username == username }?.novelas
    }

    fun deleteNovelaFromUser(username: String, novela: Novela) {
        val user = users.find { it.username == username }
        user?.novelas?.remove(novela)
    }

    fun getInitialNovels(): List<Novela> {
        return mutableInitialNovels
    }

    fun deleteNovelaFromInitial(novela: Novela) {
        mutableInitialNovels.remove(novela)
    }
}