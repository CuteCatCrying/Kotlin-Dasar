fun main() {
    println(factorialLoop(10))
    println(factorialRecursive(10))
//    display(25000)

    println(factorialRecursiveTail(10))
}

// Factorial for loop
fun factorialLoop(value: Int): Int {
    var result = 1;
    for (i in value downTo 1) {
        result *= i
    }
    return result
}

// Factorial recursive
fun factorialRecursive(value: Int): Int {
    return when (value) {
        1 -> 1
        else -> value * factorialRecursive(value - 1)
    }
}

// Tail recursive function
tailrec fun display(value: Int) {
    println("Recursive $value")
    if (value > 0) {
        display(value - 1)
    }
}

// Tail recursive factorial function
tailrec fun factorialRecursiveTail(value: Int, total: Int = 1): Int {
    return when (value) {
        1 -> total
        else -> factorialRecursiveTail(value - 1, total * value)
    }
}
