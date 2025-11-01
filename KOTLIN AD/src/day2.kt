import java.security.KeyStore.TrustedCertificateEntry

//fun main() {
//    println("Hello World!")
//    println("I am learning Kotlin.")
//    println("It is awesome!")
//}

//Adding two numbers

//fun main(){
//    println(3+3)
//}

//The print() function
//There is also a print() function, which is similar to println().
// The only difference is that it does not insert a new line at the end of the output:

//fun main(){
//    print("Its")
//    print("fun")
//    print ("to")
//    print("learn")
//    print("kotlin")
//}

//Kotlin Variables
//Variables are containers for storing data values.
//
//To create a variable, use var or val, and assign a value to it with the equal sign (=):
//
//Syntax
//var variableName = value
//val variableName = value

//fun main(){
//    var name = "JSANA"
//    val birthage = 2004
//
//    println(name)
//    println(birthage)
//}
//
//The difference between var and val is that variables declared with the var
//keyword can be changed/modified, while val variables cannot.

//**Variable Type**
//Unlike many other programming languages, variables in Kotlin do not need to be declared
//with a specified type (like "String" for text or "Int" for numbers,
//if you are familiar with those).
//
//fun main() {
//    var name = "sana"      // String (text)
//    val birthyear = 2005   // Int (number)
//
//    println(name)          // Print the value of name
//    println(birthyear)     // Print the value of birthyear
//}

//Kotlin is smart enough to understand that "John" is a String (text), and that 1975 is an Int (number) variable.
//fun main() {
//    var name: String = "John" // String
//    val birthyear: Int = 1975 // Int
//
//    println(name)
//    println(birthyear)
//}
 // another way if you want to specify type

//fun main(){
//    var name : String
//    name = " sana "
//    val age : Int
//    age = 19
//    println(age)
//    println(name)
//}

//This will generate an error:
//
//var name
//name = "John"
//println(name)

//**Kotlin Data Types**
//In Kotlin, the type of a variable is decided by its value:
//
//fun main() {
//val myNum = 5             // Int
//val myDoubleNum = 5.99    // Double
//val myLetter = 'D'        // Char
//val myBoolean = true      // Boolean
//val myText = "Hello"      // String
//    println(myNum)
//    println(myLetter)
//    println(myBoolean)
//    println(myText)
//}

//it is possible to specify the type if you want:
//
//fun main(){
//    var name : String = "Sana"
//    var age : Int = 19
//    var birthyear : Int  = 2003
//    var marks : Double = 20.99
//    val myBoolean : Boolean = true
//    var Letter : Char = 'S'
//
//    println(name)
//    println(age)
//    println(birthyear)
//    println(marks)
//    println(myBoolean)
//    println(Letter)
//
//}
//
//**Data types are divided into different groups:**
//
//1.Numbers
//Characters
//Booleans
//Strings
//Arrays

//Numbers
//Number types are divided into two groups:
//
//Integer types store whole numbers, positive or negative (such as 123 or -456), without decimals. Valid types are Byte, Short, Int and Long.
//
//Floating point types represent numbers with a fractional part, containing one or more decimals. There are two types: Float and Double.
//
//If you don't specify the type for a numeric variable, it is most often returned as Int for whole numbers and Double for floating point numbers.
//
//Integer Types
//Byte
//The Byte data type can store whole numbers from -128 to 127. This can be used instead of Int or other integer types to save memory when you are certain that the value will be within -128 and 127:
// fun main() {
//
//    val myNum: Byte = 100
//    println(myNum)
//}

//Short
//The Short data type can store whole numbers from -32768 to 32767:
//
//Example
//fun main(){
//val myNum: Short = 5000
//println(myNum)
//}
//
//
//Long
//The Long data type can store whole numbers from -9223372036854775808 to 9223372036854775807. This is used when Int is not large enough to store the value. Optionally, you can end the value with an "L":
//
//fun main() {
//    val myNum: Long = 15000000000L
//    println(myNum)
//}
//


//Difference Between Int and Long
//A whole number is an Int as long as it is up to 2147483647. If it goes beyond that, it is defined as Long:
//
//Example
//val myNum1 = 2147483647  // Int
//val myNum2 = 2147483648  // Long


//Floating Point Types
//Floating point types represent numbers with a decimal, such as 9.99 or 3.14515.
//
//The Float and Double data types can store fractional numbers:

//fun main() {
//    val myNum: Float = 5.75F
//    println(myNum)
//}
//Double Example
//
//fun main(){
//val myNum: Double = 19.99
//println(myNum)}
//
//Float or Double?
//
//The precision of a floating point value indicates how many digits the value can have after the decimal point. The precision of Float is only six or seven decimal digits, while Double variables have a precision of about 15 digits. Therefore it is safer to use Double for most calculations.
//
//Also note that you should end the value of a Float type with an "F".

//Scientific Numbers
//A floating point number can also be a scientific number with an "e" or "E" to indicate the power of 10:
//
//Example

//fun main() {
//    val myNum1: Float = 35E3F
//    val myNum2: Double = 12E4
//    println(myNum1)
//    println(myNum2)
//}
//fun main() {
//    val isKotlinFun: Boolean = true
//    val isFishTasty: Boolean = false
//    println(isKotlinFun)   // Outputs true
//    println(isFishTasty)   // Outputs false
//}

//Boolean values are mostly used for conditional testing,
//
//Characters
//The Char data type is used to store a single character. A char value must be surrounded by single quotes, like 'A' or 'c':
//
//fun main() {
//    val myGrade: Char = 'B'
//    println(myGrade)
//}
//
//Unlike Java, you cannot use ASCII values to display certain characters. The value 66 would output a "B" in Java, but will generate an error in Kotlin:
//
//Example
//val myLetter: Char = 66
////println(myLetter) // Error


//Arrays
//Arrays are used to store multiple values in a single variable, instead of declaring separate variables for each value.

//Type Conversion
//Type conversion is when you convert the value of one data type to another type.

//
//In Kotlin, numeric type conversion is different from Java. For example, it is not possible to convert an Int type to a Long type with the following code:

//Example
//val x: Int = 5
//val y: Long = x
//println(y) // Error: Type mismatch
//To convert a numeric data type to another type, you must use one of the following functions: toByte(), toShort(), toInt(), toLong(), toFloat(), toDouble() or toChar():
//
//Example

fun main() {
    val x: Int = 5
    val y: Long = x.toLong()
    println(y)
}