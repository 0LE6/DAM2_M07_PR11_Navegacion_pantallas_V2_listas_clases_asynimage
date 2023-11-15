package cat.institutmontilivi.dam2_m07_pr11_navegacion_pantallas_v2_listas_clases_asynimage.ui.Pantallas

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Home
import androidx.compose.material3.Button
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp


@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun PantallaPrincipal(

    onListaDeGuerreros : (String) -> Unit,
    onListaDeCoches : (String) -> Unit,
    onListaDePaises : (String) -> Unit

) {
    Scaffold (
        topBar = {
            TopAppBar(
                colors = TopAppBarDefaults.smallTopAppBarColors(
                    containerColor = MaterialTheme.colorScheme.primaryContainer,
                    titleContentColor = MaterialTheme.colorScheme.primary,
                ),
                title = {
                    Text("Menú principal")
                },
                navigationIcon = {
                    IconButton(onClick = { /*TODO*/ }) {
                        Icon(
                            imageVector = Icons.Default.Home,
                            contentDescription = "Pantalla principal"
                        )
                    }
                }
            ) // aquí termina el paréntesis de topapp bar
        }
    ) {
        Column(
            modifier = Modifier
                .padding(it) // para que se vayan todas la líneas rojas
                .fillMaxSize()
                .padding(24.dp),
            verticalArrangement = Arrangement.Center

        ) {
            Box(
                modifier = Modifier
                    .fillMaxWidth()
                    .weight(1F)
            ) {
                Button(
                    modifier = Modifier
                        .align(Alignment.Center),
                    onClick = { onListaDeCoches("Lista de coches") }

                ) {
                    Text(text = "Lista de coches", fontSize = 30.sp)
                }
            }

            Box(
                modifier = Modifier
                    .fillMaxWidth()
                    .weight(1F)
            ) {
                Button(modifier = Modifier
                    .align(Alignment.Center),
                    onClick = { onListaDeGuerreros("Lista de guerreros") }
                ) {
                    Text(text = "Lista de guerreros", fontSize = 30.sp)
                }
            }

            Box(
                modifier = Modifier
                    .fillMaxWidth()
                    .weight(1F)
            ) {
                Button(modifier = Modifier
                    .align(Alignment.Center),
                    onClick = { onListaDePaises("Lista de países") }
                ) {
                    Text(text = "Lista de países", fontSize = 30.sp)
                }
            }
        }
    }
}