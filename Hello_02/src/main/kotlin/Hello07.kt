import java.util.*

fun main() {

    var scan:Scanner = Scanner(System.`in`)

    /**
     * 키보드에서 정수값을 입력받아
     * 입력한 정수가 3의 배수인지를 판별하는 코드를 작성
     */

    print("정수를 입력해주세요 : ")
    var strNum:String = scan.nextLine()

    var intNum = 0

    try {
        intNum = Integer.valueOf(strNum)
    }catch (e:NumberFormatException) {
        print("정수만 입력해주세요")
        return
    }

    if(intNum != 0 ) {
        if (intNum % 3 == 0) {
            println("$intNum 은 3의 배수 입니다")
        } else {
            println("$intNum 은 3의 배수가 아닙니다")
        }
    }
}