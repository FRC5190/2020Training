# Loops

In this project, you will practice writing if statements, try catches, and when statements.

## Prerequisites

Hello World program (130) and Calculator program (230) and Loops (330)

## Instructions

1. Create a new project called `ifStatements` and a new Kotlin file within your project. Name the file `main`.
Create your `main` method.
1. Create a new Kotlin class within your project and name it `ifStatements`. 
2. Create a function called `evenOrOdd`. Declare a variable and set its value to 7. Create  an if statement where if the number divided by 2 has a remainder of 0, then the number is even; else the number is odd.   
3. Create a function called `testScore`. Print a statement that asks the user to `Enter a test score`. Create a variable that will read the input put in by the user and then convert it to an integer. Using if and elseIf statements, check the range of the test score that is entered. Depending on the score that is entered, you should print a line that says the letter grade of the test Score. Make sure to write code for if the entered value is less than 0 or above 100. If that is the case, the program should prompt the user to reenter their test score and start again. *Hint use a while loop and boolean variable.
4. Create a function called `checkNum`. The function should ask the user to enter a number and then read the user's input as well as store it in a variable. Use a try catch statement to check if the number is parseable to a double. If it is, the program should print that the number entered is valid and also the value of the number in the same line. If it is not parseable to a double, in the catch potion of th try catch statement, it should print that the value is invalid.
5. Create a function called `remainder`. The program should ask the user to enter a number. Store the entered value in a variable called `a`. Do this twice so that now you have two variables that store values that the user entered. The second program should be called `b`. Use a try catch statement to check if the values entered are parseable to the datatype double. If they are not, the code should print that the value is invalid and keep on asking for inputs until both the values are parseable to a double. The program should print whether `a` divided by `b` has a remainder or not. Also, if the user enters 0 for `b`, then the the program should print that the value is invalid and then go back to asking for two values until both are parseable to double and b doesn not equal 0. 
6. Create a function called `whenStatements`. In the bodu of the funtion, it should ask the user for a numerical input and then store the value in a variable called `value` that you convert to an integer. Create a when statement that checks the value entered in `value`. If the value is 1, ut should print "one" and so on until 5. If the values are bigger than 5, then it should print that the values are "out of range"
7.  Go back to the file with your `main` method and create an object from your `ifStatements` class. Then call each of the methods from the `ifStatements` class using the object you created.
8.  Come show off your work!