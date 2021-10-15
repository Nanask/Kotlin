import java.util.*
import kotlin.random.Random

fun main() {
    var scan: Scanner = Scanner(System.`in`)
    var rnd = Random(System.currentTimeMillis())

    var intNum = 0
    while (true) {
        print(" 10이상 100 이하의 정수를 입력해주세요 : ")
        var strNum = scan.nextLine()
        try {
            intNum = Integer.valueOf(strNum)
            if (10 > intNum || 100 < intNum  ) {
                println(" 10 이상 100 이하의 정수만 입력해주세요!! ")
                continue
            }
            break
        } catch (e: Exception) {
            println(" 정수만 입력해주세요 ")
            continue
        }
    }
    println("입력받은 정수 : ${intNum}")

    val array = arrayListOf<Int>()

    for(num in 1..intNum) {
        var num:Int = rnd.nextInt(100) +1
        array.add(num)
    }
    println("array 원래배열 , ${array}")

    val list = array.map{ array -> array+2 }
    println("list 2를 추가한 배열, ${list}")
}