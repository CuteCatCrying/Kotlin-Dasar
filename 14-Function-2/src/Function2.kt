fun main() {
    println(double(5))
    hi("Alvin")
    hi2("Zukron")

    finalValue("Ganjil", 3, 5, 1, 9, 7)

    val name = "Zukron"
    println(name.hello())

    val result = "Zukron" to "UP";
    println(result)

    println(sayHello())
    println(sayHello("Alvin"))

    println(sayHello2())
    println(sayHello2("Alvin"))
}

// Single expression function
fun double(a: Int): Int = a * 2
fun hi(name: String): Unit = println("Hi $name")
fun hi2(name: String) = println("Hi $name")

// Function varargs parameter
fun finalValue(name: String, vararg values: Int) {
    var total = 0
    for (value in values) {
        total += value
    }

    println("Final value $name = $total")
}

// Extension function
fun String.hello(): String = "Hello $this"

// Function infix notation
infix fun String.to(type: String): String {
    if (type == "UP") {
        return this.toUpperCase()
    } else {
        return this.toLowerCase()
    }
}

// Function scope
fun scope() {
    fun satu() {

    }
}

// Function return if
fun sayHello(name: String = ""): String {
    return if (name == "") {
        "Hello anonymous"
    } else {
        "Hello $name"
    }
}

// Function return when
fun sayHello2(name: String = ""): String {
    return when (name) {
        "" -> "Hallo bro"
        else -> "Hallo $name"
    }
}