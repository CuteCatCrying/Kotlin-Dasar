fun main() {
    // For array
    val names = arrayOf("Alvin", "Ucup", "Otong")
    for (name in names) {
        println(name)
    }

    // For range
    for (value in 0..100) {
        println(value)
    }

    for (value in 100 downTo 0 step 10) {
        println(value)
    }

    val ukuranArray = names.size - 1
    for (i in 0..ukuranArray) {
        println("index $i = ${names.get(i)}")
    }
}