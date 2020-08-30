fun main() {
    // Anonymous Function
    fun hello(value: String, transformer: (String) -> String): String {
        val valueTransform = transformer(value)
        return "Hello $valueTransform"
    }

    val anonymousUpper = fun(value: String): String {
        return if (value.isBlank()) {
            "Ups"
        } else {
            value.toUpperCase()
        }
    }

    println(hello("Alvin", anonymousUpper))
    println(hello("", anonymousUpper))

    // Anonymous function as parameter
    println(hello("ALVIN", fun(value: String): String {
        return value.toLowerCase()
    }))

    // Closure
    var counter = 0
    val lambdaIncrement: () -> Unit = {
        println("Increment")
        counter++
    }

    val anonymousIncrement = fun() {
        println("Anonymous increment")
        counter++
    }

    fun functionIncrement() {
        println("Function increment")
        counter++
    }

    lambdaIncrement()
    anonymousIncrement()
    functionIncrement()
    lambdaIncrement()
    anonymousIncrement()
    functionIncrement()
    println(counter)

    println(hello { "Alvin" })
    println(fullName({ "Zukron" }, { "ALviandy" }))
}

// Inline function
inline fun hello(name: () -> String): String {
    return "Hello ${name()}"
}

// Noinline function
inline fun fullName(
    firstName: () -> String,
    noinline lastName: () -> String
): String {
    return "Hello ${firstName()} ${lastName()}"
}