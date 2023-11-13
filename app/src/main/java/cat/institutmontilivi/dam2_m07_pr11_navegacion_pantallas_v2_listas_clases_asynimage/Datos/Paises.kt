package cat.institutmontilivi.dam2_m07_pr11_navegacion_pantallas_v2_listas_clases_asynimage.Datos

data class Pais(
    val id : Int,
    val nombre : String,
    val bandera : String , // aquí meteremos al url de la imagen
    val continente : String,
    val capital : String,
    val superficie : Int,
    val habitantes : Int
)

class Paises {

    companion object {
        private val datos = listOf(
            Pais(1, "Nepal", "url_de_la_bandera",
                "Asia", "Katmandu", 147516, 30000000)
        )
    }
}