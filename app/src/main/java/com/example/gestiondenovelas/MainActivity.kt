package com.example.gestiondenovelas

import android.content.Intent
import android.os.Bundle
import androidx.activity.ComponentActivity
import com.example.gestiondenovelas.IniciodeSesion.LoginActivity

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val intent = Intent(this, LoginActivity::class.java)
        startActivity(intent)
        finish()
    }
}