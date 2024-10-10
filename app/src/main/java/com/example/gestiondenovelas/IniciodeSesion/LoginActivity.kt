package com.example.gestiondenovelas.IniciodeSesion

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import com.example.gestiondenovelas.menu.MenuUsuarioScreen
import com.example.gestiondenovelas.Database.UserManager

class LoginActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            LoginScreen(
                onLogin = { username: String, password: String, showMessage ->
                    val user = UserManager.getUser(username, password)
                    if (user != null) {
                        setContent {
                            MenuUsuarioScreen(
                                userName = user.username,
                                onBack = { finish() },
                                onAddNovela = { /* Implementar acción */ },
                                onViewUserNovelas = { /* Implementar acción */ },
                                onViewInitialNovelas = { /* Implementar acción */ }
                            )
                        }
                    } else {
                        showMessage("Usuario no encontrado")
                    }
                }
            )
        }
    }
}