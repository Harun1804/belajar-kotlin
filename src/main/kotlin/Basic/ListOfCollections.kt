package org.example.Basic

class ListOfCollections {
    fun collectionList() {
        // Read only list
        val readOnlyShapes = listOf("Circle", "Square", "Triangle")
        println(readOnlyShapes)

        // Mutable list
        val mutableShapes = mutableListOf("Circle", "Square", "Triangle")
        mutableShapes.add("Rectangle")
        println(mutableShapes)

        // Accessing list elements using index
        println("First element: ${mutableShapes[0]}")

        // Accessing list elements using .first() or .last() to get the first or last element
        println("First element: ${mutableShapes.first()}")
        println("Last element: ${mutableShapes.last()}")

        // Get the count elements in the list
        println("Count elements: ${mutableShapes.count()}")

        // Check if the list has some element
        println("Has element 'Pentagon': ${mutableShapes.contains("Pentagon")}")
        println("Circle" in mutableShapes)

        // To add or remove items from a mutable list, use .add() and .remove() functions
        mutableShapes.add("Pentagon")
        println(mutableShapes)
        mutableShapes.remove("Pentagon")
        println(mutableShapes)

        // To remove an element by index, use .removeAt()
        mutableShapes.removeAt(0)
        println(mutableShapes)
    }

    fun collectionSet() {
        // Read-only set
        val readOnlyFruits = setOf("apple", "banana", "cherry", "cherry")
        println("Read only set: $readOnlyFruits")

        // Mutable set with explicit type declaration
        val fruits: MutableSet<String> = mutableSetOf("apple", "banana", "cherry", "cherry")
        println("Mutable set: $fruits")

        // Count elements in the set
        println("Count elements: ${fruits.count()} item")

        // Check if the set has some element
        println("Has element 'banana': ${fruits.contains("banana")}")

        // Add or remove items from a mutable set
        fruits.add("grape")
        println(fruits)
        fruits.remove("banana")
        println(fruits)
    }

    fun collectionMap() {
        // Read-only map
        val readOnlyJuiceMenu = mapOf("apple" to 100, "kiwi" to 190, "orange" to 100)
        println(readOnlyJuiceMenu)

        // Mutable map with explicit type declaration
        val juiceMenu: MutableMap<String, Int> = mutableMapOf("apple" to 100, "kiwi" to 190, "orange" to 100)
        println(juiceMenu)

        // Count elements in the map
        println("Count elements: ${juiceMenu.count()} item")

        // Get item by key
        println("Price of apple juice: ${juiceMenu["apple"]}")

        // Add or remove items from a mutable map
        juiceMenu["grape"] = 150
        println(juiceMenu)
        juiceMenu.remove("kiwi")
        println(juiceMenu)

        // Check if the map has some key
        println("Has key 'kiwi': ${juiceMenu.containsKey("kiwi")}")

        // Get keys only
        println("Keys: ${juiceMenu.keys}")

        // Get values only
        println("Values: ${juiceMenu.values}")
    }
}