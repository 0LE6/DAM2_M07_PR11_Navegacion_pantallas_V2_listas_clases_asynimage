package cat.institutmontilivi.dam2_m07_pr11_navegacion_pantallas_v2_listas_clases_asynimage.Navegacion

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import cat.institutmontilivi.dam2_m07_pr11_navegacion_pantallas_v2_listas_clases_asynimage.ui.Pantallas.PantallaListaDeCoches
import cat.institutmontilivi.dam2_m07_pr11_navegacion_pantallas_v2_listas_clases_asynimage.ui.Pantallas.PantallaListaDeGuerreros
import cat.institutmontilivi.dam2_m07_pr11_navegacion_pantallas_v2_listas_clases_asynimage.ui.Pantallas.PantallaListaDePaises
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

        // NOTE : composable para la pantalla de la "Lista de Guerreros"
        composable(
            route = Destinacion.ListaDeGuerreros.rutaGenerica,
            arguments = Destinacion.ListaDeGuerreros.navArgs
        ) {
            val titulo = it.arguments?.getString(ArgumentoDeNavegacion.Titulo.clave)

            requireNotNull(titulo)

            PantallaListaDeGuerreros(titulo)
        }

        // NOTE : composable para la pantalla de la "Lista de Coches"
        composable(
            route = Destinacion.ListaDeCoches.rutaGenerica,
            arguments = Destinacion.ListaDeCoches.navArgs
        ) {
            val titulo = it.arguments?.getString(ArgumentoDeNavegacion.Titulo.clave)

            requireNotNull(titulo)

            PantallaListaDeCoches(titulo)
        }

        // NOTE : composable para la pantalla de la "Lista de Paises"
        composable(
            route = Destinacion.ListaDePaises.rutaGenerica,
            arguments = Destinacion.ListaDePaises.navArgs
        ) {
            val titulo = it.arguments?.getString(ArgumentoDeNavegacion.Titulo.clave)

            requireNotNull(titulo)

            PantallaListaDePaises(titulo)
        }
    }
}
