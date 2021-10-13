fun main() {
    // for(int i=0 ; i < 10; i++) {} 자바코드
    // 0~9까지를 콘솔에 출력하라!
    for(num in 0..9) {
        print("$num,")
    }
    println()

    var sum = 0
    for( num in 1..10) {
        sum += num
    }
    println("1~10까지 덧셈 : $sum")

    for(num in 0 until 10) {
        print(num)
    }
    println()

    // 10부터 1까지의 코드
    // for(int 1 = 10 ; i >= 0 ; i--) {}
    for(num in 10 downTo 1) {
        print("${num},")
    }
    println()

    // 2씩 증가하는 코드
    for(num in 0..10 step 2) {
        print("$num,")
    }

    for(num in 0..10) {
        if(num % 2 == 0) {
            print("$num,")
        }
    }
}