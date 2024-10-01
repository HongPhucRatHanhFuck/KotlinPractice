package eu.tutorials.practicekotlin

fun main() {
    val morningNotification = 51
    val eveningNotification = 135

    printNotificationSummary(morningNotification) // gán giá trị 51 cho biến printNotificationSumary
    printNotificationSummary(eveningNotification) // gán giá trị 135 cho biến printNotificationSumary
}

fun printNotificationSummary(numberOfMessages: Int) {
   if (numberOfMessages <100){
       println("You have $numberOfMessages notification")
   } else{
       println("Your phone is blowing up! You have 99+ notifications")
   }
}