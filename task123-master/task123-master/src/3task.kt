fun main() {
    for (i in 100..999) {
        val digits = i.toString().toCharArray()
        if (digits[0] != digits[1] && digits[0] != digits[2] && digits[1] != digits[2]) {
            println(i)
        }
    }
}