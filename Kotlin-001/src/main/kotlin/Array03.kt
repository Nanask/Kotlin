import kotlin.random.Random

fun main() {
    var rnd = Random(System.currentTimeMillis())

    val array = arrayListOf<Int>()

    for (num in 1..100) {
        var rndNum: Int = rnd.nextInt(100) + 1
        array.add(rndNum)
    }
    println("array , ${array.count()}")
    println("array , ${array}")

    val primes = array.filter {
        // 플래그 변수를 선언 초기화
        for (num in 2 until it) {
            if (it % num == 0) {
                // 플래그 변수 변경해주세요
                break }
        }
        // 플래그변수

    }

    println(primes)

}
