package eu.tutorials.practicekotlin

fun main() {
    // TH1: Chuyển đổi từ Celsius sang Fahrenheit
    // Cthuc: °F = 9/5 (°C) + 32
    val IntialCelsius = 25.0 // Nhiệt độ ban đầu là 25 độ Celsius
    val CelsiusToFahrenheit = { celsius: Double -> 9.0 / 5 * celsius + 32 }
    printFinalTemperature(
        initialMeasurement = IntialCelsius,
        initialUnit = "Celsius",
        finalUnit = "Fahrenheit",
        conversionFormula = CelsiusToFahrenheit
    )

    // TH2: Chuyển đổi từ Kelvin sang Celsius
    // Cthuc: °C = K – 273.15
    val IntialKevin = 20.0
    val KelvinToCelsius = { kelvin: Double -> kelvin - 273.15 }
    printFinalTemperature(
        initialMeasurement = IntialKevin,
        initialUnit = "Kelvin",
        finalUnit = "Celsius",
        conversionFormula = KelvinToCelsius
    )

    // TH3: Chuyển đổi từ Fahrenheit sang Kelvin
    // Cthuc: K = 5/9 (°F – 32) + 273.15
    val IntialFahrenheit = 30.0
    val FahtenheitToKelvin = { fahrenheit: Double -> 5 / 9 * (fahrenheit - 32) + 273.15 }
    printFinalTemperature(
        initialMeasurement = IntialFahrenheit,
        initialUnit = "Fahrenheit",
        finalUnit = "Kelvin",
        conversionFormula = FahtenheitToKelvin
    )

}


fun printFinalTemperature(
    initialMeasurement: Double,
    initialUnit: String,
    finalUnit: String,
    conversionFormula: (Double) -> Double
) {
    val finalMeasurement = String.format("%2f", conversionFormula(initialMeasurement))
    println("$initialMeasurement degress $initialUnit is $finalMeasurement degress $finalUnit")
}
