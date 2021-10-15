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
    // filter : array 배열에서 조건에 맞는 요소만 추출하여 evens 배열에 담기
//    val evens = (array).filter { it % 2 == 0 } // it 키워드를 사용, kt 고유방식, 조건에 일치하는 it이 담기는 것
    val evens = (array).filter { arr -> arr % 2 == 0 } // lamda방식

    // 짝수의 합
    var evenSum = 0
    for(arr in evens) {
        evenSum += arr
    }

    println("배열요소중 짝수들의 합 , ${evenSum}")

    // kt에만 존재하는 코드
    // sumof : 조건에 맞는 함수처럼 사용하는 것
    // if값이 짝수이면 it을 합산하여 return 하고 아니라면 0을 보내라 : 삼항연산자 이용
    // 어떤것이 더 빠른 코드인지는 모르나, 개발자입장에서는 훨씬 편한 코드가 만들어진다
    val evenSum1 = array.sumOf {if(it % 2 == 0) it else 0 }


}