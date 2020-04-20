//importing scanner and exponential math
import java.util.Scanner
import kotlin.math.pow

//main function to run our while loop
fun main(args: Array<String>) {
    //the loop value is 1
    val loop = 1
    //the sum variable is implicitly declared as a float
    var sum = 0.0
    //I have never used the ` key before so this is cool to see
    val read = Scanner(System.`in`)
    //start the while loop and make it equal to 1 so it is infinite
    while (loop == 1) {
        //Prompt user to enter calculation
        println("Enter number to add to calculation: ")
        //scan the next value
        val enteredValue = read.next()
        //if at any time the user enters quit, exit the while loop
        if(enteredValue == "quit" || enteredValue == "Quit"){
            break
        }
        //the operation is the middle part of the user's input
        val operation = read.next()
        //the second value is the last part of the user's input
        val enteredValue2 = read.next()
        //if the operation is a + sign
        if(operation == "+") {
            //take the token whether it is an int or float and type cast into a float
            val token1 = enteredValue.toFloat()
            //take the token whether it is an int or float and type cast into a float
            val token2 = enteredValue2.toFloat()
            //add token1 + token2 to the sum
            sum += (token1 + token2)
        }
        //if the operation is a - sign
        if(operation == "-") {
            //take the token whether it is an int or float and type cast into a float
            val token1 = enteredValue.toFloat()
            //take the token whether it is an int or float and type cast into a float
            val token2 = enteredValue2.toFloat()
            //add token1 - token2 to the sum
            sum += (token1 - token2)
        }
        //if the operation is a * sign
        if(operation == "*") {
            //take the token whether it is an int or float and type cast into a float
            val token1 = enteredValue.toFloat()
            //take the token whether it is an int or float and type cast into a float
            val token2 = enteredValue2.toFloat()
            //add token1 * token2 to the sum
            sum += (token1 * token2)
        }
        //if the operation is a / sign
        if(operation == "/") {
            //take the token whether it is an int or float and type cast into a float
            val token1 = enteredValue.toFloat()
            //take the token whether it is an int or float and type cast into a float
            val token2 = enteredValue2.toFloat()
            //if the user is trying to divide by zero
            if(token2.toInt() == 0){
                //Prompt the user to stop dividing by 0 and try again
               println("Dividing by 0 user, please try again.")
            }
            //otherwise if they are not dividing by zero
           else {
                //add token1 / token2 to the sum
                sum += (token1 / token2)
           }
        }
        //if the operation is a ^ sign
        if(operation == "^") {
            //take the token whether it is an int or float and type cast into a float
            val token1 = enteredValue.toFloat()
            //take the token whether it is an int or float and type cast into a float
            val token2 = enteredValue2.toFloat()
            //add token1 ^ token2 to the sum
            sum += (token1.pow(token2))
        }
        //Show the user what they entered
        println("You have entered: $enteredValue $operation $enteredValue2")
        //Show the user their current running sum
        println("Current sum is : $sum")
    }
    //Show the user their final sum after the program is done running
    println("Final sum is: $sum")
}