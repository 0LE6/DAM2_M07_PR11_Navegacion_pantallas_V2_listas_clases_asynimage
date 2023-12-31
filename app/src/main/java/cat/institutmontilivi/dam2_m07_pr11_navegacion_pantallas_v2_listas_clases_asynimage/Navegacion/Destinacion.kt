package cat.institutmontilivi.dam2_m07_pr11_navegacion_pantallas_v2_listas_clases_asynimage.Navegacion

import androidx.navigation.NamedNavArgument
import androidx.navigation.NavType
import androidx.navigation.navArgument

sealed class Destinacion (

    val rutaBase : String,
    val argumentosDeNavegacion : List<ArgumentoDeNavegacion> = emptyList()
) {
    val rutaGenerica = run {
        val claves = argumentosDeNavegacion.map { "{${it.clave}}" }
        listOf(rutaBase)
            .plus(claves)
            .joinToString("/")
    }

    val navArgs = argumentosDeNavegacion.map { it.toNavArgument() }

    object Principal : Destinacion("Principal")
    object ListaDeGuerreros : Destinacion("ListaDeGuerreros",
        listOf(ArgumentoDeNavegacion.Titulo)) {
        fun creaRutaEspecifica(titulo : String) = "$rutaBase/$titulo"
    }
    object ListaDeCoches : Destinacion("ListaDeCoches",
        listOf(ArgumentoDeNavegacion.Titulo)) {
        fun creaRutaEspecifica(titulo : String) = "$rutaBase/$titulo"
    }
    object ListaDePaises : Destinacion("ListaDePaises",
        listOf(ArgumentoDeNavegacion.Titulo)) {
        fun creaRutaEspecifica(titulo : String) = "$rutaBase/$titulo"
    }
    object GuerreroSeleccionado : Destinacion("GuerreroSeleccionado",
        listOf(ArgumentoDeNavegacion.Id)){
        fun creaRutaDeNavegacion(id : Int) = "$rutaBase/$id"
    }

    object CocheSeleccionado : Destinacion("cocheSeleccionado",
        listOf(ArgumentoDeNavegacion.Id)){
        fun creaRutaDeNavegacion(id : Int) = "$rutaBase/$id"
    }

    object PaisSeleccionado : Destinacion("paisSeleccionado",
        listOf(ArgumentoDeNavegacion.Id)){
        fun creaRutaDeNavegacion(id : Int) = "$rutaBase/$id"
    }
}

enum class ArgumentoDeNavegacion (
    val clave : String,
    val tipo : NavType<*>
) {
    Titulo("Titulo", tipo = NavType.StringType),
    Id("Id", tipo = NavType.IntType);
    fun toNavArgument() : NamedNavArgument {
        return navArgument(clave) { tipo }
    }
}
