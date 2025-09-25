package com.example.myapplication.data

data class Product(
    val id: String,
    val name: String,
    val description: String,
    val price: Double,
    val imageUrl: String,
    val category: String,
    val index: Int // Global index for bi-directional interaction
)

data class Category(
    val name: String,
    val products: List<Product>,
    val startIndex: Int, // Starting index of this category
    val endIndex: Int    // Ending index of this category
)

data class ProductListResponse(
    val categories: Map<String, Category>
)
