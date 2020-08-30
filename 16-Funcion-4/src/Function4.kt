fun main() {
    // Lambda expression
    //                 input type       output type    parameter name
    val contohLambda: (String, String) -> String = { firstName: String, lastName: String ->
        val result = "$firstName $lastName"
        result
    }
    val result = contohLambda("Zukron", "Alviandy")
    println(result)

    // It
    val sayHello: (String) -> String = {
        "Hello $it"
    }
    println(sayHello("Alvin"))

    // Method references
    val upper: (String) -> String = ::toUpper
    println(upper("Alvin"))

    // Higher-Order function
    fun hello(name: String, transformer: (String) -> String): String {
        val nameTransform = transformer(name)
        return "Hello $nameTransform"
    }

    val lambdaUpper = { value: String -> value.toUpperCase() }
    println(hello("Alvin", lambdaUpper))
    println(hello("Zukron", { value: String -> value.toLowerCase() }))

    // Trailing lambda
    val resultLambda = hello("Alvin") { value: String ->
        value.toLowerCase()
    }
    println(resultLambda)
}

fun toUpper(value: String): String = value.toUpperCase()