//Online Quiz Application

fun main() {
    val kotlin = "🙂"
    println(kotlin)
    
    Quiz().apply {
    	printQuiz()
    }
    
    Quiz().printProgressBar()
}

// ENUM
enum class DifficultyLevel {
    EASY, MEDIUM, HARD
}



// Data Class
data class Question<T>(
    val question: String,
    val answer: T,
    val difficulty: DifficultyLevel
)

/** There are many scenarios where you want a class to only have one instance. For example:
 * Player stats in a mobile game for the current user.
 * Interacting with a single hardware device, like sending audio through a speaker.
 * An object to access a remote data source (such as a Firebase database).
 * Authentication, where only one user should be logged in at a time.
 * In the above scenarios, you'd probably need to use a class. However, you'll only ever need to instantiate one instance of that class. If there's only one hardware device, or only one user logged in at once, there would be no reason to create more than a single instance. Having two objects that access the same hardware device simultaneously could lead to some really strange and buggy behavior.
 * You can clearly communicate in your code that an object should have only one instance by defining it as a singleton. A singleton is a class that can only have a single instance. Kotlin provides a special construct, called an object, that can be used to make a singleton class.
**/
 
 // object StudentProgress {
//     var total: Int = 15
//     var answered: Int = 10
// }

// Interface

interface ProgressPrintable {
    val progressText: String
    fun printProgressBar()
}

class Quiz: ProgressPrintable {
    val question1 = Question<String>("Quoth the raven ___", "nevermore", DifficultyLevel.MEDIUM)
    val question2 = Question<Boolean>("The sky is green. True or false", false, DifficultyLevel.EASY)
    val question3 = Question<Int>("How many days are there between full moons?", 28, DifficultyLevel.HARD)

    
    /** Declare objects as companion objects
     * Classes and objects in Kotlin can be defined inside other types, and can be a great way to organize your code. You can define a singleton object inside another class using a companion object. A companion object allows you to access its properties and methods from inside the class, if the object's properties and methods belong to that class, allowing for more concise syntax.
     * To declare a companion object, simply add the companion keyword before the object keyword. 
    **/
     
    companion object StudentProgress {
    	var total: Int = 15
    	var answered: Int = 10
    }
    
    override val progressText: String
        get() = "${answered} of ${total} answered"
    
    override fun printProgressBar() {
        repeat(Quiz.answered) { print("▓") }
        repeat(Quiz.total - Quiz.answered) { print("▒") }
        println()
        println(progressText)
    }
    
    fun printQuiz() {
        question1.let {
            println(it.question)
            println(it.answer)
            println(it.difficulty)
        }
        println()
        question2.let {
            println(it.question)
            println(it.answer)
            println(it.difficulty)
        }
        println()
        question3.let {
            println(it.question)
            println(it.answer)
            println(it.difficulty)
        }
        println()
    }
}

/* Extend Class with properties and methods */
// val Quiz.StudentProgress.progressText: String
//     get() = "${answered} of ${total} answered"

// fun Quiz.StudentProgress.printProgressBar() {
//     repeat(Quiz.answered) { print("▓") }
//     repeat(Quiz.total - Quiz.answered) { print("▒") }
//     println()
//     println(Quiz.progressText)
// }