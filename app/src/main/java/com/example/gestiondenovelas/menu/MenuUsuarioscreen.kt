// PantallaUsuario.kt
package com.example.gestiondenovelas.menu

import android.content.Intent
import androidx.compose.foundation.layout.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.gestiondenovelas.IniciodeSesion.LoginActivity

@Composable
fun PantallaUsuario(
    userName: String,
    onBack: () -> Unit,
    onAñadirNovela: () -> Unit,
    onViewUserNovelas: () -> Unit,
    onViewInitialNovelas: () -> Unit,
    modifier: Modifier = Modifier
) {
    val context = LocalContext.current

    Scaffold { innerPadding ->
        Box(
            modifier = modifier
                .fillMaxSize()
                .padding(innerPadding)
        ) {
            IconButton(
                onClick = {
                    val intent = Intent(context, LoginActivity::class.java)
                    context.startActivity(intent)
                },
                modifier = Modifier.align(Alignment.TopStart).padding(16.dp)
            ) {
                Icon(Icons.Filled.ArrowBack, contentDescription = "Back")
            }
            Column(
                modifier = Modifier
                    .fillMaxSize()
                    .padding(16.dp),
                verticalArrangement = Arrangement.Center,
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Text(text = "Bienvenido a tu Biblioteca, $userName", fontSize = 24.sp, modifier = Modifier.padding(bottom = 16.dp))
                Button(
                    onClick = onAñadirNovela,
                    modifier = Modifier.fillMaxWidth().padding(bottom = 8.dp)
                ) {
                    Text("Añadir Novela")
                }
                Button(
                    onClick = onViewUserNovelas,
                    modifier = Modifier.fillMaxWidth().padding(bottom = 8.dp)
                ) {
                    Text("Ver Mis Novelas")
                }
                Button(
                    onClick = onViewInitialNovelas,
                    modifier = Modifier.fillMaxWidth().padding(bottom = 8.dp)
                ) {
                    Text("Ver Otras Novelas")
                }
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun PantallaUsuarioPreview() {
    PantallaUsuario(userName = "User", onBack = {}, onAñadirNovela = {}, onViewUserNovelas = {}, onViewInitialNovelas = {})
}