import kotlin.random.Random

fun main() {

    var num1 = Random.nextInt(100)
    // num1 % 2 == 0 은 참, 거짓으로 결론이 나오기 때문에
    // bYes는 블린이다.
    var bYes = num1 % 2 == 0
    if(bYes) {
        println("$num1 은 짝수")
    }else {
        println("$num1 은 짝수가 아님")
    }


    // 두가지 코드는 같은 코드임
    var result = ""
    if(bYes) {
        result = "짝수"
    }else {
        result = "짝수 아님"
    }
    println("$num1 은 $result")

    // result2 = bYes ? "짝수" : "짝수아님"
    var result2 = if(bYes) "짝수" else "짝수아님"
    println("$num1 은 $result2")

}