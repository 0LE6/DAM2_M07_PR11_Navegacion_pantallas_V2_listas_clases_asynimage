package cat.institutmontilivi.dam2_m07_pr11_navegacion_pantallas_v2_listas_clases_asynimage.ui.Pantallas

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Text
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
import cat.institutmontilivi.dam2_m07_pr11_navegacion_pantallas_v2_listas_clases_asynimage.Datos.Coche
import cat.institutmontilivi.dam2_m07_pr11_navegacion_pantallas_v2_listas_clases_asynimage.Datos.Coches
import cat.institutmontilivi.dam2_m07_pr11_navegacion_pantallas_v2_listas_clases_asynimage.Datos.Guerrero
import cat.institutmontilivi.dam2_m07_pr11_navegacion_pantallas_v2_listas_clases_asynimage.Datos.Guerreros
import cat.institutmontilivi.dam2_m07_pr11_navegacion_pantallas_v2_listas_clases_asynimage.R
import coil.compose.AsyncImage
import coil.request.ImageRequest

@Composable
fun PantallaListaDeCoches(titulo : String = "Lista de coches") {

    LazyColumn(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.DarkGray)
    ) {
        item { Text (
            text = titulo,
            color = Color.White,
            fontWeight = FontWeight.ExtraBold) }
        items(Coches.datos) { coche ->
            CocheItem(coche)
        }
    }
}

@Composable
fun CocheItem(coche: Coche) {
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .padding(16.dp)
            .background(Color.LightGray),
        verticalAlignment = Alignment.CenterVertically
    ) {
        // Muestra la foto a la izquierda
        AsyncImage(
            model = ImageRequest.Builder(LocalContext.current)
                .data(coche.foto)
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
            Text(text = "Nombre: ${coche.nom}", fontWeight = FontWeight.Bold)
            Row(
                verticalAlignment = Alignment.CenterVertically
            ) {
                Text("Color: ")
                // Cuadrado de color
                Box(
                    modifier = Modifier
                        .size(15.dp)
                        .background(color = coche.color)
                )
            }
            Text(text = "Año: ${coche.data}")
            Text(text = "País: ${coche.pais}")
            Text(text = "Motor: ${coche.motor}")
            Text(text = "Consumo: ${coche.consumo} L/100km")
            Text(text = "Precio: ${coche.precio} €")
        }
    }
}


//val valor = coche.id //obtener la id o el indice del campo para mandarlo por parametro
