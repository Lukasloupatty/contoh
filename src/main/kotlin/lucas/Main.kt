package lucas

fun main() {
    //contoh//
    var text : String = "Lucas loupatty"
    text = "owan loupatty"
    println(text)
    println(" ")

    //contoh//
    var grade = 'A'
    println("Grade " + grade++)
    println("Grade " + grade++)
    println("Grade " + grade++)
    println(" ")
    println("Grade " + grade++)
    println("Grade " + grade++)
    println("Grade " + grade++)
    println(" ")

    //contoh//
    val stringText = "Kotlin Language"
    val firstChar = stringText[0]

    println("Frist character of $stringText is $firstChar")

    //contoh//
    val text2 = "\tmakan  \nbersama \"keluarga\' besar\\"
    println(text2)

    //contoh//
    val text3 = """makan bersama 
        |keluarga 
        |"besar...!" 
        |""".trimMargin()
    println(text3)
    println(" ")

    //contoh//
    var x =true
    var y =false
    println("x && y = " + (x && y))
    println("x || y = " + (x || y))
    println(" !y = " + (! y))
    println(" ")

    //contoh//
    val x1 : Int = 50
    val y1 : Int = 25

    println("x > y =" + (x1 > y1))
    println("x < y = " + (x1 < y1))
    println("x >= y = " + (x1 >= y1))
    println(" ")
    println("x <= y = " + (x1 <= y1))
    println("x == y = " + (x1 == y1))
    println("x != y = " + (x1 != y1))

    //contoh//
    val X3 : Boolean = true
    val y3 : Boolean = false
    val z : Boolean = true

    println(" ")
    println("x.and(y) = " + X3.and(y3))
    println("x.or(y) = " + X3.or(y3))
    println("x.and(z) = " + X3.and(z))

    //contoh//
    val a : Int = 10000
    val d : Double = 100.00
    val f : Float = 100.00f
    val l : Long = 100000004L
    val s : Short = 10
    val b : Byte = Byte.MAX_VALUE

    println("")
    println("Int Value is " + a)
    println("Double Value is " + d)
    println("Flost Value is " + f)
    println("Long Value is " + l)
    println("Short Value is " + s)
    println("Byte Value is " + b)


    //contoh//
    val grps = arrayOf<String>("Group 1","Group 2","Group 3","Group 4",)

    println(" ")
    println( grps[0] )
    println( grps.get(1) )
    println("---------------------")

    grps[0] = "Group satu"
    grps.set(1,"Group Dua")

    println( grps[0] )
    println( grps.get(1) )
    println( grps.get(2) )
    println(" ")

    //contoh//
    val groups = intArrayOf(1,2,3,4)
    val intArray = intArrayOf(2,9,11,15)
    intArray[2] = 30


    println(groups[0])
    println(intArray[3])


}