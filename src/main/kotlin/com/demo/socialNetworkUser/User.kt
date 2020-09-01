package com.demo.socialNetworkUser

import java.time.LocalDate
import java.time.Period

class User(
        private val fullName: String,
        private val username: String,
        private val email: String,
        private val birthday: LocalDate) {

    private val followers = UserList()
    private val following = UserList()

    // Getters
    fun fullName() = fullName
    fun username() = username
    fun email() = email
    fun birthday() = birthday
    fun followers() = followers
    fun following() = following

    // Override
    override fun toString() = "User(" +
            "fullName='$fullName', " +
            "username='$username', " +
            "email='$email', " +
            "birthday=$birthday" +
            ")"

    // Métodos
    /**
     * Agrega el usuario a recibido a la lista de usuarios en seguimiento.
     *
     * @param user el usuario a seguir.
     */
    fun follow(user: User) {
        following.add(user)
        user.addToFollowers(this)
    }

    /**
     * Retorna la edad del usuario.
     *
     * @return la edad del usuario.
     */
    fun age() = Period.between(birthday, LocalDate.now()).years

    /**
     * Retorna verdadero si, y solo si, el usuario tiene email registrado en el dominio recibido.
     *
     * @param domain el dominio a evaluar.
     * @return verdadero si el usuario tiene email registrado en el dominio.
     */
    fun hasEmailFrom(domain: String) = email.endsWith("$domain.com")

    /**
     * Retorna la lista de seguidores seguidos por el usuario.
     *
     * @return los seguidores seguidos por el usuario.
     */
    fun followedFollowers() = followers.sameUsers(following)

    //Métodos auxiliares
    /**
     * Agrega el usuario recibido a la lista de usuarios seguidores.
     *
     * @param user el usuario seguidor.
     */
    private fun addToFollowers(user: User) = followers.add(user)

}
