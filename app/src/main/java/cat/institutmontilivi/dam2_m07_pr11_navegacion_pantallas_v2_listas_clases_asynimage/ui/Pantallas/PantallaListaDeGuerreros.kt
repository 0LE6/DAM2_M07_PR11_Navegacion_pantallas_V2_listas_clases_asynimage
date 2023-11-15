package cat.institutmontilivi.dam2_m07_pr11_navegacion_pantallas_v2_listas_clases_asynimage.ui.Pantallas

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
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
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import cat.institutmontilivi.dam2_m07_pr11_navegacion_pantallas_v2_listas_clases_asynimage.Datos.Guerrero
import cat.institutmontilivi.dam2_m07_pr11_navegacion_pantallas_v2_listas_clases_asynimage.Datos.Guerreros
import cat.institutmontilivi.dam2_m07_pr11_navegacion_pantallas_v2_listas_clases_asynimage.R
import coil.compose.AsyncImage
import coil.request.ImageRequest
import androidx.compose.foundation.lazy.items // Importante para los items de LazyColumn
import androidx.compose.foundation.shape.CutCornerShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.ui.Alignment
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import android.util.Log

@Composable
fun PantallaListaDeGuerreros(
    titulo : String = "Lista de Guerreros?????",
    onGuerreroSeleccionado : (Int) -> Unit
) {

    LazyColumn(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.DarkGray)

    ) {
        item { Text (
            text = titulo,
            color = Color.White,
            fontWeight = FontWeight.ExtraBold) }
        items(Guerreros.datos) { guerrero ->
            GuerreroItem(guerrero, onGuerreroSeleccionado)
        }
    }
}

@Composable
fun GuerreroItem(guerrero: Guerrero,
                 onGuerreroSeleccionado : (Int) -> Unit
) {
    Log.d("el id desde GuerreroItemm","$guerrero.id")
    Row(
        modifier = Modifier
            .clickable { onGuerreroSeleccionado(guerrero.id) }
            .fillMaxWidth()
            .padding(16.dp)
            .background(Color.LightGray)
            .clip(CutCornerShape(20.dp)),
        verticalAlignment = Alignment.CenterVertically,

    ) {
        // Muestra la foto a la izquierda
        AsyncImage(
            model = ImageRequest.Builder(LocalContext.current)
                .data(guerrero.foto)
                .crossfade(true)
                .build(),
            placeholder = painterResource(R.drawable.ic_launcher_foreground),
            contentDescription = "Super Guerrer",
            contentScale = ContentScale.Crop,
            modifier = Modifier
                .size(64.dp)
                .clip(CircleShape)
        )

        Spacer(modifier = Modifier.width(16.dp))

        Column {
            Text(text = guerrero.nombre,
                fontWeight = FontWeight.Bold)
            /*
            Row(
                verticalAlignment = Alignment.CenterVertically
            ) {
                Text("Color: ")
                // Cuadrado de color
                Box(
                    modifier = Modifier
                        .size(15.dp)
                        .background(color = guerrero.color)
                )
            }

            Text(text = "Edad: ${guerrero.edad} años")
            Text(text = "Fuerza: ${guerrero.fuerza}")
            Text(text = "Resistencia: ${guerrero.resistencia}")
            Text(text = "Ataque: ${guerrero.ataque}")
            Text(text = "Defensa: ${guerrero.defensa}")
            */
        }
    }
}



//val valor = guerrero.id //obtener la id o el indice del campo para mandarlo por parametro

