fun main() {
    val numbers = mutableListOf<Int>()
    var input: String
    do {
        input = readLine() ?: ""
        val number = input.toIntOrNull()
        if (number != null) {
            numbers.add(number)
        }
    } while (input != "стоп")

    val maxNumber = numbers.maxOrNull()
    println("$maxNumber")
}