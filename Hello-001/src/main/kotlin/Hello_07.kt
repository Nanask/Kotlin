import java.util.*

// public 변수로 scan을 선언
// type java.util.Scanner class
// 클래스를 가져와서 객체로 선언 및 생성하기
// 생성자를 new 키워드 없이 그냥 호출하여 객체를 초기화 한다
// public 선언변수는 프로젝트 전체에 공용으로 사용되므로
// 프로젝트 전체에 유일한 이름이여야 한다
val scan1:Scanner = Scanner(System.`in`) // system으로 불러온 것은 ``백팃을 사용해야 한다

fun main() {

    print("문자열을 입력 : ")
    var input:String = scan1.nextLine()
    println("입력한 문자열 : $input")

    /**
     * 키보드를 사용하여 2개의 문자열형 숫자를 입력받고
     * 두 숫자의 사칙연산을 수행하여 console에 표시하시오
     */
    print("정수형 숫자1를 입력 : ")
    var num1:String = scan1.nextLine()
    var intNum = Integer.valueOf(num1)
    var number1 = Integer.parseInt(num1)
    var fnumber1 = num1.toFloat()

    print("정수형 숫자2를 입력 : ")
    var num2:String = scan1.nextLine()
    var number2 = Integer.parseInt(num2)
    var fnumber2 = num2.toFloat()

    // 두가지는 같은 코드이다
    println("$num1 + $num2 = ${number1+number2}")
    println("$num1 - $num2 = ${number1-number2}")
    println("$num1 * $num2 = ${number1*number2}")
    println("$num1 / $num2 = ${fnumber1/fnumber2}")

    println("$number1 + $number2 = ${number1+number2}")
    println("$number1 - $number2 = ${number1-number2}")
    println("$number1 * $number2 = ${number1*number2}")
    println("$fnumber1 / $fnumber2 = ${fnumber1/fnumber2}")
}