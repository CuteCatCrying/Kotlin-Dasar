fun main() {
    val members: Array<String> = arrayOf("Ucup", "Budi", "Lalalu")

    // set
    members.set(0, "Geger")
    members[2] = "Lalap"

    // get
    println(members[0])
    println(members[2])

    // Nullable array
    val values: Array<Int?> = arrayOfNulls(5)
    values[0] = 4
    values[1] = 9
    values[2] = null
    values[3] = null
    values[4] = 99

    println(values[4])
}