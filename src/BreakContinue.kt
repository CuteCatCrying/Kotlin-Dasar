fun main() {
    // Break
    var i = 0
    while (true) {
        println("Break me")
        i++
        if (i > 20) {
            break
        }
    }

    println("\n=============================")
    // Continue
    for (x in 0..50) {
        if (x % 2 == 0) {
            continue
        }
        println(x)
    }
}