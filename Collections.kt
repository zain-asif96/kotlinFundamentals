/** Collections in Kotlin 
 * Arrays
 * List as MutableList
 * Set as MutableSet
 * Map as MutableMap
**/

fun main() {
    val kotlin = "🙂"
    println(kotlin)
    

    // 1. Arrays
    /** An array is the simplest way to group an arbitrary number of values in your programs.
     * Like a grouping of solar panels is called a solar array, or how learning Kotlin opens up an array of possibilities for your programming career, an Array represents more than one value. Specifically, an array is a sequence of values that all have the same data type. 
    **/
    val compulsorySubjects = arrayOf<String>("English", "Urdu", "Maths")
    val optionalSubjects = arrayOf<String>("Chemistry", "Biology", "Computer")
    
    val allSubjects = compulsorySubjects + optionalSubjects;
    
    allSubjects[3] = "Physics";
    
    println(allSubjects[3])


    // 2. List as MutableList
    /** A list is a collection of items that are ordered and can be accessed by their index. 
     * In Kotlin, you can create a list using the listOf() function. 
     * The listOf() function creates an immutable list, which means that you cannot add or remove items from the list after it has been created.
     * A list is an ordered, resizable collection, typically implemented as a resizable array. When the array is filled to capacity and you try to insert a new element, the array is copied to a new bigger array.
     * List is an interface that defines properties and methods related to a read-only ordered collection of items.
     * MutableList extends the List interface by defining methods to modify a list, such as adding and removing elements.
    **/
    
    val attendees = mutableListOf<String>("Ali", "Ahmed", "Asad")
    
    
    //Add elements to the list
    attendees.add("Ahsan")
    attendees.add(3,"Adeel")
    attendees.add("Aamir")
    
    //Remove elements from the list
    attendees.remove("Ali")
    attendees.removeAt(3)
    
    //Length of list
    println(attendees.size)
    
    //Access the elements
    println(attendees[3])
    println(attendees.get(3))
    
    //Find index of element
    println(attendees.indexOf("Adeel"))
    
    //Show all the elements by using for loop
    for(attendee in attendees) {
        println(attendee)
    }
    
    //Check if elements present in the list
    println("Ali" in attendees)
    println(attendees.contains("Ahmed"))


    // 3. Set as MutableSet
    /** A set is a collection of items that are unordered and do not allow duplicates. 
     * In Kotlin, you can create a set using the setOf() function. 
     * The setOf() function creates an immutable set, which means that you cannot add or remove items from the set after it has been created.
     * A set is a collection that contains no duplicate elements. 
     * Set is an interface that defines properties and methods related to a read-only collection of unique items.
     * MutableSet extends the Set interface by defining methods to modify a set, such as adding and removing elements.
    **/

    val fruits = mutableSetOf<String>("Apple", "Banana", "Orange")
    
    //Add elements to the set
    fruits.add("Mango")
    fruits.add("Apple")
    fruits.add("Grapes")
    fruits.add("Strawberry")

    //Remove elements from the set but cannot remove by index
    fruits.remove("Banana")
    /* xxx fruits.removeAt("Strawberry") xxx */

    //Length of set
    println(fruits.size)

    //Access the elements
    println(fruits.elementAt(3))
    println(fruits.indexOf("Apple"))

    //Show all the elements by using for loop
    for(fruit in fruits) {
        println(fruit)
    }

    //Check if elements present in the set
    println("Banana" in fruits)
    println(fruits.contains("Apple"))


    // 4. Map as MutableMap
    /** A map is a collection of key-value pairs, where each key is unique. 
     * In Kotlin, you can create a map using the mapOf() function. 
     * The mapOf() function creates an immutable map, which means that you cannot add or remove items from the map after it has been created.
     * A map is a collection that contains key-value pairs. 
     * Map is an interface that defines properties and methods related to a read-only collection of key-value pairs.
     * MutableMap extends the Map interface by defining methods to modify a map, such as adding and removing key-value pairs.
    **/

    val student = mutableMapOf<String, String>(
        "name" to "Ali",
        "age" to "20",
        "rollNo" to "1234"
    )

    //Add elements to the map
    student.put("class", "10th")
    student["section"] = "A"
    student.put("city", "Karachi")

    //Remove elements from the map
    student.remove("age")

    //Length of map
    println(student.size)

    //Access the elements
    println(student["name"])
    println(student.get("rollNo"))

    //Show all the elements by using for loop
    for((key, value) in student) {
        println("$key: $value")
    }

    //Check if elements present in the map
    println(student.containsKey("age"))
    println(student.containsValue("Ali"))
}
