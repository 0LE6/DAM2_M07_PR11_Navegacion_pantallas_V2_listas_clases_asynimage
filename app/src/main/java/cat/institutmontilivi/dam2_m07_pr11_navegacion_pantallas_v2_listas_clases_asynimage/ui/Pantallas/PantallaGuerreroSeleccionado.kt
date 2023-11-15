package cat.institutmontilivi.dam2_m07_pr11_navegacion_pantallas_v2_listas_clases_asynimage.ui.Pantallas

import android.util.Log
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.CutCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
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
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import cat.institutmontilivi.dam2_m07_pr11_navegacion_pantallas_v2_listas_clases_asynimage.Datos.Guerrero
import cat.institutmontilivi.dam2_m07_pr11_navegacion_pantallas_v2_listas_clases_asynimage.Datos.Guerreros
import cat.institutmontilivi.dam2_m07_pr11_navegacion_pantallas_v2_listas_clases_asynimage.R
import coil.compose.AsyncImage
import coil.request.ImageRequest


@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun PantallaGuerreroseleccionado(
    idGuerreroSeleccionado : Int = 16
    ,
    onPopUpClick: () -> Unit
) {
    //Log.d("oleg","El id que pasamos es -->> $idGuerreroSeleccionado")
    // NOTE : no sé si esta es la mejor forma
    val guerreroSeleccionado =
        Guerreros.datos[idGuerreroSeleccionado -1]
    // solución chapucera a un mini bug, coge el indice de la lista
    //Log.d("------", "val guerreroSeleccionado $guerreroSeleccionado")

    Scaffold(
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
                    IconButton(onClick = onPopUpClick  ) {
                        Icon(
                            imageVector = Icons.Default.ArrowBack,
                            contentDescription = "Pantalla principal"
                        )
                    }
                }
            )
        }
    ) {
        Column(
            modifier = Modifier
                .padding(it)
                .fillMaxWidth()
                .padding(16.dp)
                .background(Color.LightGray)
                .clip(CutCornerShape(20.dp))
        ) {
            // Muestra la foto en la mitad izquierda
            AsyncImage(
                model = ImageRequest.Builder(LocalContext.current)
                    .data(guerreroSeleccionado.foto)
                    .crossfade(true)
                    .build(),
                placeholder = painterResource(R.drawable.ic_launcher_foreground),
                contentDescription = "Super Guerrer",
                contentScale = ContentScale.Crop,
                modifier = Modifier
                    .fillMaxHeight()
                    .weight(1f)
                    .clip(CircleShape)
            )

            Spacer(modifier = Modifier.width(16.dp))

            Column(
                modifier = Modifier
                    .fillMaxHeight()
                    .weight(1f)
            ) {
                Text(text = "Nombre: ${guerreroSeleccionado.nombre}", fontWeight = FontWeight.Bold)

                Row(
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    Text("Color: ")
                    // Cuadrado de color
                    Box(
                        modifier = Modifier
                            .size(15.dp)
                            .background(color = guerreroSeleccionado.color)
                    )
                }

                Text(text = "Edad: ${guerreroSeleccionado.edad} años")
                Text(text = "Fuerza: ${guerreroSeleccionado.fuerza}")
                Text(text = "Resistencia: ${guerreroSeleccionado.resistencia}")
                Text(text = "Ataque: ${guerreroSeleccionado.ataque}")
                Text(text = "Defensa: ${guerreroSeleccionado.defensa}")
            }
        }
    }
}
