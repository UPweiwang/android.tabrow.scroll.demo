package com.example.myapplication.viewmodel

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.myapplication.data.Product
import com.example.myapplication.data.ProductListResponse
import com.example.myapplication.data.ProductService
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.launch

data class ListItem(
    val type: ItemType,
    val product: Product? = null,
    val categoryName: String? = null
)

enum class ItemType {
    CATEGORY_HEADER,
    PRODUCT
}

data class ProductUiState(
    val isLoading: Boolean = false,
    val listItems: List<ListItem> = emptyList(),
    val categories: List<String> = emptyList(),
    val selectedCategory: String? = null,
    val error: String? = null
)

class ProductViewModel : ViewModel() {
    
    private val productService = ProductService()
    
    private val _uiState = MutableStateFlow(ProductUiState())
    val uiState: StateFlow<ProductUiState> = _uiState.asStateFlow()
    
    // For bi-directional interaction
    private val _scrollToIndex = MutableStateFlow<Int?>(null)
    val scrollToIndex: StateFlow<Int?> = _scrollToIndex.asStateFlow()
    
    init {
        loadProducts()
    }
    
    private fun loadProducts() {
        viewModelScope.launch {
            _uiState.value = _uiState.value.copy(isLoading = true, error = null)
            
            try {
                val response = productService.getList()
                val listItems = mutableListOf<ListItem>()
                val categoryNames = mutableListOf<String>()
                
                // Create list items with category headers and products
                response.categories.values.sortedBy { it.startIndex }.forEach { category ->
                    categoryNames.add(category.name)
                    
                    // Add category header
                    listItems.add(
                        ListItem(
                            type = ItemType.CATEGORY_HEADER,
                            categoryName = category.name
                        )
                    )
                    
                    // Add products for this category
                    category.products.forEach { product ->
                        listItems.add(
                            ListItem(
                                type = ItemType.PRODUCT,
                                product = product
                            )
                        )
                    }
                }
                
                _uiState.value = _uiState.value.copy(
                    isLoading = false,
                    listItems = listItems,
                    categories = categoryNames,
                    selectedCategory = categoryNames.firstOrNull()
                )
            } catch (e: Exception) {
                _uiState.value = _uiState.value.copy(
                    isLoading = false,
                    error = e.message ?: "Unknown error occurred"
                )
            }
        }
    }
    
    fun onCategorySelected(categoryName: String) {
        val currentState = _uiState.value
        if (currentState.selectedCategory != categoryName) {
            _uiState.value = currentState.copy(selectedCategory = categoryName)
            
            // Find the category header index
            val categoryHeaderIndex = currentState.listItems.indexOfFirst { 
                it.type == ItemType.CATEGORY_HEADER && it.categoryName == categoryName 
            }
            if (categoryHeaderIndex != -1) {
                _scrollToIndex.value = categoryHeaderIndex
            }
        }
    }
    
    fun onScrollPositionChanged(visibleIndex: Int) {
        val currentState = _uiState.value
        val listItem = currentState.listItems.getOrNull(visibleIndex)
        
        when (listItem?.type) {
            ItemType.CATEGORY_HEADER -> {
                if (currentState.selectedCategory != listItem.categoryName) {
                    _uiState.value = currentState.copy(selectedCategory = listItem.categoryName)
                }
            }
            ItemType.PRODUCT -> {
                if (currentState.selectedCategory != listItem.product?.category) {
                    _uiState.value = currentState.copy(selectedCategory = listItem.product?.category)
                }
            }
            null -> { /* Do nothing */ }
        }
    }
    
    fun onScrollCompleted() {
        _scrollToIndex.value = null
    }
}
