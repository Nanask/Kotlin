import kotlin.random.Random

fun main() {
    var rnd:Random = Random(System.currentTimeMillis())

    var num1:Int = rnd.nextInt(100)

    println("생성된 난수 : $num1")

    // range데이터(일종의 유사배열
//    (2..(num1-1)) // 밑의 코드와 같음
    var resultArray = (2 until num1).filter { num1 % it == 0 }
    // (2 until num1)만큼 돌면서 num1을 (2 until num1)만큼 나눠서 0인 결과만 추출하여 resultArrya에 담기
    // (2~9)가 돌면서 9 % (2~9) 나눠서 0이면 추출하기
    print(resultArray)

    if(resultArray.isEmpty()) {
        println("$num1 은 소수")
    }else {
        println("$num1 은 소수가 아님")
    }
}