package lucas

fun main() {
    val jam= 11


    val jam_kuliah = if (jam < 8 || jam >= 16) "pulang" else "masuk"
    println(" $jam_kuliah kuliah")
}