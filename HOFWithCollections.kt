/** High Order Functions With Collections 
 * Higher-order functions are especially relevant to collections as they help you perform common tasks, like sorting or filtering, with less code. Now that you have a solid foundation working with collections, it's time to revisit higher-order functions.
 * In this codelab, you'll learn about a variety of functions that can be used on collection types, including forEach(), map(), filter(), groupBy(), fold(), and sortedBy(). In the process, you'll get additional practice working with lambda expressions.
**/


class Cake(
    val flavor: String, 
    val price: Double, 
    val quantity: Int, 
    val sprinkles: Boolean
)

val cakes = listOf(
    Cake(
        flavor = "Chocolate", 
        price = 10.0, 
        quantity = 5, 
        sprinkles = true
    ),
    Cake(
        flavor = "Vanilla", 
        price = 8.0, 
        quantity = 3, 
        sprinkles = false
    ),
    Cake(
        flavor = "Strawberry", 
        price = 9.0, 
        quantity = 4, 
        sprinkles = true
    ),
    Cake(
        flavor = "Lemon", 
        price = 7.0, 
        quantity = 2, 
        sprinkles = false
    ),
    Cake(
        flavor = "Red Velvet", 
        price = 12.0, 
        quantity = 6, 
        sprinkles = true
    ),
    Cake(
        flavor = "Carrot", 
        price = 11.0, 
        quantity = 1, 
        sprinkles = false
    ),
    Cake(
        flavor = "Pumpkin Spice", 
        price = 10.0, 
        quantity = 3, 
        sprinkles = true
    ),
    Cake(
        flavor = "Coconut", 
        price = 9.0, 
        quantity = 2, 
        sprinkles = false
    )
)

fun main() {
    val kotlin = "🙂"
    println(kotlin)

    /** 1. Loop over a list with forEach() 
     * forEach(action: (T) -> Unit): Unit
     * The forEach() function takes a lambda expression as an argument and applies it to each element in the collection.
     * The lambda expression is a function that takes an element of the collection as a parameter and performs an action on it.
     * The forEach() function is useful when you want to perform an action on each element in a collection without changing the elements themselves.
    **/
    cakes.forEach { 
        println("Flavor: ${it.flavor}, Price: ${it.price}, Quantity: ${it.quantity}, Sprinkles: ${it.sprinkles}")
    }

    /** 2. Transform a list with map() 
     * map(transform: (T) -> R): List<R>
     * The map() function takes a lambda expression as an argument and applies it to each element in the collection.
     * The lambda expression is a function that takes an element of the collection as a parameter and returns a new value.
     * The map() function returns a new list containing the transformed elements.
     * The map() function is useful when you want to transform each element in a collection into a new value.
    **/
    
    val fullMenu = cakes.map { "${it.flavor} - $${it.price}" }
   
    println("")
    println("Full Menu:")
    
    fullMenu.forEach {
        println(it)
    }

    /** 3. Filter a list with filter() 
     * filter(predicate: (T) -> Boolean): List<T>
     * The filter() function takes a lambda expression as an argument and applies it to each element in the collection.
     * The lambda expression is a function that takes an element of the collection as a parameter and returns a Boolean value.
     * The filter() function returns a new list containing only the elements that satisfy the predicate.
     * The filter() function is useful when you want to select elements from a collection based on a condition.
    **/
     
    val sprinkleCake = cakes.filter{ it.sprinkles }
    
    println("")
    println("Sprinkles Cake:")
  
    sprinkleCake.forEach{
        println("${it.flavor}")
    }

    /** 4. Group elements with groupBy() 
     * groupBy(keySelector: (T) -> K): Map<K, List<T>>
     * The groupBy() function takes a lambda expression as an argument and applies it to each element in the collection.
     * The lambda expression is a function that takes an element of the collection as a parameter and returns a key.
     * The groupBy() function returns a map where the keys are the values returned by the lambda expression and the values are lists of elements that share the same key.
     * The groupBy() function is useful when you want to group elements in a collection based on a common property.
    **/

    val priceGroups = cakes.groupBy { it.price }

    println("")
    println("Price Groups:")
    
    priceGroups.forEach{ 
        it.value.forEach{ 
            println("Cake: ${it.flavor}")
            println("Price: ${it.price}")
        }        
    }

    /** 5. Combine elements with fold() 
     * fold(initial: R, operation: (R, T) -> R): R
     * The fold() function takes an initial value and a lambda expression as arguments.
     * The lambda expression is a function that takes an accumulator and an element of the collection as parameters and returns a new accumulator.
     * The fold() function returns the final accumulator value.
     * The fold() function is useful when you want to combine the elements of a collection into a single value.
    **/

    val total = cakes.fold(0.0) { acc, cake -> acc + (cake.price * cake.quantity) }

    println("")
    println("Total Price: $${total}")

    /** 6. Sort elements with sortedBy() 
     * sortedBy(selector: (T) -> R): List<T>
     * The sortedBy() function takes a lambda expression as an argument and applies it to each element in the collection.
     * The lambda expression is a function that takes an element of the collection as a parameter and returns a value to sort by.
     * The sortedBy() function returns a new list containing the elements sorted by the values returned by the lambda expression.
     * The sortedBy() function is useful when you want to sort elements in a collection based on a property.
    **/

    val sortedCakes = cakes.sortedBy { it.price }

    println("")
    println("Sorted Cakes:")
    
    sortedCakes.forEach{
        println("${it.flavor} - $${it.price}")
    }
}

