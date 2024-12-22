interface Weather {
    fun getForecast(): String
}

class Sunny : Weather {
    override fun getForecast(): String {
        return "Słonecznie, idealna pogoda na spacer!"
    }
}

class Rainy : Weather {
    override fun getForecast(): String {
        return "Deszczowo, weź parasol!"
    }
}

class Cloudy : Weather {
    override fun getForecast(): String {
        return "Pochmurno, może padać."
    }
}

data class City(val name: String, val weather: Weather)


fun main(){

    val cities = listOf(
        City("Warszawa", Sunny()),
        City("Gdańsk", Rainy()),
        City("Kraków", Cloudy())
    )

    println("Wybierz miasto:")
    cities.forEachIndexed { index, city -> println("${index + 1}. ${city.name}") }

    val cityChoice = readLine()?.toIntOrNull()

    cityChoice?.takeIf { it in 1..cities.size }?.let {
        val selectedCity = cities[it - 1]
        println("Prognoza pogody dla miasta ${selectedCity.name}: ${selectedCity.weather.getForecast()}")
    } ?: println("Niepoprawny wybór.")

}