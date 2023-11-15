package cat.institutmontilivi.dam2_m07_pr11_navegacion_pantallas_v2_listas_clases_asynimage.ui.Pantallas

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.sp
import kotlin.random.Random

@Composable
fun PantallaPrincipal(
    onListaDeGuerreros : (String) -> Unit,
    onListaDeCoches : (String) -> Unit,
    onListaDePaises : (String) -> Unit
) {

    Column (
        modifier = Modifier
            .fillMaxSize()

    ) {
        Box (
            modifier = Modifier
                .fillMaxWidth()
                .weight(1F)
        ) {
            Button(
                modifier = Modifier
                    .align(Alignment.Center),
                onClick = { onListaDeCoches("Lista de coches")
                }

            ) {
                Text (text = "Lista de coches", fontSize = 40.sp)
            }
        }

        Box (
            modifier = Modifier
                .fillMaxWidth()
                .weight(1F)
        ) {
            Button(modifier = Modifier
                .align(Alignment.Center),
                onClick = { onListaDeGuerreros("Lista de Guerreros") }
            ) {
                Text (text = "Lista de guerreros", fontSize = 40.sp)
            }
        }

        Box (
            modifier = Modifier
                .fillMaxWidth()
                .weight(1F)
        ) {
            Button(modifier = Modifier
                .align(Alignment.Center),
                onClick = { onListaDePaises("Lista de Países") }
            ) {
                Text (text = "Lista de países", fontSize = 40.sp)
            }
        }
    }
}