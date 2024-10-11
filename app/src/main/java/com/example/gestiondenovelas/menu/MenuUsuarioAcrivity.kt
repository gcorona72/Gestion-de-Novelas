// MenuUsuario.kt
package com.example.gestiondenovelas.menu

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.runtime.*
import com.example.gestiondenovelas.AñadirNovela.AñadirNovelaScreen
import com.example.gestiondenovelas.Database.UserManager
import com.example.gestiondenovelas.Novela
import com.example.gestiondenovelas.PantallasNovelas.ImprimirNovelas

class MenuUsuario : ComponentActivity() {
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
    var showAñadirNovelaScreen by remember { mutableStateOf(false) }
    var showUserNovelasScreen by remember { mutableStateOf(false) }
    var showInitialNovelasScreen by remember { mutableStateOf(false) }

    when {
        showAñadirNovelaScreen -> {
            AñadirNovelaScreen(
                onBack = { showAñadirNovelaScreen = false },
                onAñadirNovela = { novela ->
                    UserManager.AñadirNovelaToUser(userName, novela)
                    showAñadirNovelaScreen = false
                }
            )
        }
        showUserNovelasScreen -> {
            ImprimirNovelas(
                novelas = UserManager.getNovelasForUser(userName) ?: emptyList(),
                onBack = { showUserNovelasScreen = false },
                onDeleteNovela = { novela ->
                    UserManager.deleteNovelaFromUser(userName, novela)
                }
            )
        }
        showInitialNovelasScreen -> {
            ImprimirNovelas(
                novelas = UserManager.getInitialNovels(),
                onBack = { showInitialNovelasScreen = false },
                onDeleteNovela = { novela ->
                    UserManager.deleteNovelaFromInitial(novela)
                }
            )
        }
        else -> {
            PantallaUsuario(
                userName = userName,
                onBack = {
                    // Handle back action
                },
                onAñadirNovela = { showAñadirNovelaScreen = true },
                onViewUserNovelas = { showUserNovelasScreen = true },
                onViewInitialNovelas = { showInitialNovelasScreen = true }
            )
        }
    }
}