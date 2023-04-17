fun main() {
    println(Person("Grace",26,"graceshadrack01@gmail.com"))

    val MyCar = Car("Vitz","Toyota",2013)
    MyCar.start()

    val Small=Rectangle(78,90)
    println(Small.calculateArea())

    val Student1 = Student("Grace",80,4.5)
    val Student2 = Student("Grace",40,1.5)
    println(Student1.isHonorRoll())

    val Account = BankAccount(2378083,"Deposit",13000.05)
    Account.amount(5000.7)

    myString("Grace")

    val number=numbers(arrayOf(67,45,9,23,90,89))
    println(number)

    val num =nums(arrayOf(90,45,67,22,19,10))
    println(num)

   val word= words(arrayOf("Grace","Wambui","Njuguna"))
    println(word)
}

//Create a data class called Person with the following properties: name, age, and address. Override the toString()
//function to return a formatted string that includes all three properties


data class Person(var name:String, var age:Int, var address:String){
    override fun toString(): String {
        return "Name: $name, Age: $age, Address: $address"
    }
}

//Create a class called Car with the following properties: make, model, and year.
//Include a function called start() that prints a message indicating the car has started.

class Car(val make: String,val model:String, val year:Int){
    fun start(){
        println(
            "My $model, $make of $year is starting")

    }
}
//Create a data class called Rectangle with the following properties: length and width.
//Include a function called calculateArea() that calculates and returns the area of the rectangle.

data class Rectangle(val length: Int, val width:Int){
    fun calculateArea(): Int{
        return length * width
    }
}
//Create a class called Student with the following properties: name, grade, and gpa.
//Include a function called isHonorRoll() that returns true if the student's GPA is greater than or equal to 3.5 and false otherwise.

class Student(val name: String,val grade: Int,val GPA:Double) {
    fun isHonorRoll():Boolean {
        if (GPA >= 3.5) {
             return true
        }
        else{
            return false
        }

    }
}

//Create a data class called BankAccount with the following properties: accountNumber,
//accountType, and balance. Include a function called deposit() that takes an amount as a parameter and adds it to the account balance.

data class BankAccount(var accountNumber: Int, var accountType:String, var balance:Double){
    fun amount(amt:Double){
        balance += amt
        println(balance)
    }
}

fun myString(str:String){
    var reverse = str.reversed()
    println(reverse)
}
//function that takes in an array of integers and returns the second largest
fun numbers(n:Array<Int>):Int{
    if (n.size<=2){
        return n.size
    }
    var sorted = n.sorted()
    return sorted[sorted.size-2]


}
//a fun that takes in an array of int and returns the sum of all even numbers
fun nums(numbs:Array<Int>):Int {
//  return numbs.filter { it %2 ==0 } .sum()
    var sum = 0
    for (x in numbs){
        if (x%2==0){
          sum+=x
        }
    }
    return  sum
    
}
//a fun that takes in an arrray of strings and returns the longest string
fun words(x:Array<String>):String?{
 if (x.isEmpty()){
     return null
 }
    return x.maxByOrNull { it.length }
}











