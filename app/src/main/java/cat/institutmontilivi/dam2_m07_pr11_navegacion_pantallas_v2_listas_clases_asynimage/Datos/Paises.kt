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
            Pais(1, "Nepal", "url_de_la_bandera", "Asia", "Katmandu", 147516, 30000000),
            Pais(2, "Estados Unidos", "url_de_la_bandera", "América del Norte", "Washington D.C.", 9833517, 331002651),
            Pais(3, "Brasil", "url_de_la_bandera", "América del Sur", "Brasilia", 8515767, 212559417),
            Pais(4, "China", "url_de_la_bandera", "Asia", "Pekín", 9596961, 1444216107),
            Pais(5, "Australia", "url_de_la_bandera", "Oceanía", "Canberra", 7692024, 25499884),
            Pais(6, "Rusia", "url_de_la_bandera", "Europa/Asia", "Moscú", 17098242, 145912025),
            Pais(7, "Sudáfrica", "url_de_la_bandera", "África", "Ciudad del Cabo", 1221037, 59308690),
            Pais(8, "India", "url_de_la_bandera", "Asia", "Nueva Delhi", 3287263, 1393409038),
            Pais(9, "Canadá", "url_de_la_bandera", "América del Norte", "Ottawa", 9976140, 37742154),
            Pais(10, "Argentina", "url_de_la_bandera", "América del Sur", "Buenos Aires", 2780400, 45195777),
            Pais(11, "Francia", "url_de_la_bandera", "Europa", "París", 551695, 65273511),
            Pais(12, "Japón", "url_de_la_bandera", "Asia", "Tokio", 377975, 126476461),
            Pais(13, "México", "url_de_la_bandera", "América del Norte", "Ciudad de México", 1964375, 128932753),
            Pais(14, "Italia", "url_de_la_bandera", "Europa", "Roma", 301340, 60461826),
            Pais(15, "Egipto", "url_de_la_bandera", "África", "El Cairo", 1002450, 104258327),
            Pais(16, "Nigeria", "url_de_la_bandera", "África", "Abuya", 923768, 206139589),
            Pais(17, "Corea del Sur", "url_de_la_bandera", "Asia", "Seúl", 100210, 51269185),
            Pais(18, "Colombia", "url_de_la_bandera", "América del Sur", "Bogotá", 1141748, 50882891),
            Pais(19, "Alemania", "url_de_la_bandera", "Europa", "Berlín", 357022, 83783942),
            Pais(20, "Turquía", "url_de_la_bandera", "Asia/Europa", "Ankara", 783356, 84339067),
            Pais(21, "España", "url_de_la_bandera", "Europa", "Madrid", 505992, 46754778)

        )
    }

}