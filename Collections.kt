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
}
