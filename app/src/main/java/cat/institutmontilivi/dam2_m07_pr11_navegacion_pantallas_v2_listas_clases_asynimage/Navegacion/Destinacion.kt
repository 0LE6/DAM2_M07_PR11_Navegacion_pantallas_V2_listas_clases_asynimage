package cat.institutmontilivi.dam2_m07_pr11_navegacion_pantallas_v2_listas_clases_asynimage.Navegacion

import androidx.navigation.NamedNavArgument
import androidx.navigation.NavType
import androidx.navigation.navArgument

sealed class Destinacion (

    val rutaBase : String,
    val argumentosDeNavegacion : List<ArgumentoDeNavegacio> = emptyList()
) {
    val rutagenerica = run {
        val claves = argumentosDeNavegacion.map { "{${it.clave}}" }
        listOf(rutaBase)
            .plus(claves)
            .joinToString("/")
    }

    val navArgs = argumentosDeNavegacion.map { it.toNavArgument() }

    object Principal : Destinacion("Principal")
    object ListaDeGuerreros : Destinacion("ListaDeGuerreros",
        listOf(ArgumentoDeNavegacio.Titulo)) {
        fun creaRutaEspecifica(titulo : String) = "$rutaBase/$titulo"
    }
    object ListaDeCoches : Destinacion("ListaDeCoches",
        listOf(ArgumentoDeNavegacio.Titulo)) {
        fun creaRutaEspecifica(titulo : String) = "$rutaBase/$titulo"
    }
    object ListaDePaises : Destinacion("ListaDePaises",
        listOf(ArgumentoDeNavegacio.Titulo)) {
        fun creaRutaEspecifica(titulo : String) = "$rutaBase/$titulo"
    }
}

enum class ArgumentoDeNavegacio (
    val clave : String,
    val tipos : NavType<*>
) {
    Titulo("Titulo", NavType.StringType);

    fun toNavArgument() : NamedNavArgument {
        return navArgument(clave) { tipos }
    }
}
