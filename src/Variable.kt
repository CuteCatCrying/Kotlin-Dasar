const val APP = "Belajar kotlin"

fun main() {
    // var = mutable (dapat diubah)
    // val = immutable (tidak dapat diubah)

    val name = "Zukron"
    val age = 20

    println("$name berumur $age")


    // Nullable var
    var firstName: String? = "alvin"
    firstName = null

    println(firstName)
    println(firstName?.length)


    // Constant
    println(APP)
}