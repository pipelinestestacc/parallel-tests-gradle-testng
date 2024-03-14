package big.pckg.purposes.succeeded.looooong.naaaaame

import com.jetbrains.converters.regular.pckg.name.CelsiusToFahrenheitConverter
import org.testng.Assert
import org.testng.annotations.DataProvider
import org.testng.annotations.Test
import kotlin.random.Random

class CelsiusToFahrenheitTest_200tests {

    @Test(dataProvider = "conversionDataCelsiusToFahrenheit")
    fun testCelsiusToFahrenheitConversion(celsius: Double, expectedFahrenheit: Double) {
        val result = CelsiusToFahrenheitConverter.convert(celsius)
        Assert.assertEquals(result, expectedFahrenheit, 0.001, "Conversion from Celsius to Fahrenheit is incorrect")
    }

    @DataProvider(name = "conversionDataCelsiusToFahrenheit")
    fun conversionDataCelsiusToFahrenheit(): Array<Array<Double>> {
        val testData = mutableListOf<Array<Double>>()

        // Add 200 test cases
        for (i in 0 until 200) {
            val celsius = Random.nextDouble(-273.15, 1000.0) // Generate random Celsius value between -273.15°C and 1000°C
            val fahrenheit = celsius * 9 / 5 + 32
            testData.add(arrayOf(celsius, fahrenheit))
        }

        return testData.toTypedArray()
    }
}
