package com.github.apermar1301

data class Employee(
    val id: Long,
    val name: String,
    val position: String,
    val salary: Double,
) {
    init {
        require(id >= 0) { "Id must be non-negative" }
        require(name.isNotBlank()) { "Name must not be blank" }
        require(position.isNotBlank()) { "Position must not be blank" }
        require(salary >= 0.0) { "Salary must be at least 0" }
    }
}

fun main() {
    val employee = Employee(0L, "Alvaro", "CEO", 999.99)
    val (_, name, _, salary) = employee
    println("Name: $name, salary: $salary")
}


