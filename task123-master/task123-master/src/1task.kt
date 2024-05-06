fun main(){
    tusk1()
}
fun tusk1(){

    while (true) {

        try {
            val num1 = readLine()!!.toDouble()
            val znak = readLine()!!
            val num2 = readLine()!!.toDouble()

            calculate(num1, num2, znak)


        } catch (e: NumberFormatException) {
            println("Введенно некоректное число")
        }
        println("Хотите продолжить(Да/Нет)")
        val otvet = readLine()!!
        when (otvet) {
            "Нет" -> break


        }



    }

}
fun calculate (num1:Double,num2:Double,znak:String) {
    when (znak) {
        "+" -> {
            val got = num1 + num2
            println(got)
        }

        "-" -> {
            val got = num1 - num2
            println(got)
        }

        "*" -> {
            val got = num1 - num2
            println(got)
        }

        "/" -> {
            val got = num1 - num2
            println(got)
        }

        else -> println("Введенно некоректный знак")
    }
}