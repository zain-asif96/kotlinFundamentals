fun main() {
    val kotlin = "🙂"
    println(kotlin)
    
    
    /* Mobile notifications */
    val morningNotification = 51
    val eveningNotification = 135
    
    printNotificationSummary(morningNotification)
    printNotificationSummary(eveningNotification)
    
    /* Mobile notifications */
    
}


// 1. Mobile notifications
// Typically, your phone provides you with a summary of notifications.

// In the initial code provided in the following code snippet, write a program that prints the summary message based on the number of notifications that you received. The message should include:

// The exact number of notifications when there are less than 100 notifications.
// 99+ as the number of notifications when there are 100 notifications or more.

fun printNotificationSummary(numberOfMessages: Int) {
    if(numberOfMessages > 100) {
        println("Your phone is blowing up! You have 99+ notifications.")
    } else {
        println("You have $numberOfMessages notifications.")
    }
}