package com.demo.uiList

import kotlin.math.pow
import kotlin.math.roundToInt

/**
 * Gestor de listas de enteros.
 */
class UILIst {

    // Métodos
    /**
     * Retorna verdadero si, y solo si, la lista recibida está ordenada.
     *
     * @param list la lista a evaluar.
     * @return verdadero si la lista está ordenada.
     */
    fun isSorted(list: List<Int>) = list.sorted() == list || list.sortedDescending() == list

    /**
     * Retorna la lista recibida ordenada, de forma ascendente o descendente según lo especificado.
     *
     * @param list la lista a ordenar.
     * @param asc criterio para ordenar ascendentemente.
     * @return la lista ordenada, ascendente o descendentemente según lo especificado.
     */
    fun sort(list: List<Int>, asc: Boolean) = if (asc) list.sorted() else list.sortedDescending()

    /**
     * Retorna la lista recibida con solo los números primos.
     *
     * @param list la lista a filtrar.
     * @return la lista con solo números primos.
     */
    fun filterPrimes(list: List<Int>) = list.filter { isPrimeNumber(it) }

    /**
     * Retorna la lista recibida, elevando cada uno de sus valores a la potencia especificada.
     *
     * @param list la lista con valores a elevar.
     * @param power la potencia a aplicar.
     * @return la lista con sus valores elevados a la potencia especificada.
     */
    fun powMap(list: List<Int>, power: Int) = list.map { it.toDouble().pow(power).roundToInt() }

    /**
     * Retorna la lista recibida, multiplicando cada uno de sus valores por su posición en la lista.
     *
     * @param list la lista con valores a multiplicar.
     * @return la lista con sus valores multiplicados por su posición en la lista.
     */
    fun sumProdPos(list: List<Int>) = list.map { it * (list.indexOf(it) + 1) }.sum()

    // Métodos auxiliares
    /**
     * Retorna verdadero si, y solo si, el número recibido es un número primo.
     *
     * @param number el número a evaluar.
     * @return verdadero si el número es un número primo.
     */
    private fun isPrimeNumber(number: Int): Boolean {
        if (number <= 1) return false
        else
            for (n in 2..number / 2)
                if (number % n == 0)
                    return false
            return true
    }
}
