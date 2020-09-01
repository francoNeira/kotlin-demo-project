package com.demo.conversor.units

/**
 * Unidad de longitud milla.
 */
class MileUnit(value: Double) : LengthUnit(value) {

    /**
     * Retorna el valor de conversión correspondiente a la unidad de longitud recibida.
     *
     * @param unit la unidad de longitud.
     * @return el valor de conversión correspondiente a la unidad.
     */
    companion object {
        fun getValueConversionFor(unit: LengthUnit): Double {
            return when (unit) {
                is KilometerUnit -> 0.621
                else -> 1.0
            }
        }
    }

}
