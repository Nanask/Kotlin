import kotlin.random.Random

fun main() {

    var rnd:Random = Random(System.currentTimeMillis())

    var num1:Int = rnd.nextInt(100)
    when (num1 % 2) {

        0 -> println("$num1 짝수")
        1 -> println("$num1 홀수")
    }

    var result:String = when (num1 % 3 ) {
        // num1 % 3을 했을 때 결과값이 0,1,2 또는 else 로 나눌때,
        // 여러가지의 결과를 얻고 싶다면 when 을 사용해보자
        0-> "3의 배수"
        1-> "글쎄"
        2-> "결과가 2라면 뭘까"
        else ->"알 수 없음"
    }
    println("$num1 $result")
}