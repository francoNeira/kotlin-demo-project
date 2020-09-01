package com.demo.conversor.units

class MileUnit(value: Double) : LengthUnit(value) {

    companion object {
        fun getValueConversionFor(unit: LengthUnit): Double {
            return when (unit) {
                is KilometerUnit -> 0.621
                else -> 1.0
            }
        }
    }

}
