// src/main/java/com/example/gestiondenovelas/menu/MenuUsuarioActivity.kt
package com.example.gestiondenovelas.menu

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.runtime.*
import com.example.gestiondenovelas.AddNovela.AddNovelaScreen

import com.example.gestiondenovelas.Database.UserManager
import com.example.gestiondenovelas.Novela
import com.example.gestiondenovelas.VerNovelas.ViewNovelasScreen

class MenuUsuarioActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val userName = intent.getStringExtra("username") ?: "User"
        setContent {
            MenuUsuarioContent(userName)
        }
    }
}

@Composable
fun MenuUsuarioContent(userName: String) {
    var showAddNovelaScreen by remember { mutableStateOf(false) }
    var showUserNovelasScreen by remember { mutableStateOf(false) }
    var showInitialNovelasScreen by remember { mutableStateOf(false) }

    when {
        showAddNovelaScreen -> {
            AddNovelaScreen(
                onBack = { showAddNovelaScreen = false },
                onAddNovela = { novela: Novela ->
                    UserManager.addNovelaToUser(userName, novela)
                    showAddNovelaScreen = false
                }
            )
        }
        showUserNovelasScreen -> {
            ViewNovelasScreen(
                novelas = UserManager.getNovelasForUser(userName) ?: emptyList(),
                onBack = { showUserNovelasScreen = false },
                onDeleteNovela = { novela: Novela ->
                    UserManager.deleteNovelaFromUser(userName, novela)
                }
            )
        }
        showInitialNovelasScreen -> {
            ViewNovelasScreen(
                novelas = UserManager.getInitialNovels(),
                onBack = { showInitialNovelasScreen = false },
                onDeleteNovela = { novela: Novela ->
                    UserManager.deleteNovelaFromInitial(novela)
                }
            )
        }
        else -> {
            MenuUsuarioScreen(
                userName = userName,
                onBack = {
                    // Handle back action
                },
                onAddNovela = { showAddNovelaScreen = true },
                onViewUserNovelas = { showUserNovelasScreen = true },
                onViewInitialNovelas = { showInitialNovelasScreen = true }
            )
        }
    }
}


