package com.demo.socialNetworkUser

/**
 * Lista de usuarios de red social.
 */
class UserList {

    private val users: MutableList<User>

    constructor(vararg users: User) { this.users = users.toMutableList() }

    // Getters
    fun users() = users

    // Override
    override fun equals(any: Any?) = any is UserList && any.users().all { users.contains(it) }
    override fun toString(): String = "UserList($users)"

    // Métodos
    /**
     * Agrega el usuario recibido.
     *
     * @param user el usuario.
     */
    fun add(user: User) { users.add(user) }

    /**
     * Retorna la lista de usuarios que están presentes tanto en la lista de usuarios recibida
     * como en esta.
     *
     * @return los usuarios presentes en la lista recibida y la actual.
     */
    fun sameUsers(userList: UserList) = users.filter { userList.users().contains(it) }

}
