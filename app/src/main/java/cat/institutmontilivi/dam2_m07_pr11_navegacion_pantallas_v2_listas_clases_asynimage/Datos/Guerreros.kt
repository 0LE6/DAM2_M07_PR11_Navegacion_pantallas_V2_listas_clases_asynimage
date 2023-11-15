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
                Guerrero(1, "Espada misteriosa", "https://loremflickr.com/300/300/warrior?lock=27", Color.Blue, 23, 56, 45, 69, 89),
                Guerrero(2, "Espada letal", "https://loremflickr.com/300/300/warrior?lock=28", Color.Red, 28, 60, 42, 72, 85),

                Guerrero(3, "Guerrero implacable", "https://loremflickr.com/300/300/warrior?lock=29", Color.Green, 30, 65, 40, 70, 90),
                Guerrero(4, "Héroe legendario", "https://loremflickr.com/300/300/warrior?lock=30", Color.Black, 25, 55, 50, 75, 88),
                Guerrero(5, "Místico guerrero", "https://loremflickr.com/300/300/warrior?lock=31", Color.Yellow, 27, 58, 48, 68, 92),
                Guerrero(6, "Espadachín de la noche", "https://loremflickr.com/300/300/warrior?lock=32", Color.Blue, 26, 54, 47, 71, 87),
                Guerrero(7, "Guardián de la luz", "https://loremflickr.com/300/300/warrior?lock=33", Color.White, 29, 57, 44, 73, 91),
                Guerrero(8, "Demonio enmascarado", "https://loremflickr.com/300/300/warrior?lock=34", Color.Red, 31, 62, 41, 74, 86),
                Guerrero(9, "Guerrero del viento", "https://loremflickr.com/300/300/warrior?lock=35", Color.Green, 24, 59, 46, 67, 93),
                Guerrero(10, "Destructor de mundos", "https://loremflickr.com/300/300/warrior?lock=36", Color.Black, 32, 61, 43, 76, 89),
                Guerrero(11, "Cazador de sombras", "https://loremflickr.com/300/300/warrior?lock=37", Color.Yellow, 28, 56, 45, 69, 88),
                Guerrero(12, "Paladín divino", "https://loremflickr.com/300/300/warrior?lock=38", Color.Blue, 30, 60, 42, 72, 85),
                Guerrero(13, "Maestro del sigilo", "https://loremflickr.com/300/300/warrior?lock=39", Color.White, 27, 65, 40, 70, 90),
                Guerrero(14, "Ninja enmascarado", "https://loremflickr.com/300/300/warrior?lock=40", Color.Red, 29, 55, 50, 75, 92),
                Guerrero(15, "Guerrero de la tormenta", "https://loremflickr.com/300/300/warrior?lock=41", Color.Green, 25, 58, 48, 68, 87),
                Guerrero(16, "Campeón indomable", "https://loremflickr.com/300/300/warrior?lock=42", Color.Black, 28, 54, 47, 71, 91),
                Guerrero(17, "Reina guerrera", "https://loremflickr.com/300/300/warrior?lock=43", Color.Yellow, 26, 57, 44, 73, 86),
                Guerrero(18, "Señor de la oscuridad", "https://loremflickr.com/300/300/warrior?lock=44", Color.Blue, 31, 62, 41, 74, 93),
                Guerrero(19, "Guardián del fuego", "https://loremflickr.com/300/300/warrior?lock=45", Color.White, 29, 59, 46, 67, 89),
                Guerrero(20, "Infiltrado sombrío", "https://loremflickr.com/300/300/warrior?lock=46", Color.Red, 33, 61, 43, 76, 88),
                Guerrero(21, "Paladín justiciero", "https://loremflickr.com/300/300/warrior?lock=47", Color.Green, 27, 56, 45, 69, 85)

            )

    }
}