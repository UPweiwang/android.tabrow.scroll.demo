# Bi-directional Top Tab ↔ Scroll List App

A Material Design 3 Android app that demonstrates bi-directional interaction between top tabs and a scrollable product list.

## Features

- **Bi-directional Navigation**: Top tabs automatically update based on the currently visible product category, and clicking a tab scrolls to the first item of that category
- **Material Design 3**: Uses modern Material Design 3 components including SegmentedButton, Card, and TopAppBar
- **MVVM Architecture**: Clean separation of concerns with ViewModel, Repository pattern, and reactive UI
- **Mock Data Service**: Simulates network calls with realistic product data across multiple categories

## Architecture

### Data Layer
- `Product.kt`: Data models for Product, Category, and API response
- `ProductService.kt`: Mock service that simulates network calls with realistic product data

### ViewModel Layer
- `ProductViewModel.kt`: Manages UI state and bi-directional scroll logic
- Handles category selection and scroll position tracking
- Provides reactive state management with StateFlow

### UI Layer
- `ProductScreen.kt`: Main screen with top tabs and scrollable product list
- `ProductItem.kt`: Individual product card component
- Uses Material Design 3 components throughout

## Key Implementation Details

### Bi-directional Interaction
1. **Scroll → Tab**: `LazyColumn` scroll position is tracked to update the selected tab
2. **Tab → Scroll**: Clicking a tab triggers smooth scroll to the first item of that category
3. **Index-based Connection**: Each product has a global index for precise positioning

### Material Design 3 Components Used
- `SegmentedButton` for category tabs
- `Card` for product items
- `TopAppBar` for the app header
- `LazyColumn` for efficient scrolling
- `CircularProgressIndicator` for loading states

## Data Structure

The mock service provides products across 4 categories:
- **Electronics**: iPhone, MacBook, AirPods, iPad
- **Clothing**: T-shirts, Jeans, Jackets
- **Books**: Programming guides and technical books
- **Home & Garden**: Coffee makers, garden tools

Each product includes:
- Name, description, price
- Category and global index
- Image URL (placeholder)

## Usage

1. Launch the app to see the product list with category tabs
2. Scroll through products - notice how the top tab updates automatically
3. Click on any category tab to scroll to the first product in that category
4. The interaction works smoothly in both directions

This implementation demonstrates a clean, maintainable approach to complex UI interactions using modern Android development practices.
