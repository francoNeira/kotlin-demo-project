package com.demo.conversor.units

/**
 * Unidad de longitud kilómetro.
 */
class KilometerUnit(value: Double) : LengthUnit(value) {

    /**
     * Retorna el valor de conversión correspondiente a la unidad de longitud recibida.
     *
     * @param unit la unidad de longitud.
     * @return el valor de conversión correspondiente a la unidad.
     */
    companion object {
        fun getValueConversionFor(unit: LengthUnit): Double {
            return when (unit) {
                is MileUnit -> 1.609
                else -> 1.0
            }
        }
    }

}
