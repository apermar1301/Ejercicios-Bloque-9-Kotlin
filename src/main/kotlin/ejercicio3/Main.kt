package com.github.apermar1301.ejercicio3

fun main() {
    val elephant = Elephant("Dumbo", 30)
    println(elephant.makeSound())
    println(elephant.info())

    val lion = Lion("Simba", 10)
    println(lion.makeSound())
    println(lion.info())
}