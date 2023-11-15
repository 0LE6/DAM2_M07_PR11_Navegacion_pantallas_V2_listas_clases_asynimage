package cat.institutmontilivi.dam2_m07_pr11_navegacion_pantallas_v2_listas_clases_asynimage.Navegacion

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.rememberNavController

@Composable
fun GraficoDeNavegacion() {

    val controladorDeNavegacion = rememberNavController()

    NavHost(
        navController = controladorDeNavegacion,
        startDestination = Destinacion.Principal.rutaGenerica
    ) {

    }
}
