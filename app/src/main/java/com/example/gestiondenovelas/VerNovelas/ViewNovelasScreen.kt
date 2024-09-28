// src/main/java/com/example/gestiondenovelas/VerNovelas/ViewNovelasScreen.kt
package com.example.gestiondenovelas.VerNovelas

import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material.icons.filled.Delete
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.example.gestiondenovelas.Novela

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun ViewNovelasScreen(
    novelas: List<Novela>,
    onBack: () -> Unit,
    onDeleteNovela: (Novela) -> Unit,
    modifier: Modifier = Modifier
) {
    Scaffold(
        topBar = {
            TopAppBar(
                title = { Text("Novelas") },
                navigationIcon = {
                    IconButton(onClick = onBack) {
                        Icon(Icons.Filled.ArrowBack, contentDescription = "Back")
                    }
                }
            )
        }
    ) { innerPadding ->
        LazyColumn(
            contentPadding = innerPadding,
            modifier = modifier.fillMaxSize()
        ) {
            items(novelas) { novela ->
                Row(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(16.dp)
                ) {
                    Text(text = novela.titulo, modifier = Modifier.weight(1f))
                    IconButton(onClick = { onDeleteNovela(novela) }) {
                        Icon(Icons.Filled.Delete, contentDescription = "Delete")
                    }
                }
            }
        }
    }
}