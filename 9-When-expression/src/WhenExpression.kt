fun main() {
    val nilai = "B"

    when (nilai) {
        "A" -> println("Awesome")
        "B" -> println("Good")
        else -> println("Kesian :(")
    }

    when (nilai) {
        "A", "B" -> println("Pass")
        else -> println("Kesian :(")
    }

    // When expression in
    val huruf = "C"
    val listHuruf: Array<String> = arrayOf("A", "B", "C", "D")
    when (huruf) {
        in listHuruf -> println("Huruf ada")
        !in listHuruf -> println("Tidak ada")
    }

    // When expression is
    val name = "Alvin"
    when (name) {
        is String -> println("Ini string")
        !is String -> println("Bukan string")
    }

    // When to replace if else
    val nilaiAngka = 85
    when {
        nilaiAngka > 90 -> {
            println("Awesome")
        }
        nilaiAngka > 75 -> {
            println("Good")
        }
        else -> {
            println("Kesian :(")
        }
    }
}