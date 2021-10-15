import java.util.*

// 기존 main을 그대로 사용해도 상관없음
fun main(args: Array<String>) {
    // in을 ``으로 사용하는 이유는 헷갈리지 않기 위함
    var scan: Scanner = Scanner(System.`in`)

    print("1번 항목 정수를 입력하세요 : ")
    var strNum1 = scan.nextLine()
    print("2번 항목 정수를 입력하세요 : ")
    var strNum2 = scan.nextLine()

    var intNum1 = Integer.valueOf(strNum1)
    var intNum2 = Integer.valueOf(strNum2)

    view(intNum1,intNum2)

    /**
     * 함수에 값을 전달하면서 직접 매개변수 이름에 값을 할당하여 전달
     * Call By Name
     */

    view(num1 = intNum1, num2 = intNum2)

}


