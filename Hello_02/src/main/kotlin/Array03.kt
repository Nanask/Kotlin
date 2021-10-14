fun main() {

//    val map1 = mapOf("name" : "홍길동", "tel" : '010-111' : "addr" : "서울시") // Json형태이나, KT에서는 :대신 to를 사용
    // key와 value를 쌍으로 갖는 데이터 타입
    val map1 = mapOf("name" to "홍길동", "tel" to "010-111" , "addr" to "서울시")

    println(map1["name"])
    for((key,value ) in map1) {
        println("key : $key , value : $value")
    }
    // 가변형 map
    val map2 = mutableMapOf(
        "name" to "이몽룡",
        "tel" to "010-111-1111",
        "addr" to "남원시"
    )
    println(map2)
    map2["tel"] = "010-222-2222"
    println(map2)
}