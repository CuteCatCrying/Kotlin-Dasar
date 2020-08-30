fun main() {
    helloWorld()
    sayHello("Zukron", "Alviandy")
    sayHello("Ucup", null)
    hello("Otong")
    hello("Otong", "Surotong")
    fullName(
        lastName = "Rahmadhan",
        firstName = "Zukron",
        middleName = "Alviandy"
    )

    val result = sum(1, 5)
    println(result)
}

// Unit returning function
// Tidak mengembalikan data kalau dijava adalah void

// Function
fun helloWorld() {
    println("Hello world")
}

// Function parameter
fun sayHello(firstName: String, lastName: String?) {
    if (lastName == null) {
        println("Hello $firstName")
    } else {
        println("Hello $firstName $lastName")
    }
}

// Function default argument
fun hello(firstName: String, lastName: String = "") {
    println("Hello $firstName $lastName")
}

// Function named argument
fun fullName(
    firstName: String,
    middleName: String,
    lastName: String
) {
    println("Hello $firstName $middleName $lastName")
}

// Function return type
// Function yang mengembalikan data
fun sum(a: Int, b: Int): Int {
    return a + b
}