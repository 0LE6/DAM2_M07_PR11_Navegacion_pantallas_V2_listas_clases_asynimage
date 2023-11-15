package cat.institutmontilivi.dam2_m07_pr11_navegacion_pantallas_v2_listas_clases_asynimage.Datos

import androidx.compose.ui.graphics.Color

data class Coche(
    val id : Int,
    val nom : String,
    val foto : String, // dirección de la imagen
    val color : Color,
    val data : Int,
    val pais : String,
    val motor : String,
    val consumo : Int,
    val precio : Int
)

class Coches {

    companion object {

        val datos = listOf(
            Coche(1, "Maserati Ghibli", "https://loremflickr.com/300/300/maserati", Color.Red, 2022, "Italia", "V8", 12, 150000),
            Coche(2, "Ferrari 488", "https://loremflickr.com/300/300/ferrari", Color.Red, 2022, "Italia", "V8", 15, 250000),
            Coche(3, "Lamborghini Huracan", "https://loremflickr.com/300/300/Lamborghini", Color.Yellow, 2022, "Italia", "V10", 14, 200000),
            Coche(4, "Porsche 911", "https://loremflickr.com/300/300/porsche", Color.Blue, 2022, "Alemania", "Flat-6", 10, 130000),
            Coche(5, "Audi R8", "https://loremflickr.com/300/300/audi", Color.Gray, 2022, "Alemania", "V10", 13, 160000),
            Coche(6, "Mercedes-AMG GT", "https://loremflickr.com/300/300/mercedes", Color.Black, 2022, "Alemania", "V8", 11, 140000),
            Coche(7, "BMW M4", "https://loremflickr.com/300/300/bmw", Color.Blue, 2022, "Alemania", "Inline-6", 12, 120000),
            Coche(8, "Jaguar F-Type", "jhttps://loremflickr.com/300/300/jaguarftype", Color.Red, 2022, "Reino Unido", "V6", 11, 110000),
            Coche(9, "Aston Martin Vantage","https://loremflickr.com/300/300/aston_martin", Color.Blue, 2022, "Reino Unido", "V8", 12, 180000),
            Coche(10, "Chevrolet Corvette", "https://loremflickr.com/300/300/corvette", Color.Red, 2022, "Estados Unidos", "V8", 13, 100000),
            Coche(11, "Ford Mustang", "https://loremflickr.com/300/300/ford_mustang", Color.Blue, 2022, "Estados Unidos", "V8", 14, 90000),
            Coche(12, "Dodge Challenger", "https://loremflickr.com/300/300/dodge_challenger", Color.Black, 2022, "Estados Unidos", "V8", 15, 95000),
            Coche(13, "Nissan GT-R", "https://loremflickr.com/300/300/gtr", Color.Gray, 2022, "Japón", "V6", 14, 120000),
            Coche(14, "Toyota Supra", "https://loremflickr.com/300/300/toyota_supra", Color.Yellow, 2022, "Japón", "Inline-6", 12, 80000),
            Coche(15, "Honda NSX", "https://loremflickr.com/300/300/honda_nsx", Color.Red, 2022, "Japón", "V6", 11, 160000),
            Coche(16, "McLaren 720S", "https://loremflickr.com/300/300/mclaren", Color.Blue, 2022, "Reino Unido", "V8", 13, 300000),
            Coche(17, "Bugatti Chiron", "https://loremflickr.com/300/300/bugatti_chiron", Color.Black, 2022, "Francia", "W16", 8, 3000000),
            Coche(18, "Koenigsegg Jesko", "https://loremflickr.com/300/300/koenigsegg", Color.Gray, 2022, "Suecia", "V8", 10, 2800000),
            Coche(19, "Pagani Huayra", "https://loremflickr.com/300/300/pagani", Color.Blue, 2022, "Italia", "V12", 9, 2500000),
            Coche(20, "Ferrari LaFerrari", "https://loremflickr.com/300/300/laferrari", Color.Red, 2022, "Italia", "V12", 10, 3500000),
            Coche(21, "Porsche Taycan", "https://loremflickr.com/300/300/taycan", Color.Blue, 2022, "Alemania", "Electrico", 15, 120000)
        )
    }
}