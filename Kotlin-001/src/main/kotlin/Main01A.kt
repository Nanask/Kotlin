import java.util.*

fun main() {
    var scan: Scanner = Scanner(System.`in`)

while (true) {
    print("첫번째 정수를 입력하세요 : ")
    var strNum1 = scan.nextLine()
    var num1 = try {
        Integer.valueOf(strNum1)
    }catch (e:Exception) {
        println("정수만 입력하세요")
        continue
    }
    print("두번째 정수를 입력하세요 : ")
    var strNum2 = scan.nextLine()
    var num2 = try {
        Integer.valueOf(strNum1)
    }catch (e:Exception) {
        println("정수만 입력하세요")

    }

    println("num1, num2 : ${num1},${num2}")

//    review(num1, num2)
}
}

//fun review(num1: Int, num2: Int) {
//
//    println("${num1}+${num2} = ${num1 + num2}")
//    println("${num1}-${num2} = ${num1 - num2}")
//    println("${num1}*${num2} = ${num1 * num2}")
//    println("${num1}/${num2} = ${num1 / num2}")
//
//}