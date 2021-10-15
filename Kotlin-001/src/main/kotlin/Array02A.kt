import java.util.*
import kotlin.random.Random

fun main() {
    val scan = Scanner(System.`in`)
    val rnd = Random(System.currentTimeMillis())

    print("10 ~ 100 까지 중 범위의 정수를 입력 : ")
    val strNum = scan.nextLine()

    val intNum = Integer.valueOf(strNum)

    // 배열을 만들어주기
    val array = arrayListOf<Int>()

    for(num in 1..intNum) {}
    // 입력한 값만큼의 배열 만들기
    for(num in 0 until intNum) {
        val rndNum = rnd.nextInt(100) +1
        // 1부터 100까지의 난수를 넣어주기
        array.add(rndNum)
    }
    val newArray1 = arrayListOf<Int>()
    for(arr in array) {
        newArray1.add(arr + 2)
    }

    val newArray2 = array.map {it + 2}

    println("원래배열 : $array")
    println("새로운배열1 : $newArray1")
    println("새로운배열2 : $newArray2")

}