import java.lang.NullPointerException

fun main() {
    var input = ""


    var number1 = 0
    var number2 = 0
    var fnumber1 = 0.0f
    var fnumber2 = 0.0f
    try {
        print("문자열을 입력 : ")
       input= scan1.nextLine()
    }catch (e:NullPointerException) {
        println("숫자만 입력하세요")
    }
    println("입력한 문자열 : $input")

    /**
     * 키보드를 사용하여 2개의 문자열형 숫자를 입력받고
     * 두 숫자의 사칙연산을 수행하여 console에 표시하시오
     */

    print("정수형 숫자1를 입력 : ")
    var num1 = scan1.nextLine()
    print("정수형 숫자2를 입력 : ")
    var num2 = scan1.nextLine()
    try {
        number1 = Integer.parseInt(num1)
        fnumber1 = num1.toFloat()

    }catch (e:NumberFormatException) {
        println("숫자만 입력해주세요 입력한 숫자는 : $number1")
        return // 숫자가 입력이 되지 않았다면 , 종료시키기
    }

    try {
        number2 = Integer.parseInt(num2)
        fnumber2 = num2.toFloat()

    }catch (e:NumberFormatException) {
        println("숫자만 입력해주세요")
        return
    }

    println("$number1 + $number2 = ${number1+number2}")
    println("$number1 - $number2 = ${number1-number2}")
    println("$number1 * $number2 = ${number1*number2}")
    println("$number1 / $number2 = ${number1/number2}")
    println("$fnumber1 / $fnumber2 = ${fnumber1/fnumber2}")
}