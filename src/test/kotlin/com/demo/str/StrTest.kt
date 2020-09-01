package com.demo.str

import org.junit.Test
import kotlin.test.assertEquals
import kotlin.test.assertFalse
import kotlin.test.assertTrue

class StrTest {

    private val str = Str()
    private val sInterfaces = "interfaces"
    private val sNeuquen = "Neuquén"
    private val emptyString = ""

    @Test
    fun whenStrIsAskedToReverseTheWordInterfacesItReturnsItSecafretni() {
        val expectedStr = "secafretni"
        val actualStr = str.revert(sInterfaces)

        assertEquals(expectedStr, actualStr)
    }

    @Test
    fun whenStrIsAskedToReverseAnEmptyStringItReturnsAnEmptyString() {
        val expectedStr = ""
        val actualStr = str.revert(emptyString)

        assertEquals(expectedStr, actualStr)
    }

    @Test
    fun whenStrIsAskedIfTheWordInterfacesIsPalindromeItReturnsFalse() {
        assertFalse { str.isPalindrome(sInterfaces) }
    }

    @Test
    fun whenStrIsAskedIFAnEmptyStringIsPalindromeItReturnsTrue() {
        assertTrue { str.isPalindrome(emptyString) }
    }

    @Test
    fun whenStrIsAskedIfTheWordNeuquenIsPalindromeItReturnsTrue() {
        assertTrue { str.isPalindrome(sNeuquen) }
    }

    @Test
    fun whenStrCountVowelsFromWordInterfacesItReturns4() {
        val expectedVowelsAmount = 4
        val actualVowelsAmount = str.vowels(sInterfaces)

        assertEquals(expectedVowelsAmount, actualVowelsAmount)
    }

    @Test
    fun whenStrCountVowelsFromAnEmptyStringItReturns0() {
        val expectedVowelsAmount = 0
        val actualVowelsAmount = str.vowels(emptyString)

        assertEquals(expectedVowelsAmount, actualVowelsAmount)
    }

    @Test
    fun whenStrCountVowelsFromWordNeuquenItReturns4() {
        val expectedVowelsAmount = 4
        val actualVowelsAmount = str.vowels(sNeuquen)

        assertEquals(expectedVowelsAmount, actualVowelsAmount)
    }

    @Test
    fun whenStrCountWordsOnStringConstruccionDeInterfacesDeUsuarioItReturns5() {
        val expectedAmount = 5
        val actualAmount = str.words("Construcción de Interfaces de Usuario")

        assertEquals(expectedAmount, actualAmount)
    }

    @Test
    fun whenStrCountWordsOnAnEmptyStringItReturns0() {
        val expectedAmount = 0
        val actualAmount = str.words(emptyString)

        assertEquals(expectedAmount, actualAmount)
    }

    @Test
    fun whenStrCountsParagraphsOnStringItReturns2() {
        val expectedAmount = 2
        val actualAmount = str.paragraphs("Bienvenidos!\nHasta luego!")

        assertEquals(expectedAmount, actualAmount)
    }

    @Test
    fun whenStrCountsParagraphsOnAnEmptyStringItReturns0() {
        val expectedAmount = 0
        val actualAmount = str.paragraphs(emptyString)

        assertEquals(expectedAmount, actualAmount)
    }

}