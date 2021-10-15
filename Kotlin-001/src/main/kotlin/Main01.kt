import java.util.*

fun main() {
    var scan: Scanner = Scanner(System.`in`)


    print("첫번째 정수를 입력하세요 : ")
    var strNum1 = scan.nextLine()
    print("두번째 정수를 입력하세요 : ")
    var strNum2 = scan.nextLine()

    var num1 = 0
    var num2 = 0
    try {
        num1 = Integer.valueOf(strNum1)
        num2 = Integer.valueOf(strNum2)
        if (num1 < num2) {
            println("첫번째 입력한 정수가 두번째 입력한 정수보다 커야합니다")
            return
        }
    } catch (e: NumberFormatException) {

        println("정수만 입력하세요")
        return

    }

    println("num1, num2 : ${num1},${num2}")

    review(num1, num2)
}

fun review(num1: Int, num2: Int) {

    println("${num1}+${num2} = ${num1 + num2}")
    println("${num1}-${num2} = ${num1 - num2}")
    println("${num1}*${num2} = ${num1 * num2}")
    println("${num1}/${num2} = ${num1 / num2}")

}