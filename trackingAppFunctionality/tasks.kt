/** 
 * The purpose of this app is to allow users to track their events. Your team will assign you tasks in order to help build out the app's functionality. 
**/


// Task 1:
    /**
     * Creat Event data class with the following properties:
     * * title: String
     * * description: String?
     * * daypart: String
     * * durationInMinutes: Int
    **/
data class Event(
    val title: String,
    val description: String? = null,
    val daypart: Daypart,
    val durationInMinutes: Int
)

//Task 2: Create ENUM for dayparts
enum class Daypart {
    MORNING,
    AFTERNOON,
    EVENING,
}


//Task 7
val Event.durationOfEvent: String
        get() = if (this.durationInMinutes < 60) {
        "short"
        } else {
        "long"
        }

fun main() {
    val kotlin = "🙂"
    println(kotlin)    
    
    val event1 = Event(title = "Wake up", description = "Time to get up", daypart = Daypart.MORNING, durationInMinutes = 0)
    val event2 = Event(title = "Eat breakfast", daypart = Daypart.MORNING, durationInMinutes = 15)
    val event3 = Event(title = "Learn about Kotlin", daypart = Daypart.AFTERNOON, durationInMinutes = 30)
    val event4 = Event(title = "Practice Compose", daypart = Daypart.AFTERNOON, durationInMinutes = 60)
    val event5 = Event(title = "Watch latest DevBytes video", daypart = Daypart.AFTERNOON, durationInMinutes = 10)
    val event6 = Event(title = "Check out latest Android Jetpack library", daypart = Daypart.EVENING, durationInMinutes = 45)

    //Task 3: As there will be more than one event, create a list of events
    val events = mutableListOf<Event>(event1, event2, event3, event4, event5, event6)


    //Task 4: The user should be able to see a summary of their short events, based on the event's duration. For example, "You have 5 short events."
    val shortEvents = events.filter { it.durationInMinutes < 60 }
    
    println("You have ${shortEvents.size} short events.")

    /** Task 5: The users should be able to see a summary of all the events and their daypart.
     * The output should be similar to:
     * Morning: 3 events
     * Afternoon: 4 events
     * Evening: 2 events
    **/

    val dayPartEvents = events.groupBy { it.daypart }
    dayPartEvents.forEach { (daypart, events) ->
        println("$daypart: ${events.size} events")
    }


    /** Task 6
     * Currently, your colleague finds and prints the last item by using its index. 
     * The code used is: 
     * println("Last event of the day: ${events[events.size - 1].title}").
    **/

    //Old Code
    println("Last event of the day: ${events[events.size - 1].title}")

    // New Code
    println("Last event of the day: ${events.last().title}")

    /** Task 7
     * Your team likes the data class you designed, but finds it repetitive to write code each time they need an event's duration as a string:
     * val durationOfEvent = if (events[0].durationInMinutes < 60) {"short"} else {"long"}
     * println("Duration of first event of the day: $durationOfEvent")
     * While you could fix this repetition by adding a method directly to the class, that is not ideal, as other teams started using your event class in their apps. If the class changes, they would need to retest all of their code to make sure nothing breaks because of your change.
     * Without directly changing the data class, how can you write an extension property that returns the same values as the code above?
     * When correctly implemented, you will be able to use the following code, and it will print the same message as the code shown at the start of this task.
    **/
    println("Duration of first event of the day: ${events[0].durationOfEvent}")
}