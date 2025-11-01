//Kotlin Strings
//Strings are used for storing text.
//
//A string contains a collection of characters surrounded by double quotes:\

//
//fun main(){
//    var greetings = "Hello welcome to String"
//    println(greetings)
//}


//fun main(){
//    var greetings = "Hello welcome to String"
//    var name = "Sana"
//    var names : String = "Syed"
//    println(greetings)
//    println(name)
//    println(names)
//}

//**Access a String
//To access the characters (elements) of a string, you must refer to the index number inside square brackets.

//String indexes start with 0.

//fun main(){
//    var name : String
//    name = "Perween"
//    println(name[0])
//    println(name[1] + name.length)
//    println(name[2])
//    println(name[3])
//    println(name[4])
//    println(name[5])
//    println(name[6])
//    println()
//    println(name.length)
//}
//
//String Length
//A String in Kotlin is an object, which contain properties and functions that can perform certain operations on strings, by writing a dot character (.) after the specific string variable. For example, the length of a string can be found with the length property:
//
//Example
//var txt = "ABCDEFGHIJKLMNOPQRSTUVWXYZ"
//println("The length of the txt string is: " + txt.length)
//

//String Functions
//There are many string functions available, for example uppercase() and lowercase():
//
//fun main(){
//    var obj : String = "Apple"
//    println(obj.uppercase()) // outputs: APPLE
//    println(obj.lowercase()) //output : apple
//}

//Comparing Strings
//The compareTo(string) function compares two strings and returns 0 if both are equal:

//fun main(){
//    var name = "Sana"
//    var name2 = "Sana"
//    println(name.compareTo(name2)) //prints 0 if they are equal
//}

//fun main(){
//    var name = "Sana"
//    var name2 = "Saba"
//    println(name.compareTo(name2)) //prints 0 if they are equal
//}

//Finding a String in a String
//The indexOf() function returns the index (the position) of the first occurrence of a specified text in a string (including whitespace):

//fun main(){
//    var txt = "Please locate where 'locate' occurs!"
//    println(txt.indexOf("locate"))  // Outputs 7
//}

//fun main(){
//    var msg = "Hello how are you baby"
//    println(msg.indexOf("how"))
//}

//String Concatenation
//The + operator can be used between strings to add them together to make a new string. This is called concatenation:

//fun main(){
//    var firstName : String = "Sana"
//    var surName : String = " Perween"
//    println(firstName +" " + surName)
//}

You can also use the plus() function to concatenate two strings:

Example

fun main(){
var firstName = "John "
var lastName = "Doe"
println(firstName.plus(lastName))}

String Templates/Interpolation

Instead of concatenation, you can also use "string templates"
which is an easy way to add variables and expressions inside a string.
Just refer to the variable with the $ symbol:

fun main() {
    var firstName = "John"
    var lastName = "Doe"
    println("My name is $firstName $lastName")
}

String Templates" is a popular feature of Kotlin, as it reduces the amount of code.
For example, you do not have to specify a whitespace between firstName and lastName,
like we did in the concatenation example