import java.util.*

fun main() {
    var scan:Scanner = Scanner(System.`in`)

    print("문자열을 입력하세요 : ")
    var input:String = scan.nextLine()

    println("입력한 문자열 : $input")

    print("한자리의 정수를 입력하세요 : ")
    var strNum:String = scan.nextLine()

    // 입력받고자 하는 대상이 정수형인데 문자열로 입력받았으므로
    // 다시 정수형으로 변환해 주어야 한다
    var intNum = Integer.valueOf(strNum)
}