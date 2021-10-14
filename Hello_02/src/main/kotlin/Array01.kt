fun main() {

//    int[] nums = new int[4]
//    KT에서는 배열을 만들때 Collections를 사용하여 생성한다

    // 정수형 배열의 생성, 정수형 list Collection 생성
    // 배열 요소가 정해져 있을 때
   val arr1 = listOf(0,0,0,0,0)
    var arr11 = arrayOf("가","나","다","라")

    // 요소가 정해지지 않은 blank배열을 생성
    val arr2 = emptyList<Int>()
    val arr3 = emptyList<String>()

    // 개수는 지정을 하고 요소 내용은 정해지지 않았을 때
    var arr4 = arrayOfNulls<Int>(3)

    // Array타입으로 받는 Int타입
    // 5개의 사이즈를 갖고 array형태로 만들어라?
    // 개수를 지정하고 람다함수를 사용하여
    // 각 요소의 초기값을 지정하는 코드
    // 여기에서는 0,1,2,3,4의 값이 arr5에 담기게 된다
    var arr5:Array<Int> = Array(5, {index -> index})

//    println(arr5) // 잘못된 코드형태태
   for(arr in arr5) {
        print("$arr, ")
    }
}
