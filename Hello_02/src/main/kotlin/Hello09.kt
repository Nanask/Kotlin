// 진입점 함수

fun main() {

    var result1 = add(100, 200)
    var result2 = add(10.0f, 20.0f)
    println("$result1, $result2")

}

// 함수를 사용하여 코드를 분리하기
// fun 키워드를 사용하여 함수를 정의한다

// void 형 함수
// void method(int, int b) : Java
// fun method(a:Int, b:Int) {   } : KT

// return type 정수형인 함수
// int 함수명 (int 매개변수) {} : Java
// fun 함수명( 매개변수:Int) : Int {} : KT

/**
 * 함수형 프로그래밍
 * 순수함수 개념
 * 매개변수로 전달받은 값을 변경하지 않고 다른 연산의 기초 데이터로만 활용하는 함수
 *
 * java에서 method는 매개변수로 전달받은 변수에 연산을 통하여 값을 저장,수정,삭제 할 수 있다
 *      또한, 단순히 매개벼니수에 어떤 값을 할당 할 수도 있다
 *
 * 하지만 KT에서는 매개변수를 절대 변경할 수 없는 규칙이 있다
 * 순수 함수를 유지하기 위한 KT의 정책
 */
fun add(num1:Int, num2:Int):Int {
//    num1 += 10
//    num2 += 20
//    Val cannot be reassigned 오류 발생
    var sum = num1 + num2

    return sum
}
// 오버로딩, 함수의 이름이 같더라도 매개변수의 타입이 다르기 때문에 사용이 가능하다
fun add(num1:Float, num2:Float):Float {
    return num1 + num2
}