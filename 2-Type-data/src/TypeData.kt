fun main() {
    // Type data number
    var age: Byte = 30
    println("Ini adalah byte $age")

    var float: Float = 10.3f
    println(float)

    var double: Double = 43.5
    println(double)

    var hex: Int = 0xDA
    println(hex)

    var binary: Int = 0b01010101
    println(binary)

    var priceLong: Long = 100_000_000L
    println(priceLong)

    var price: Int = priceLong.toInt()
    println(price)

    // Type data string
    var name: String = "Zukron"
    var lastName: String = "Alviandy R"
    var fullName: String = "$name $lastName"
    println("total $fullName char = ${fullName.length}")

    var multiLine: String = """
        |Hai saya
        |adalah 
        |alvin
    """.trimMargin()
    println(multiLine)

    var multiLine2: String = """
        >Hai saya
        >adalah 
        >alvin
    """.trimMargin(">")
    println(multiLine2)
}