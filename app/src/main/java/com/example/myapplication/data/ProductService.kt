package com.example.myapplication.data

import kotlinx.coroutines.delay

class ProductService {
    
    suspend fun getList(): ProductListResponse {
        // Simulate network delay
        delay(1000)
        
        val categories = mutableMapOf<String, Category>()
        var globalIndex = 0
        
        // Electronics Category (12 products)
        val electronicsProducts = listOf(
            Product(
                id = "1",
                name = "iPhone 15 Pro",
                description = "Latest iPhone with advanced camera system",
                price = 999.99,
                imageUrl = "https://example.com/iphone15.jpg",
                category = "Electronics",
                index = globalIndex++
            ),
            Product(
                id = "2",
                name = "MacBook Pro M3",
                description = "Powerful laptop for professionals",
                price = 1999.99,
                imageUrl = "https://example.com/macbook.jpg",
                category = "Electronics",
                index = globalIndex++
            ),
            Product(
                id = "3",
                name = "AirPods Pro",
                description = "Wireless earbuds with noise cancellation",
                price = 249.99,
                imageUrl = "https://example.com/airpods.jpg",
                category = "Electronics",
                index = globalIndex++
            ),
            Product(
                id = "4",
                name = "iPad Air",
                description = "Versatile tablet for work and play",
                price = 599.99,
                imageUrl = "https://example.com/ipad.jpg",
                category = "Electronics",
                index = globalIndex++
            ),
            Product(
                id = "5",
                name = "Samsung Galaxy S24",
                description = "Premium Android smartphone with AI features",
                price = 899.99,
                imageUrl = "https://example.com/galaxy.jpg",
                category = "Electronics",
                index = globalIndex++
            ),
            Product(
                id = "6",
                name = "Dell XPS 13",
                description = "Ultrabook with stunning display",
                price = 1299.99,
                imageUrl = "https://example.com/dell.jpg",
                category = "Electronics",
                index = globalIndex++
            ),
            Product(
                id = "7",
                name = "Sony WH-1000XM5",
                description = "Noise-cancelling wireless headphones",
                price = 399.99,
                imageUrl = "https://example.com/sony.jpg",
                category = "Electronics",
                index = globalIndex++
            ),
            Product(
                id = "8",
                name = "Apple Watch Series 9",
                description = "Smartwatch with health monitoring",
                price = 399.99,
                imageUrl = "https://example.com/watch.jpg",
                category = "Electronics",
                index = globalIndex++
            ),
            Product(
                id = "9",
                name = "Nintendo Switch OLED",
                description = "Gaming console with vibrant OLED screen",
                price = 349.99,
                imageUrl = "https://example.com/switch.jpg",
                category = "Electronics",
                index = globalIndex++
            ),
            Product(
                id = "10",
                name = "Canon EOS R5",
                description = "Professional mirrorless camera",
                price = 3899.99,
                imageUrl = "https://example.com/canon.jpg",
                category = "Electronics",
                index = globalIndex++
            ),
            Product(
                id = "11",
                name = "LG OLED C3",
                description = "65-inch 4K OLED TV",
                price = 1999.99,
                imageUrl = "https://example.com/lg.jpg",
                category = "Electronics",
                index = globalIndex++
            ),
            Product(
                id = "12",
                name = "Steam Deck",
                description = "Handheld gaming PC",
                price = 649.99,
                imageUrl = "https://example.com/steam.jpg",
                category = "Electronics",
                index = globalIndex++
            )
        )
        
        val electronicsStartIndex = 0
        val electronicsEndIndex = electronicsProducts.size - 1
        categories["Electronics"] = Category(
            name = "Electronics",
            products = electronicsProducts,
            startIndex = electronicsStartIndex,
            endIndex = electronicsEndIndex
        )
        
        // Clothing Category (6 products)
        val clothingProducts = listOf(
            Product(
                id = "13",
                name = "Cotton T-Shirt",
                description = "Comfortable everyday t-shirt",
                price = 19.99,
                imageUrl = "https://example.com/tshirt.jpg",
                category = "Clothing",
                index = globalIndex++
            ),
            Product(
                id = "14",
                name = "Denim Jeans",
                description = "Classic blue denim jeans",
                price = 79.99,
                imageUrl = "https://example.com/jeans.jpg",
                category = "Clothing",
                index = globalIndex++
            ),
            Product(
                id = "15",
                name = "Winter Jacket",
                description = "Warm and stylish winter jacket",
                price = 149.99,
                imageUrl = "https://example.com/jacket.jpg",
                category = "Clothing",
                index = globalIndex++
            ),
            Product(
                id = "16",
                name = "Running Shoes",
                description = "Lightweight athletic shoes",
                price = 89.99,
                imageUrl = "https://example.com/shoes.jpg",
                category = "Clothing",
                index = globalIndex++
            ),
            Product(
                id = "17",
                name = "Hoodie",
                description = "Comfortable pullover hoodie",
                price = 49.99,
                imageUrl = "https://example.com/hoodie.jpg",
                category = "Clothing",
                index = globalIndex++
            ),
            Product(
                id = "18",
                name = "Dress Shirt",
                description = "Professional button-down shirt",
                price = 39.99,
                imageUrl = "https://example.com/shirt.jpg",
                category = "Clothing",
                index = globalIndex++
            )
        )
        
        val clothingStartIndex = electronicsProducts.size
        val clothingEndIndex = clothingStartIndex + clothingProducts.size - 1
        categories["Clothing"] = Category(
            name = "Clothing",
            products = clothingProducts,
            startIndex = clothingStartIndex,
            endIndex = clothingEndIndex
        )
        
        // Books Category (18 products - largest category)
        val booksProducts = listOf(
            Product(
                id = "19",
                name = "Programming Guide",
                description = "Complete guide to modern programming",
                price = 39.99,
                imageUrl = "https://example.com/programming.jpg",
                category = "Books",
                index = globalIndex++
            ),
            Product(
                id = "20",
                name = "Design Patterns",
                description = "Essential design patterns for developers",
                price = 49.99,
                imageUrl = "https://example.com/patterns.jpg",
                category = "Books",
                index = globalIndex++
            ),
            Product(
                id = "21",
                name = "Clean Code",
                description = "A handbook of agile software craftsmanship",
                price = 34.99,
                imageUrl = "https://example.com/cleancode.jpg",
                category = "Books",
                index = globalIndex++
            ),
            Product(
                id = "22",
                name = "System Design",
                description = "Scalable system design principles",
                price = 44.99,
                imageUrl = "https://example.com/systemdesign.jpg",
                category = "Books",
                index = globalIndex++
            ),
            Product(
                id = "23",
                name = "Data Structures",
                description = "Algorithms and data structures guide",
                price = 29.99,
                imageUrl = "https://example.com/datastructures.jpg",
                category = "Books",
                index = globalIndex++
            ),
            Product(
                id = "24",
                name = "JavaScript: The Good Parts",
                description = "Essential JavaScript programming guide",
                price = 24.99,
                imageUrl = "https://example.com/js.jpg",
                category = "Books",
                index = globalIndex++
            ),
            Product(
                id = "25",
                name = "React Patterns",
                description = "Modern React development patterns",
                price = 34.99,
                imageUrl = "https://example.com/react.jpg",
                category = "Books",
                index = globalIndex++
            ),
            Product(
                id = "26",
                name = "Python Cookbook",
                description = "Advanced Python programming techniques",
                price = 39.99,
                imageUrl = "https://example.com/python.jpg",
                category = "Books",
                index = globalIndex++
            ),
            Product(
                id = "27",
                name = "Machine Learning",
                description = "Introduction to ML algorithms",
                price = 54.99,
                imageUrl = "https://example.com/ml.jpg",
                category = "Books",
                index = globalIndex++
            ),
            Product(
                id = "28",
                name = "Database Design",
                description = "Relational database design principles",
                price = 44.99,
                imageUrl = "https://example.com/database.jpg",
                category = "Books",
                index = globalIndex++
            ),
            Product(
                id = "29",
                name = "DevOps Handbook",
                description = "Software delivery and operations guide",
                price = 49.99,
                imageUrl = "https://example.com/devops.jpg",
                category = "Books",
                index = globalIndex++
            ),
            Product(
                id = "30",
                name = "Microservices",
                description = "Building scalable microservices architecture",
                price = 39.99,
                imageUrl = "https://example.com/microservices.jpg",
                category = "Books",
                index = globalIndex++
            ),
            Product(
                id = "31",
                name = "Security Engineering",
                description = "Software security best practices",
                price = 59.99,
                imageUrl = "https://example.com/security.jpg",
                category = "Books",
                index = globalIndex++
            ),
            Product(
                id = "32",
                name = "Cloud Architecture",
                description = "Designing cloud-native applications",
                price = 49.99,
                imageUrl = "https://example.com/cloud.jpg",
                category = "Books",
                index = globalIndex++
            ),
            Product(
                id = "33",
                name = "Testing Strategies",
                description = "Comprehensive software testing guide",
                price = 34.99,
                imageUrl = "https://example.com/testing.jpg",
                category = "Books",
                index = globalIndex++
            ),
            Product(
                id = "34",
                name = "API Design",
                description = "RESTful API design principles",
                price = 29.99,
                imageUrl = "https://example.com/api.jpg",
                category = "Books",
                index = globalIndex++
            ),
            Product(
                id = "35",
                name = "Mobile Development",
                description = "Cross-platform mobile app development",
                price = 44.99,
                imageUrl = "https://example.com/mobile.jpg",
                category = "Books",
                index = globalIndex++
            ),
            Product(
                id = "36",
                name = "Performance Optimization",
                description = "Web application performance tuning",
                price = 39.99,
                imageUrl = "https://example.com/performance.jpg",
                category = "Books",
                index = globalIndex++
            )
        )
        
        val booksStartIndex = electronicsProducts.size + clothingProducts.size
        val booksEndIndex = booksStartIndex + booksProducts.size - 1
        categories["Books"] = Category(
            name = "Books",
            products = booksProducts,
            startIndex = booksStartIndex,
            endIndex = booksEndIndex
        )
        
        // Home & Garden Category (3 products - smallest category)
        val homeProducts = listOf(
            Product(
                id = "37",
                name = "Coffee Maker",
                description = "Automatic drip coffee maker",
                price = 89.99,
                imageUrl = "https://example.com/coffeemaker.jpg",
                category = "Home & Garden",
                index = globalIndex++
            ),
            Product(
                id = "38",
                name = "Garden Tools Set",
                description = "Complete set of gardening tools",
                price = 59.99,
                imageUrl = "https://example.com/gardentools.jpg",
                category = "Home & Garden",
                index = globalIndex++
            ),
            Product(
                id = "39",
                name = "Plant Pot Set",
                description = "Ceramic plant pots for indoor gardening",
                price = 29.99,
                imageUrl = "https://example.com/pots.jpg",
                category = "Home & Garden",
                index = globalIndex++
            )
        )
        
        val homeStartIndex = electronicsProducts.size + clothingProducts.size + booksProducts.size
        val homeEndIndex = homeStartIndex + homeProducts.size - 1
        categories["Home & Garden"] = Category(
            name = "Home & Garden",
            products = homeProducts,
            startIndex = homeStartIndex,
            endIndex = homeEndIndex
        )
        
        // Sports & Fitness Category (8 products)
        val sportsProducts = listOf(
            Product(
                id = "40",
                name = "Yoga Mat",
                description = "Non-slip premium yoga mat",
                price = 29.99,
                imageUrl = "https://example.com/yogamat.jpg",
                category = "Sports & Fitness",
                index = globalIndex++
            ),
            Product(
                id = "41",
                name = "Dumbbells Set",
                description = "Adjustable dumbbells for home gym",
                price = 149.99,
                imageUrl = "https://example.com/dumbbells.jpg",
                category = "Sports & Fitness",
                index = globalIndex++
            ),
            Product(
                id = "42",
                name = "Running Shoes",
                description = "Professional running shoes",
                price = 119.99,
                imageUrl = "https://example.com/runningshoes.jpg",
                category = "Sports & Fitness",
                index = globalIndex++
            ),
            Product(
                id = "43",
                name = "Basketball",
                description = "Official size basketball",
                price = 24.99,
                imageUrl = "https://example.com/basketball.jpg",
                category = "Sports & Fitness",
                index = globalIndex++
            ),
            Product(
                id = "44",
                name = "Tennis Racket",
                description = "Professional tennis racket",
                price = 89.99,
                imageUrl = "https://example.com/tennis.jpg",
                category = "Sports & Fitness",
                index = globalIndex++
            ),
            Product(
                id = "45",
                name = "Swimming Goggles",
                description = "Anti-fog swimming goggles",
                price = 19.99,
                imageUrl = "https://example.com/goggles.jpg",
                category = "Sports & Fitness",
                index = globalIndex++
            ),
            Product(
                id = "46",
                name = "Resistance Bands",
                description = "Set of resistance bands for strength training",
                price = 34.99,
                imageUrl = "https://example.com/bands.jpg",
                category = "Sports & Fitness",
                index = globalIndex++
            ),
            Product(
                id = "47",
                name = "Fitness Tracker",
                description = "Smart fitness tracker with heart rate monitor",
                price = 79.99,
                imageUrl = "https://example.com/tracker.jpg",
                category = "Sports & Fitness",
                index = globalIndex++
            )
        )
        
        val sportsStartIndex = electronicsProducts.size + clothingProducts.size + booksProducts.size + homeProducts.size
        val sportsEndIndex = sportsStartIndex + sportsProducts.size - 1
        categories["Sports & Fitness"] = Category(
            name = "Sports & Fitness",
            products = sportsProducts,
            startIndex = sportsStartIndex,
            endIndex = sportsEndIndex
        )
        
        // Beauty & Personal Care Category (7 products)
        val beautyProducts = listOf(
            Product(
                id = "48",
                name = "Skincare Set",
                description = "Complete daily skincare routine set",
                price = 89.99,
                imageUrl = "https://example.com/skincare.jpg",
                category = "Beauty & Personal Care",
                index = globalIndex++
            ),
            Product(
                id = "49",
                name = "Hair Dryer",
                description = "Professional hair dryer with ionic technology",
                price = 79.99,
                imageUrl = "https://example.com/hairdryer.jpg",
                category = "Beauty & Personal Care",
                index = globalIndex++
            ),
            Product(
                id = "50",
                name = "Makeup Brush Set",
                description = "Professional makeup brush collection",
                price = 39.99,
                imageUrl = "https://example.com/brushes.jpg",
                category = "Beauty & Personal Care",
                index = globalIndex++
            ),
            Product(
                id = "51",
                name = "Perfume",
                description = "Luxury fragrance for everyday wear",
                price = 129.99,
                imageUrl = "https://example.com/perfume.jpg",
                category = "Beauty & Personal Care",
                index = globalIndex++
            ),
            Product(
                id = "52",
                name = "Electric Toothbrush",
                description = "Smart electric toothbrush with app connectivity",
                price = 99.99,
                imageUrl = "https://example.com/toothbrush.jpg",
                category = "Beauty & Personal Care",
                index = globalIndex++
            ),
            Product(
                id = "53",
                name = "Face Mask Set",
                description = "Hydrating face mask collection",
                price = 24.99,
                imageUrl = "https://example.com/facemask.jpg",
                category = "Beauty & Personal Care",
                index = globalIndex++
            ),
            Product(
                id = "54",
                name = "Nail Polish Set",
                description = "Premium nail polish collection",
                price = 19.99,
                imageUrl = "https://example.com/nailpolish.jpg",
                category = "Beauty & Personal Care",
                index = globalIndex++
            )
        )
        
        val beautyStartIndex = electronicsProducts.size + clothingProducts.size + booksProducts.size + homeProducts.size + sportsProducts.size
        val beautyEndIndex = beautyStartIndex + beautyProducts.size - 1
        categories["Beauty & Personal Care"] = Category(
            name = "Beauty & Personal Care",
            products = beautyProducts,
            startIndex = beautyStartIndex,
            endIndex = beautyEndIndex
        )
        
        // Toys & Games Category (5 products)
        val toysProducts = listOf(
            Product(
                id = "55",
                name = "LEGO Set",
                description = "Creative building blocks set",
                price = 49.99,
                imageUrl = "https://example.com/lego.jpg",
                category = "Toys & Games",
                index = globalIndex++
            ),
            Product(
                id = "56",
                name = "Board Game",
                description = "Strategy board game for family fun",
                price = 34.99,
                imageUrl = "https://example.com/boardgame.jpg",
                category = "Toys & Games",
                index = globalIndex++
            ),
            Product(
                id = "57",
                name = "Puzzle Set",
                description = "1000-piece jigsaw puzzle",
                price = 19.99,
                imageUrl = "https://example.com/puzzle.jpg",
                category = "Toys & Games",
                index = globalIndex++
            ),
            Product(
                id = "58",
                name = "Action Figure",
                description = "Collectible action figure",
                price = 24.99,
                imageUrl = "https://example.com/actionfigure.jpg",
                category = "Toys & Games",
                index = globalIndex++
            ),
            Product(
                id = "59",
                name = "Card Game",
                description = "Classic card game set",
                price = 12.99,
                imageUrl = "https://example.com/cardgame.jpg",
                category = "Toys & Games",
                index = globalIndex++
            )
        )
        
        val toysStartIndex = electronicsProducts.size + clothingProducts.size + booksProducts.size + homeProducts.size + sportsProducts.size + beautyProducts.size
        val toysEndIndex = toysStartIndex + toysProducts.size - 1
        categories["Toys & Games"] = Category(
            name = "Toys & Games",
            products = toysProducts,
            startIndex = toysStartIndex,
            endIndex = toysEndIndex
        )
        
        // Automotive Category (4 products)
        val automotiveProducts = listOf(
            Product(
                id = "60",
                name = "Car Phone Mount",
                description = "Magnetic phone mount for car dashboard",
                price = 29.99,
                imageUrl = "https://example.com/phoneholder.jpg",
                category = "Automotive",
                index = globalIndex++
            ),
            Product(
                id = "61",
                name = "Car Charger",
                description = "Fast charging USB car charger",
                price = 19.99,
                imageUrl = "https://example.com/carcharger.jpg",
                category = "Automotive",
                index = globalIndex++
            ),
            Product(
                id = "62",
                name = "Car Floor Mats",
                description = "All-weather car floor mats",
                price = 39.99,
                imageUrl = "https://example.com/floormats.jpg",
                category = "Automotive",
                index = globalIndex++
            ),
            Product(
                id = "63",
                name = "Car Air Freshener",
                description = "Long-lasting car air freshener",
                price = 9.99,
                imageUrl = "https://example.com/airfreshener.jpg",
                category = "Automotive",
                index = globalIndex++
            )
        )
        
        val automotiveStartIndex = electronicsProducts.size + clothingProducts.size + booksProducts.size + homeProducts.size + sportsProducts.size + beautyProducts.size + toysProducts.size
        val automotiveEndIndex = automotiveStartIndex + automotiveProducts.size - 1
        categories["Automotive"] = Category(
            name = "Automotive",
            products = automotiveProducts,
            startIndex = automotiveStartIndex,
            endIndex = automotiveEndIndex
        )
        
        // Pet Supplies Category (2 products - second to last)
        val petProducts = listOf(
            Product(
                id = "64",
                name = "Dog Food",
                description = "Premium dry dog food for all breeds",
                price = 49.99,
                imageUrl = "https://example.com/dogfood.jpg",
                category = "Pet Supplies",
                index = globalIndex++
            ),
            Product(
                id = "65",
                name = "Cat Litter",
                description = "Clumping cat litter with odor control",
                price = 24.99,
                imageUrl = "https://example.com/catlitter.jpg",
                category = "Pet Supplies",
                index = globalIndex++
            )
        )
        
        val petStartIndex = electronicsProducts.size + clothingProducts.size + booksProducts.size + homeProducts.size + sportsProducts.size + beautyProducts.size + toysProducts.size + automotiveProducts.size
        val petEndIndex = petStartIndex + petProducts.size - 1
        categories["Pet Supplies"] = Category(
            name = "Pet Supplies",
            products = petProducts,
            startIndex = petStartIndex,
            endIndex = petEndIndex
        )
        
        // Office Supplies Category (1 product - last category)
        val officeProducts = listOf(
            Product(
                id = "66",
                name = "Notebook Set",
                description = "Professional spiral notebooks for office use",
                price = 14.99,
                imageUrl = "https://example.com/notebooks.jpg",
                category = "Office Supplies",
                index = globalIndex++
            )
        )
        
        val officeStartIndex = electronicsProducts.size + clothingProducts.size + booksProducts.size + homeProducts.size + sportsProducts.size + beautyProducts.size + toysProducts.size + automotiveProducts.size + petProducts.size
        val officeEndIndex = officeStartIndex + officeProducts.size - 1
        categories["Office Supplies"] = Category(
            name = "Office Supplies",
            products = officeProducts,
            startIndex = officeStartIndex,
            endIndex = officeEndIndex
        )
        
        return ProductListResponse(categories = categories)
    }
}
