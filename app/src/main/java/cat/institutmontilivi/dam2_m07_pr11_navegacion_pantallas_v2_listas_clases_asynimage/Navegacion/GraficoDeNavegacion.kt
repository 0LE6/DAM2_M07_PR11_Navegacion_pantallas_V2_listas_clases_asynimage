package cat.institutmontilivi.dam2_m07_pr11_navegacion_pantallas_v2_listas_clases_asynimage.Navegacion

import android.util.Log
import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import cat.institutmontilivi.dam2_m07_pr11_navegacion_pantallas_v2_listas_clases_asynimage.ui.Pantallas.PantallaGuerreroseleccionado
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
        // En la composable de la "Lista de Guerreros"
        composable(
            route = Destinacion.ListaDeGuerreros.rutaGenerica,
            arguments = Destinacion.ListaDeGuerreros.navArgs
        ) {
            val titulo = it.arguments?.getString(ArgumentoDeNavegacion.Titulo.clave)

            requireNotNull(titulo)

            PantallaListaDeGuerreros(
                titulo = titulo,
                onGuerreroSeleccionado = { id : Int ->
                    controladorDeNavegacion.navigate(
                        Destinacion.GuerreroSeleccionado.creaRutaDeNavegacion(id)
                    )
                }
            )
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

        // NOTE : composable para la pantalla del "Guerrero seleccionado"
        composable(
            route = Destinacion.GuerreroSeleccionado.rutaGenerica,
            arguments =  Destinacion.GuerreroSeleccionado.navArgs
        ) {backStackEntry ->
            val id = backStackEntry.arguments?.getInt(ArgumentoDeNavegacion.Id.clave)

            requireNotNull(id)

            PantallaGuerreroseleccionado(
                idGuerreroSeleccionado = 4,
                onPopUpClick = {
                    controladorDeNavegacion.navigate(
                        Destinacion.Principal.rutaGenerica)})
        }



        /*
        PantallaGuerreroseleccionado

        // NOTE: composable para la pantalla de "Guerrero seleccionado"
        composable(
            route = Destinacion.GuerreroSeleccionado.rutaGenerica,
            arguments = Destinacion.GuerreroSeleccionado.navArgs
        ) {
            val idGuerreroSeleccionado =
                it.arguments!!.getInt(ArgumentoDeNavegacion.Id.clave)

            PantallaGuerreroseleccionado(
                onPopUpClick = {
                    // Lógica para manejar el clic en el botón de retroceso
                    // Puedes usar controladorDeNavegacion.popBackStack() o cualquier otra lógica que necesites
                },
                idGuerreroSeleccionado = idGuerreroSeleccionado
            )
        }*/

    }
}
