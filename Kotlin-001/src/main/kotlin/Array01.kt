import kotlin.random.Random

fun main() {
    val rnd = Random(System.currentTimeMillis())


    // 내용을 추가 삭제 변경이 가능한 배열
    val array = arrayListOf<Int>()

    // 1 ~ 100까지 임의 난수를 생성하여 array에 100개 추가
    for(number in 1..100 ) {
        var num:Int = rnd.nextInt(100) + 1
        array.add(num)
    }

    println("arrayList , ${array}")
    val evens = (array).filter { it % 2 == 0 }

//    val evens:ArrayList<Int>

    println("evens , ${evens}")


}