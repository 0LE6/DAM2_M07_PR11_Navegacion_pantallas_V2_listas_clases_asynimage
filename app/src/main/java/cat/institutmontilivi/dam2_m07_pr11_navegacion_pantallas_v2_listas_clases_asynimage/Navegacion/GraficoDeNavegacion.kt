package cat.institutmontilivi.dam2_m07_pr11_navegacion_pantallas_v2_listas_clases_asynimage.Navegacion

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import cat.institutmontilivi.dam2_m07_pr11_navegacion_pantallas_v2_listas_clases_asynimage.ui.Pantallas.PantallaPrincipal

@Composable
fun GraficoDeNavegacion() {

    val controladorDeNavegacion = rememberNavController()

    NavHost(
        navController = controladorDeNavegacion,
        startDestination = Destinacion.Principal.rutaGenerica
    ) {
        // NOTE : pantalla principal
        composable(
            route = Destinacion.Principal.rutaGenerica
        ) {
            PantallaPrincipal(
                onListaDeGuerreros = { titulo : String ->
                    controladorDeNavegacion.navigate(
                        Destinacion.ListaDeGuerreros.creaRutaEspecifica(titulo))
                },
                onListaDeCoches = { titulo : String ->
                    controladorDeNavegacion.navigate(
                        Destinacion.ListaDeCoches.creaRutaEspecifica(titulo))
                },
                onListaDePaises = { titulo : String ->
                    controladorDeNavegacion.navigate(
                        Destinacion.ListaDePaises.creaRutaEspecifica(titulo)) }
            )
        }
    }
}
