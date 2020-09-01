package com.demo.conversor

import com.demo.conversor.units.KilometerUnit
import com.demo.conversor.units.LengthUnit
import com.demo.conversor.units.MileUnit

/**
 * Conversor de unidades de longitud.
 */
class Conversor {

    /**
     * Retorna el valor de la unidad de longitud recibida convertida a kilómetros.
     *
     * @param unit la unidad de longitud a convertir.
     * @return la unidad convertida a kilómetros.
     */
    fun convertToKilometerUnit(unit: LengthUnit): KilometerUnit {
        return KilometerUnit(unit.value() * KilometerUnit.getValueConversionFor(unit))
    }

    /**
     * Retorna el valor de la unidad de longitud recibida convertida a millas.
     *
     * @param unit la unidad de longitud a convertir.
     * @return la unidad convertida a millas.
     */
    fun convertToMileUnit(unit: LengthUnit): MileUnit {
        return MileUnit(unit.value() * MileUnit.getValueConversionFor(unit))
    }

}
