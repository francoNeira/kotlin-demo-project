package com.demo.conversor

import com.demo.conversor.units.KilometerUnit
import com.demo.conversor.units.LengthUnit
import com.demo.conversor.units.MileUnit

class Conversor {

    fun convertToKilometerUnit(unit: LengthUnit): KilometerUnit {
        return KilometerUnit(unit.value() * KilometerUnit.getValueConversionFor(unit))
    }

    fun convertToMileUnit(unit: LengthUnit): MileUnit {
        return MileUnit(unit.value() * MileUnit.getValueConversionFor(unit))
    }

}
