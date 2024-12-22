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




fun main(){



}