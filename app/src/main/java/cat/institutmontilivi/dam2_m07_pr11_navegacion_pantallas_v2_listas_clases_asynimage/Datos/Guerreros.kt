package cat.institutmontilivi.dam2_m07_pr11_navegacion_pantallas_v2_listas_clases_asynimage.Datos

import androidx.compose.ui.graphics.Color

data class Guerrero(
    val id : Int,
    val nombre : String,
    val foto : String, // dirección de la imagen
    val color : Color,
    val edad : Int,
    val fuerza : Int,
    val resistencia : Int,
    val ataque : Int,
    val defensa : Int
)

class Guerreros {
    companion object {

        public val datos =
            listOf(
                Guerrero(1,
                    "Espada misteriosa",
                    "https://upload.wikimedia.org/wikipedia/commons/thumb/8/89/Bandera_de_Espa%C3%B1a.svg/300px-Bandera_de_España.svg.png",
                    Color.Blue,
                    23, 56, 45, 69, 89
                ),
                Guerrero(1,
                    "Espasa misteriosa",
                    "https://loremflickr.com/300/300/warrior?lock=27",
                    Color.Blue,
                    23, 56, 45, 69, 89),
                Guerrero(1,
                    "Espasa misteriosa",
                    "https://loremflickr.com/300/300/warrior?lock=28",
                    Color.Blue,
                    23, 56, 45, 69, 89),
                Guerrero(1,
                    "Espasa misteriosa",
                    "https://loremflickr.com/300/300/warrior?lock=29",
                    Color.Blue,
                    23, 56, 45, 69, 89),
                Guerrero(1,
                    "Espasa misteriosa",
                    "https://loremflickr.com/300/300/warrior?lock=30",
                    Color.Blue,
                    23, 56, 45, 69, 89)

            )

    }
}