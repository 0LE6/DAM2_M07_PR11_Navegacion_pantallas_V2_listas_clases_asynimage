package cat.institutmontilivi.dam2_m07_pr11_navegacion_pantallas_v2_listas_clases_asynimage.ui.Pantallas

import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import cat.institutmontilivi.dam2_m07_pr11_navegacion_pantallas_v2_listas_clases_asynimage.Datos.Coche
import cat.institutmontilivi.dam2_m07_pr11_navegacion_pantallas_v2_listas_clases_asynimage.Datos.Coches
import cat.institutmontilivi.dam2_m07_pr11_navegacion_pantallas_v2_listas_clases_asynimage.Datos.Paises
import cat.institutmontilivi.dam2_m07_pr11_navegacion_pantallas_v2_listas_clases_asynimage.R
import coil.compose.AsyncImage
import coil.request.ImageRequest
import androidx.compose.foundation.lazy.items
import cat.institutmontilivi.dam2_m07_pr11_navegacion_pantallas_v2_listas_clases_asynimage.Datos.Pais


@Composable
fun PantallaListaDePaises(titulo : String = "Titulo") {

    LazyColumn(
        modifier = Modifier
            .fillMaxSize()
    ) {
        item { Text (text = titulo) }
        items(Paises.datos) { pais ->
            PaisItem(pais)
        }
    }
}

@Composable
fun PaisItem(pais: Pais) {
    AsyncImage(
        model = ImageRequest.Builder(LocalContext.current)
            .data(pais.bandera)
            .crossfade(true)
            .build(),
        placeholder = painterResource(R.drawable.ic_launcher_foreground),
        contentDescription = "País",
        contentScale = ContentScale.Crop,
        modifier = Modifier.clip(CircleShape)
    )
    Spacer(modifier = Modifier.padding(8.dp))

    val valor = pais.id //obtener la id o el indice del campo para mandarlo por parametro
}