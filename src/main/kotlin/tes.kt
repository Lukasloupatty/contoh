//// Return Values
//fun main() {
//    val massage = hello("luki")
//    println(massage)
//}
//fun hello(name: String): String {
//
//    return "Hello $name"
//
//}


////Unit-returning Function
//fun main() {
//     val hello= setluki("luki")
//    println(hello)
//
//    hello("luki")
//
//}
//fun setluki(name: String):String{
//    return "Hallo $name"
//}
//fun hello(name: String){
//   println("Hello $name")
//
//}



////Recursi Function
//fun main() {
//    println(Facterial(4))
//
//
//}
//fun Facterial(n: Int): Int {
//    return if (n == 1) {
//        n
//    }else{
//        n * Facterial(n-1)
//    }
//
//
//}


////Tail Recursion
////Contoh 1
//fun main(args: Array<String>) {
//    val a = 4
//
//    val result = factorial(a)
//    println( result )
//
//}
//
////fun factorial(a: Int, accum: Int = 1): Int {
//    val result = a * accum
//    return if (a <= 1) {
//        result
//    } else {
//        factorial(a - 1, result)
//    }
//}

////Contoh 2 kalo pakai tailrec
//fun main() {
//    println(factorial(99999999))
//}
//tailrec fun factorial(n: Int, result: Int = 1): Int {
//    val newResult = n * result
//    return if (n == 1){
//        newResult
//    }else{
//        factorial(n - 1, newResult)
//    }
//}

////Contoh 3 kalo tidak pakai tailrec
//fun main() {
//    println(factorial(99999999))
//}
//fun factorial(n: Int, result: Int = 1): Int {
//    val newResult = n * result
//    return if (n == 1){
//        newResult
//    }else{
//        factorial(n - 1, newResult)
//    }
//}


//// Higher-Order Functions
//fun main() {
//
//    val result = calculate(4, 5, ::sum)
//    println( result )
//
//}
//fun sum(a: Int, b: Int) = a + b
//
//fun calculate(a: Int, b: Int, operation:(Int, Int) -> Int): Int {
//    return operation(a, b)
//
//}


//// Lambda Function
////Contoh 1
//fun main(args: Array<String>) {
//
//    val upperCase = { str: String -> str.toUpperCase() }
//
//    println( upperCase("hello, world!") )
//
//}


////Inline Function
//var balance = 10_000
//
//fun main() {
//    val playThenGame={
//        balance -= 1_000
//        println("playing the game!")
//    }
//
//    doTransaction(playThenGame)
//
//
//}
//inline fun doTransaction(doplay:() -> Unit){
//    println("Balace before play: $balance")
//    doplay()
//    println()
//    println("Balance after play: $balance")
//}


//// (26/09/2023) Materi "OOP"
//// OOP Concepts(Encapsulation)
//class Principal(){
//    private var studentsName = mutableListOf<String>(
//        "Student A","Student B","Student C"
//    )
//        fun getStudentsName(): List<String>{
//            return studentsName
//        }
//}
//
//fun main() {
//    val principal = Principal()
//
////    println(principal.studentsName())
//
//    println(principal.getStudentsName())
//}



//(27/09/2023)
//