package com.demo.conversor

import com.demo.conversor.units.KilometerUnit
import com.demo.conversor.units.MileUnit
import org.junit.Test
import kotlin.test.assertEquals

class ConversorTest {

    private val conversor = Conversor()

    @Test
    fun whenConversorReceives1MileItConvertsTheValueToKilometersAndReturns1Point609() {
        val mileValue = MileUnit(1.0)

        val expectedUnit = KilometerUnit(1.609)
        val actualUnit = conversor.convertToKilometerUnit(mileValue)

        assertEquals(expectedUnit.value(), actualUnit.value())
    }

    @Test
    fun whenConversorReceives1MileItReturnsTheSameValue() {
        val mileValue = MileUnit(1.0)

        val expectedUnit = MileUnit(1.0)
        val actualUnit = conversor.convertToMileUnit(mileValue)

        assertEquals(expectedUnit.value(), actualUnit.value())
    }

    @Test
    fun whenConversorReceives5KilometersItConvertsTheValueToMilesAndReturns3Point105() {
        val kilometerValue = KilometerUnit(5.0)

        val expectedUnit = MileUnit(3.105)
        val actualUnit = conversor.convertToMileUnit(kilometerValue)

        assertEquals(expectedUnit.value(), actualUnit.value())
    }

    @Test
    fun whenConversorReceives100KilometersItReturnsTheSameValue() {
        val kilometerValue = KilometerUnit(100.0)

        val expectedUnit = KilometerUnit(100.0)
        val actualUnit = conversor.convertToKilometerUnit(kilometerValue)

        assertEquals(expectedUnit.value(), actualUnit.value())
    }
}