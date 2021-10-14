import java.util.*

var scan: Scanner = Scanner(System.`in`)

fun main() {

    // 원의 둘레 : 반지름 * 2 * PI(파이)
    // 원의 면적 : 반지름 * 반지름 * PI

    // 구의 표면적 : 반지름 * 반지름 * 4 * PI
    // 구의 부피 : 반지름 * 반지름 * 반지름 * PI * (4/3)

    circle()

}
fun circle() {

    while (true) {
    print("반지름을 정수값으로 입력하세요 : ")
    var strInput = scan.nextLine()
    var radius = try {
         Integer.valueOf(strInput)

    }catch (e:NumberFormatException) {
        println("정수만 입력하세요")
        continue
    }

        var pi = Math.PI
        if( radius != 0) {
            println("원의 둘레 : ${radius * 2 * pi}")
            println("원의 면적 : ${radius * radius * pi}")
            println("구의 표면적 : ${radius * radius * 4 * pi}")
            println("구의 부피 : ${radius * radius * radius * pi * (4 / 3)}")
        }

    }

}