package com.example.gestiondenovelas.IniciodeSesion


import android.content.Intent
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import com.example.gestiondenovelas.menu.MenuUsuarioActivity
import com.example.gestiondenovelas.Database.UserManager

class LoginActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            LoginScreen(
                onLogin = { username: String, password: String, showMessage ->
                    val user = UserManager.getUser(username, password)
                    if (user != null) {
                        val intent = Intent(this@LoginActivity, MenuUsuarioActivity::class.java)
                        intent.putExtra("username", user.username) // Pass the username
                        startActivity(intent)
                        finish()
                    } else {
                        showMessage("User not found")
                    }
                }
            )
        }
    }
}