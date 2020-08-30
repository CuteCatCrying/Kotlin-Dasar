fun main() {
    // range up tu
    val range = 1..100

    println(range.contains(4))

    // range down to
    val rangeDownTo = 100 downTo 1 step 10

    println(rangeDownTo.count())
}