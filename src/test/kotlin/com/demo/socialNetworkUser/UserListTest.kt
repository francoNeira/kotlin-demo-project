package com.demo.socialNetworkUser

import org.junit.Test
import java.time.LocalDate
import kotlin.test.assertEquals

class UserListTest {

    // Inicialización de los usuarios
    private val messi = User(
            "Lionel Messi",
            "leo.messi",
            "lionel.messi@gmail.com",
            LocalDate.parse("1987-06-24")
    )
    private val suarez = User(
            "Luis Suarez",
            "lucho.suarez",
            "luis.suarez@gmail.com",
            LocalDate.parse("1987-01-24")
    )
    private val aguero = User(
            "Sergio Agüero",
            "kun.aguero",
            "sergio.aguero@hotmail.com",
            LocalDate.parse("1988-06-02")
    )

    // Inicialización de listas de usuarios
    private val userList1 = UserList(messi, suarez)
    private val userList2 = UserList(messi, suarez)
    private val userList3 = UserList(aguero)
    private val userList4 = UserList(aguero, suarez, messi)

    @Test
    fun whenUsersFromAnUserListAreRequiredItReturnsThemCorrectly() {
        val expectedUsers = listOf(messi, suarez)
        val actualUsers = userList1.users()

        assertEquals(expectedUsers, actualUsers)
    }

    @Test
    fun whenAnUserListIsComparedToCheckIfItIsEqualToAnotherWithSameUsersItReturnsTrue() {
        val expectedValue = true
        val actualValue = userList1.equals(userList2)

        assertEquals(expectedValue, actualValue)
    }

    @Test
    fun whenAnUserListIsComparedToCheckIfItIsEqualToAnotherWithSameUsersItReturnsFalse() {
        val expectedValue = false
        val actualValue = userList1.equals(userList3)

        assertEquals(expectedValue, actualValue)
    }

    @Test
    fun whenAnUserListReceivesAnUserItAddsItCorrectly() {
        userList1.add(aguero)

        val expectedUsers = listOf(messi, suarez, aguero)
        val actualUsers = userList1.users()

        assertEquals(expectedUsers, actualUsers)
    }

    @Test
    fun whenAnUserListIsRequiredToReturnTheSameUsersThanAnotherListContainsItReturnsMessiAndSuarez() {
        val expectedUsers = listOf(messi, suarez)
        val actualUsers = userList1.sameUsers(userList4)

        assertEquals(expectedUsers, actualUsers)
    }
}