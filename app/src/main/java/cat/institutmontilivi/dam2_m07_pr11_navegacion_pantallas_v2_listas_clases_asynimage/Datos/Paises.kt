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
        val datos = listOf(
            Pais(1, "Nepal", "https://loremflickr.com/300/300/nepalflag", "Asia", "Katmandu", 147516, 30000000),
            Pais(2, "Estados Unidos", "https://loremflickr.com/300/300/usaflag", "América del Norte", "Washington D.C.", 9833517, 331002651),
            Pais(3, "Brasil", "https://loremflickr.com/300/300/brasilflag", "América del Sur", "Brasilia", 8515767, 212559417),
            Pais(4, "China", "https://loremflickr.com/300/300/chinaflag", "Asia", "Pekín", 9596961, 1444216107),
            Pais(5, "Australia", "https://loremflickr.com/300/300/australiaflag", "Oceanía", "Canberra", 7692024, 25499884),
            Pais(6, "Rusia", "https://loremflickr.com/300/300/urssflag", "Europa/Asia", "Moscú", 17098242, 145912025),
            Pais(7, "Sudáfrica", "https://loremflickr.com/300/300/rsaflag", "África", "Ciudad del Cabo", 1221037, 59308690),
            Pais(8, "India", "https://loremflickr.com/300/300/indiaflag", "Asia", "Nueva Delhi", 3287263, 1393409038),
            Pais(9, "Canadá", "https://loremflickr.com/300/300/canadaflag", "América del Norte", "Ottawa", 9976140, 37742154),
            Pais(10, "Argentina", "https://loremflickr.com/300/300/argentinaflag", "América del Sur", "Buenos Aires", 2780400, 45195777),
            Pais(11, "Francia", "https://loremflickr.com/300/300/franceflag", "Europa", "París", 551695, 65273511),
            Pais(12, "Japón", "https://loremflickr.com/300/300/japanflag", "Asia", "Tokio", 377975, 126476461),
            Pais(13, "México", "https://loremflickr.com/300/300/mexicoflag", "América del Norte", "Ciudad de México", 1964375, 128932753),
            Pais(14, "Italia", "https://loremflickr.com/300/300/italyflag", "Europa", "Roma", 301340, 60461826),
            Pais(15, "Egipto", "https://loremflickr.com/300/300/egiptflag", "África", "El Cairo", 1002450, 104258327),
            Pais(16, "Nigeria", "https://loremflickr.com/300/300/nigeriaflag", "África", "Abuya", 923768, 206139589),
            Pais(17, "Corea del Sur", "https://loremflickr.com/300/300/koreaflag", "Asia", "Seúl", 100210, 51269185),
            Pais(18, "Colombia", "https://loremflickr.com/300/300/colombiaflag", "América del Sur", "Bogotá", 1141748, 50882891),
            Pais(19, "Alemania", "https://loremflickr.com/300/300/germanyflag", "Europa", "Berlín", 357022, 83783942),
            Pais(20, "Turquía", "https://loremflickr.com/300/300/turkeyflag", "Asia/Europa", "Ankara", 783356, 84339067),
            Pais(21, "España", "https://loremflickr.com/300/300/spainflag", "Europa", "Madrid", 505992, 46754778)

        )
    }

}