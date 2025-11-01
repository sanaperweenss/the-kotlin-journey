//Kotlin Operators:Operators are used to perform operations on variables and values.
//fun main(){
//    var x = 100 + 50
//    println(x)
//}
//
//fun main(){
//    var sum1 = 100 + 50
//    var sum2 = sum1 + 200
//    var sum3 = sum2 +300
//    println(sum1)
//    println(sum2)
//    println(sum3)
//}
//
//Kotlin divides the operators into the following groups:
//
//Arithmetic operators
//Assignment operators
//Comparison operators
//Logical operators
//
//
//rithmetic operators are used to perform common mathematical operations.
//
//Operator	Name	Description	Example	Try it
//+	Addition	Adds together two values	x + y
//-	Subtraction	Subtracts one value from another	x - y
//*	Multiplication	Multiplies two values	x * y
///	Division	Divides one value from another	x / y
//%	Modulus	Returns the division remainder	x % y
//++	Increment	Increases the value by 1	++x
//--	Decrement	Decreases the value by 1	--x
//
//fun main(){
//    var x = 5
//    var y = 3
//    println(x + y) //Adds together two values
//    println(x - y)   //	Subtracts one value from another
//    println(x * y)  //	Multiplies two values
//    println(x / y)  //Divides one value from another
//    println(x % y)  //Returns the division remainder
//
//}
//
//fun main(){
//    var x = 5
//    ++x         //Increases the value by 1
//    println(x)
//}
//
//fun main(){
//    var y = 5
//    --y      //	Decreases the value by 1
//    println(y)
//}


//Kotlin Assignment Operators
//Assignment operators are used to assign values to variables.
//
//fun main (){
//    var x = 5
//    x += 10
//    println(x)
//}
//
//fun main (){
//    var x = 10
//    x -= 5
//    println(x)
//}
//
//fun main (){
//    var x = 5
//    x *= 10
//    println(x)
//}
//
//fun main (){
//    var x = 5
//    x /= 10
//    println(x)
//}
//
//fun main (){
//    var x = 5
//    x %= 10
//    println(x)
//}
//
//
//A list of all assignment operators:
//
//Operator	Example	Same
//=	         x = 5	x = 5
//+=	        x += 3	x = x + 3
//-=	        x -= 3	x = x - 3
//*=	        x *= 3	x = x * 3
///=	        x /= 3	x = x / 3
//%=	        x %= 3	x = x % 3

//
//##Kotlin Comparison Operators##
//Comparison operators are used to compare two values, and returns a Boolean value: either true or false.
//
//Operator	Name	Example	Try it
//==	Equal to	x == y
//!=	Not equal	x != y
//>	Greater than	x > y
//<	Less than	x < y
//>=	Greater than or equal to	x >= y
//<=	Less than or equal to	x <= y
//You will learn much more about Booleans in the Boolean chapter and Conditions.
//
//fun main(){
//    var x = 5
//    var y = 3
//    println(x==y) //prints false if not equal
//}
//
//fun main(){
//    var x = 5
//    var y = 3
//    println(x!=y) //prints true if not equal
//}

//fun main(){
//    var x = 5
//    var y = 3
//    println(x>=y) //prints true if x greater than  y
//}
//
//
//fun main() {
//    var x = 5
//    var y = 3
//    println(x <= y) //prints true if y is less than x
//}

//
// ##Kotlin Logical Operators##
//Logical operators are used to determine the logic between variables or values:
//
//Operator                                     	Name	                 Description
//&&      	Logical and	Returns true if both statements are true	x < 5 &&  x < 10
//||      	Logical or	Returns true if one of the statements is true	x < 5 || x < 4
//!	        Logical not	Reverse the result, returns false if the result is true
//
//fun main() {
//    var x = 5
//    println(x > 3 && x < 10) // returns true because 5 is greater than 3 AND 5 is less than 10
//}
//
//fun main() {
//    var x = 5
//    println(x > 3 && x > 10) // returns  false because 5 is greater than 3 but 5 is less than 10 : as one statement is true and other false
//}
//
//fun main() {
//    var x = 5
//    println(x > 3 || x < 4) // returns true because one of the conditions are true (5 is greater than 3, but 5 is not less than 4)
//}
//
//fun main() {
//    var myBool = true
//    println(!myBool) // returns false because the ! (not) operator reverses the result
//}
//
//fun main() {
//    var myBool = false
//    println(!myBool) // returns false because the ! (not) operator reverses the result
//}