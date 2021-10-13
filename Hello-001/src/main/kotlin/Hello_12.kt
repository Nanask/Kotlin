import java.lang.NullPointerException

/**
 * 3항 연산 try
 * Integer.valueOf(num1) 실행이 정상적으로 종료되면
 *      연산결과가 number1에 담기고
 * Exception 이 발생하면
 *      println() 이 실행되어 메세지를 출력한 후 null 값이 intNum에 담기게 된다.
 */

fun main() {
    var input = ""
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


    // num1에 담긴 값이 정수형이라면 값을 변환시켜준 값을 number1에 넣어주고,
    // 그게 아니라면 println을 표시하라
    // 람다는 return을 사용하지 않는다
    var number1:Int? = try {
        Integer.parseInt(num1) // return이 있는 것거럼 행동
//        fnumber1 = num1.toFloat()
    }catch (e:NumberFormatException) {
        println("숫자만 입력해주세요 입력한 숫자는 : $num1")
        null
    }

    var number2:Int? = null
    try {
        number2 = Integer.parseInt(num2)
        fnumber2 = num2.toFloat()

    }catch (e:NumberFormatException) {
        println("숫자만 입력해주세요")
        return
    }
    // 나눗셈은 숫자가 아닌 경우는 어떤 경우에든 0으로 결과가 나와 오류가 발생하기 때문에,
    // 값이 0이 아닐 경우에만 결과값을 보여주도록 하자
    if(number1 !=null && number2 !=null) {
        println("$number1 + $number2 = ${number1 + number2}")
        println("$number1 - $number2 = ${number1 - number2}")
        println("$number1 * $number2 = ${number1 * number2}")
        println("$number1 / $number2 = ${number1 / number2}")
        println("$fnumber1 / $fnumber2 = ${fnumber1 / fnumber2}")
    }else {
        println("숫자를 잘못입력하여 연산결과를 표시할 수 없습니다")
    }
}