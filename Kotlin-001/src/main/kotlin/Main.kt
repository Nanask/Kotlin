import java.util.*

//fun main(args: Array<String>) {
//    println("Hello World!")
//
//    // Try adding program arguments at Run/Debug configuration
//    println("Program arguments: ${args.joinToString()}")
//}


fun main() {
    var scan: Scanner = Scanner(System.`in`)

    print("첫번째 정수를 입력하세요 : ")
    var strNum1 = scan.nextLine()
    print("두번째 정수를 입력하세요 : ")
    var strNum2 = scan.nextLine()

    var num1 = Integer.valueOf(strNum1)
    var num2 = Integer.valueOf(strNum2)

    println("num1, num2 : ${num1},${num2}")

    view(num1, num2)
}

// 반드시 매개변수를 넘겨줄때는 타입을 지정해주자
fun view(num1: Int, num2: Int) {

    println("${num1}+${num2} = ${num1 + num2}")
    println("${num1}-${num2} = ${num1 - num2}")
    println("${num1}*${num2} = ${num1 * num2}")
    println("${num1}/${num2} = ${num1 / num2}")


}