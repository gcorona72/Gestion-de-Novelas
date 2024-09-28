package com.example.gestiondenovelas

import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material.icons.filled.Delete
import androidx.compose.runtime.*
import androidx.compose.runtime.livedata.observeAsState
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.lifecycle.viewmodel.compose.viewModel

@Composable
fun NovelManagerApp() {
    val viewModel: NovelViewModel = viewModel()
    val novels by viewModel.getAllNovels().observeAsState(emptyList())

    Scaffold(
        topBar = {
            TopAppBar(title = { Text("Gestión de Novelas") })
        },
        floatingActionButton = {
            FloatingActionButton(onClick = { /* Implementar la lógica para agregar una nueva novela */ }) {
                Icon(Icons.Default.Add, contentDescription = "Agregar Novela")
            }
        }
    ) {
        LazyColumn(modifier = Modifier.fillMaxSize().padding(it)) {
            items(novels) { novel ->
                NovelItem(novel = novel, onDelete = { viewModel.delete(it) })
            }
        }
    }
}

@Composable
fun NovelItem(novel: Novel, onDelete: (Novel) -> Unit) {
    Card(modifier = Modifier.padding(8.dp).fillMaxWidth()) {
        Column(modifier = Modifier.padding(16.dp)) {
            Text(text = "Título: ${novel.title}")
            Text(text = "Autor: ${novel.author}")
            Text(text = "Año: ${novel.year}")
            Text(text = "Sinopsis: ${novel.synopsis}")
            IconButton(onClick = { onDelete(novel) }) {
                Icon(Icons.Default.Delete, contentDescription = "Eliminar")
            }
        }
    }
}
