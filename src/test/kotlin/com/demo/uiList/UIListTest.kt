package com.demo.uiList

import org.junit.Test
import kotlin.test.assertEquals

class UIListTest {

    private val uiList = UILIst()
    private val ascSortedList = listOf(1, 2, 3, 4, 5)
    private val descSortedList = listOf(10, 9, 8)
    private val unsortedList = listOf(3, 11, 5, 4)

    @Test
    fun whenUIListReceivesSortedListsItReturnsTrue() {
        val expectedValue = true
        val actualValueForAscList = uiList.isSorted(ascSortedList)
        val actualValueForDescList = uiList.isSorted(descSortedList)

        assertEquals(expectedValue, actualValueForAscList)
        assertEquals(expectedValue, actualValueForDescList)
    }

    @Test
    fun whenUIListReceivesAnUnsortedListItReturnsFalse() {
        val expectedValue = false
        val actualValue = uiList.isSorted(unsortedList)

        assertEquals(expectedValue, actualValue)
    }

    @Test
    fun whenUIListIsRequiredToSortAListInAscOrderItReturnsItSortedInThatOrder() {
        val expectedList = listOf(3, 4, 5, 11)
        val actualList = uiList.sort(unsortedList, true)

        assertEquals(expectedList, actualList)
    }

    @Test
    fun whenUIListIsRequiredToSortAListInDescOrderItReturnsItSortedInThatOrder() {
        val expectedList = listOf(11, 5, 4, 3)
        val actualList = uiList.sort(unsortedList, false)

        assertEquals(expectedList, actualList)
    }

    @Test
    fun whenUIListIsRequiredToFilterPrimeNumbersFromListItReturnsA3An11AndA5() {
        val expectedList = listOf(2, 3, 5)
        val actualList = uiList.filterPrimes(ascSortedList)

        assertEquals(expectedList, actualList)
    }

    @Test
    fun whenUIListIsRequiredToRaiseNumbersFromListItReturnsAn100An81AndA64() {
        val expectedList = listOf(100, 81, 64)
        val actualList = uiList.powMap(descSortedList, 2)

        assertEquals(expectedList, actualList)
    }

    @Test
    fun whenUIListIsRequiredToMapAListMultiplyingItsValuesByTheirIndexesItReturns52() {
        val expectedValue = 52
        val actualValue = uiList.sumProdPos(descSortedList)

        assertEquals(expectedValue, actualValue)
    }
}