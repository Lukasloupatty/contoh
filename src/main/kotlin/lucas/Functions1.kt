package lucas

fun main() {
    val hasil = setUser("Lucas Loupatty",21)

    println(hasil)
}
fun setUser (nama : String, umur:Int):String{
    return "Nama saya $nama, dan umur saya $umur tahun"
}