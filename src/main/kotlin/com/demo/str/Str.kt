package com.demo.str

import java.text.Normalizer

class Str {

    /**
     * Retorna la cadena de caracteres recibida en orden inverso.
     *
     * @param string la cadena de caracteres.
     * @return la cadena de caracteres en orden inverso.
     */
    fun revert(string: String) = string.reversed()

    /**
     * Retorna verdadero sí y solo sí la cadena de caracteres recibida es un palíndromo.
     *
     * @param string la cadena de caracteres.
     * @return verdadero si la cadena de caracteres es un palíndromo.
     */
    fun isPalindrome(string: String): Boolean {
        val formattedString = string.removeSpecialCharacters()
        return formattedString.equals(revert(formattedString), true)
    }

    /**
     * Retorna el número de vocales en la cadena de caracteres recibida.
     *
     * @param string la cadena de caracteres.
     * @return el número de vocales en la cadena de caracteres.
     */
    fun vowels(string: String): Int {
        val vowels = "AEIOU"
        return string.removeSpecialCharacters().count { char -> vowels.contains(char, true) }
    }

    /**
     * Retorna el número de palabras en la cadena de caracteres recibida: cada palabra se encuentra separada
     * de otra por un espacio.
     *
     * @param string la cadena de caracteres.
     * @return el número de palabras en la cadena de caracteres.
     */
    fun words(string: String) = if (string.isBlank()) 0 else string.split(" ").size

    /**
     * Retorna el número de párrafos en la cadena de caracteres recibida: cada párrafo se encuentra separado
     * de otro por la cadena de caracteres '\n'.
     *
     * @param string la cadena de caracteres.
     * @return el número de párrafos en la cadena de caracteres.
     */
    fun paragraphs(string: String) =
            if (string.isBlank()) 0
            else string.windowed("\n".length) { if (it == "\n") 1 else 0 }.sum() + 1

    /**
     * Retorna la cadena de caracteres original sin caracteres especiales, reemplazándolos por sus versiones
     * "normales". Por ejemplo, el carácter especial 'á' es reemplazado por 'a'.
     *
     * @return la cadena de caracteres original sin caracteres especiales.
     */
    private fun String.removeSpecialCharacters() =
            Normalizer.normalize(this, Normalizer.Form.NFD)
                    .replace("\\p{Mn}+".toRegex(), "")

}
