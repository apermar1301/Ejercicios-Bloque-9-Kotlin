package com.github.apermar1301.ejercicio3

abstract class Animal(
    val name: String,
    val age: Int,
) {
    init {
        require(name.isNotBlank()) { "name ($name) is blank" }
        require(age >= 0) { "age ($age) is negative" }
    }

    abstract fun makeSound(): String

    fun info(): String = "$name, $age"

}