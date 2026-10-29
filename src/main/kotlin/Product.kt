package com.github.apermar1301

data class Product(
    val id: Long,
    val name: String,
    val price: Double,
    val quantity: Int,
) {
    init {
        require(id >= 0) { "Product id must be greater than zero" }
        require(name.isNotBlank()) { "Product name must not be empty" }
        require(price > 0.0) { "Product price must be greater than zero" }
        require(quantity >= 0) { "Product quantity must be greater than zero" }
    }
}

fun updateProduct(product: Product, percentage: Double): Product {
    require(percentage >= 0.0) { "Percentage must be greater than zero" }
    return product.copy(price = product.price * (1 + percentage / 100.0))
}

fun main() {
    val product = Product(0, "alvaro", 99.99, 1)
    println(product.toString())
    println(updateProduct(product, 20.00).toString())
}