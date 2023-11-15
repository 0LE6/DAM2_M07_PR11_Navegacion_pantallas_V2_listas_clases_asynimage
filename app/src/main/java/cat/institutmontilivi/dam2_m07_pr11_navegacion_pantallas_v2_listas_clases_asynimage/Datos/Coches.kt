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
            Coche(1, "Maserati Ghibli", "maserati_ghibli.jpg", Color.Red, 2022, "Italia", "V8", 12, 150000),
            Coche(2, "Ferrari 488", "ferrari_488.jpg", Color.Red, 2022, "Italia", "V8", 15, 250000),
            Coche(3, "Lamborghini Huracan", "lamborghini_huracan.jpg", Color.Yellow, 2022, "Italia", "V10", 14, 200000),
            Coche(4, "Porsche 911", "porsche_911.jpg", Color.Blue, 2022, "Alemania", "Flat-6", 10, 130000),
            Coche(5, "Audi R8", "audi_r8.jpg", Color.Gray, 2022, "Alemania", "V10", 13, 160000),
            Coche(6, "Mercedes-AMG GT", "mercedes_amg_gt.jpg", Color.Black, 2022, "Alemania", "V8", 11, 140000),
            Coche(7, "BMW M4", "bmw_m4.jpg", Color.Blue, 2022, "Alemania", "Inline-6", 12, 120000),
            Coche(8, "Jaguar F-Type", "jaguar_f_type.jpg", Color.Red, 2022, "Reino Unido", "V6", 11, 110000),
            Coche(9, "Aston Martin Vantage", "aston_martin_vantage.jpg", Color.Blue, 2022, "Reino Unido", "V8", 12, 180000),
            Coche(10, "Chevrolet Corvette", "chevrolet_corvette.jpg", Color.Red, 2022, "Estados Unidos", "V8", 13, 100000),
            Coche(11, "Ford Mustang", "ford_mustang.jpg", Color.Blue, 2022, "Estados Unidos", "V8", 14, 90000),
            Coche(12, "Dodge Challenger", "dodge_challenger.jpg", Color.Black, 2022, "Estados Unidos", "V8", 15, 95000),
            Coche(13, "Nissan GT-R", "nissan_gtr.jpg", Color.Gray, 2022, "Japón", "V6", 14, 120000),
            Coche(14, "Toyota Supra", "toyota_supra.jpg", Color.Yellow, 2022, "Japón", "Inline-6", 12, 80000),
            Coche(15, "Honda NSX", "honda_nsx.jpg", Color.Red, 2022, "Japón", "V6", 11, 160000),
            Coche(16, "McLaren 720S", "mclaren_720s.jpg", Color.Blue, 2022, "Reino Unido", "V8", 13, 300000),
            Coche(17, "Bugatti Chiron", "bugatti_chiron.jpg", Color.Black, 2022, "Francia", "W16", 8, 3000000),
            Coche(18, "Koenigsegg Jesko", "koenigsegg_jesko.jpg", Color.Gray, 2022, "Suecia", "V8", 10, 2800000),
            Coche(19, "Pagani Huayra", "pagani_huayra.jpg", Color.Blue, 2022, "Italia", "V12", 9, 2500000),
            Coche(20, "Ferrari LaFerrari", "ferrari_laferrari.jpg", Color.Red, 2022, "Italia", "V12", 10, 3500000),
            Coche(21, "Porsche Taycan", "porsche_taycan.jpg", Color.Blue, 2022, "Alemania", "Electrico", 15, 120000)
        )
    }
}