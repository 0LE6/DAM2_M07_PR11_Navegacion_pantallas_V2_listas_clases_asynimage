package cat.institutmontilivi.dam2_m07_pr11_navegacion_pantallas_v2_listas_clases_asynimage.ui.Pantallas

import androidx.compose.foundation.background
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
import cat.institutmontilivi.dam2_m07_pr11_navegacion_pantallas_v2_listas_clases_asynimage.Datos.Coches
import cat.institutmontilivi.dam2_m07_pr11_navegacion_pantallas_v2_listas_clases_asynimage.R
import coil.compose.AsyncImage
import coil.request.ImageRequest

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun PantallaCocheSeleccionado(
    idCocheSeleccionado : Int = 8,
    onPopUpClick: () -> Unit
) {
    val cocheSeleccionado = Coches.datos[idCocheSeleccionado -1]

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
            AsyncImage(
                model = ImageRequest.Builder(LocalContext.current)
                    .data(cocheSeleccionado.foto)
                    .crossfade(true)
                    .build(),
                placeholder = painterResource(R.drawable.ic_launcher_foreground),
                contentDescription = "Super Guerrer",
                contentScale = ContentScale.Crop,
                modifier = Modifier
                    .size(64.dp)
                    .clip(CircleShape)
            )

            // Espacio entre la foto y los atributos
            Spacer(modifier = Modifier.width(16.dp))

            // Muestra los atributos a la derecha
            Column {
                Text(text = "Nombre: ${cocheSeleccionado.nom}", fontWeight = FontWeight.Bold)
                Row(
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    Text("Color: ")
                    // Cuadrado de color
                    Box(
                        modifier = Modifier
                            .size(15.dp)
                            .background(color = cocheSeleccionado.color)
                    )
                }
                Text(text = "Año: ${cocheSeleccionado.data}")
                Text(text = "País: ${cocheSeleccionado.pais}")
                Text(text = "Motor: ${cocheSeleccionado.motor}")
                Text(text = "Consumo: ${cocheSeleccionado.consumo} L/100km")
                Text(text = "Precio: ${cocheSeleccionado.precio} €")
            }
        }
    }
}