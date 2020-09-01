package com.demo.conversor.units

class KilometerUnit(value: Double) : LengthUnit(value) {

    companion object {
        fun getValueConversionFor(unit: LengthUnit): Double {
            return when (unit) {
                is MileUnit -> 1.609
                else -> 1.0
            }
        }
    }

}
