package com.demo.socialNetworkUser

import org.junit.Before
import org.junit.Test
import java.time.LocalDate
import kotlin.test.assertEquals

class UserTest {

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
    private val pagani = User(
            "Horacio Pagani",
            "horacio.pagani",
            "horacio.pagani@gmail.com",
            LocalDate.parse("1955-11-10")
    )

    // Seguimiento en red social
    @Before
    fun following() {
        messi.follow(suarez)
        messi.follow(aguero)
        suarez.follow(messi)
        aguero.follow(messi)
        pagani.follow(messi)
        pagani.follow(suarez)
        pagani.follow(aguero)
    }

    @Test
    fun whenInfoOfMessiUserIsRequiredThisUserReturnsItCorrectly() {
        val expectedFullName = "Lionel Messi"
        val expectedUsername = "leo.messi"
        val expectedEmail = "lionel.messi@gmail.com"
        val expectedBirthday = LocalDate.parse("1987-06-24")
        val expectedFollowers = UserList(suarez, aguero, pagani)
        val expectedFollowing = UserList(suarez, aguero)

        val actualFullName = messi.fullName()
        val actualUsername = messi.username()
        val actualEmail = messi.email()
        val actualBirthDay = messi.birthday()
        val actualFollowers = messi.followers()
        val actualFollowing = messi.following()

        assertEquals(expectedFullName, actualFullName)
        assertEquals(expectedUsername, actualUsername)
        assertEquals(expectedEmail, actualEmail)
        assertEquals(expectedBirthday, actualBirthDay)
        assertEquals(expectedFollowers, actualFollowers)
        assertEquals(expectedFollowing, actualFollowing)
    }

    @Test
    fun whenAgeOfMessiUserIsRequiredThisUserReturns33Years() {
        // Hoy, 30 de agosto de 2020, Lionel Messi tiene 33 años.
        // A futuro, el valor asignado a expectedAge debería modificarse.
        val expectedAge = 33
        val actualAge = messi.age()

        assertEquals(expectedAge, actualAge)
    }

    @Test
    fun whenEmailOfSuarezUserIsRequiredToCheckIfItIsFromGmailThisUserReturnsTrue() {
        val expectedValue = true
        val actualValue = suarez.hasEmailFrom("gmail")

        assertEquals(expectedValue, actualValue)
    }

    @Test
    fun whenEmailOfAgueroUserIsRequiredToCheckIfItIsFromGmailThisUserReturnsFalse() {
        val expectedValue = false
        val actualValue = aguero.hasEmailFrom("gmail")

        assertEquals(expectedValue, actualValue)
    }

    @Test
    fun whenFollowersOfMessiUserFollowedByHimAreRequiredThisUserReturnsSuarezAndAguero() {
        val expectedUsers = listOf(suarez, aguero)
        val actualUsers = messi.followedFollowers()

        assertEquals(expectedUsers, actualUsers)
    }
}