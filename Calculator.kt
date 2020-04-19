
import java.util.Scanner
import kotlin.math.pow

//just have to account for floats

fun main(args: Array<String>) {
    val loop = 1
    var sum = 0.0
    //I have never used the ` key before so this is cool to see
    val read = Scanner(System.`in`)

    while (loop == 1) {
        println("Enter number to add to calculation: ")
        val enteredValue = read.next()

        if(enteredValue == "quit" || enteredValue == "Quit"){
            break
        }

        val operation = read.next()
        val enteredValue2 = read.next()


        if(operation == "+") {
            val token1 = enteredValue.toFloat()
            val token2 = enteredValue2.toFloat()
            sum += (token1 + token2)
        }

        if(operation == "-") {
            val token1 = enteredValue.toFloat()
            val token2 = enteredValue2.toFloat()
            sum += (token1 - token2)
        }

        if(operation == "*") {
            val token1 = enteredValue.toFloat()
            val token2 = enteredValue2.toFloat()
            sum += (token1 * token2)
        }

        if(operation == "/") {
            val token1 = enteredValue.toFloat()
            val token2 = enteredValue2.toFloat()

            if(token2.toInt() == 0){
               println("Dividing by 0 user, please try again.")
            }

           else {

                sum += (token1 / token2)
           }
        }

        if(operation == "^") {
            val token1 = enteredValue.toFloat()
            val token2 = enteredValue2.toFloat()
            sum += (token1.pow(token2))
        }

        println("You have entered: $enteredValue $operation $enteredValue2")
        println("Current sum is : $sum")
    }

    println("Final sum is: $sum")
}