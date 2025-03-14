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
}
