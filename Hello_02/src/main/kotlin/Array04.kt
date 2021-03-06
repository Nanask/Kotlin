fun main() {

    // 1~45까지의 index
    var numbers = Array(45, {index-> index+1})

    viewList(numbers)
    println("=".repeat(50))

    // Collection에 담긴 데이터를 무작위로 섞어주는 함수
    numbers.shuffle()
    viewList(numbers)

    // 0부터 5번까지의 6개의 요소를 배열에서 잘라서 복사
    var lottoNum = numbers.slice(0..5)
    println(lottoNum.sorted())

    println("=".repeat(50))
    println("행운의 숫자...?")
    println("=".repeat(50))
    // 잘라낸 배열을 다시 정렬하여 보여주기
    println(lottoNum.sorted())
    println("=".repeat(50))




}
fun viewList(numbers:Array<Int>) {

    for((index,num) in numbers.withIndex()) {
        print("$num,")
        // index값을 5로 나누어서 0으로 나온다면 줄바꿈을 해주기
        if((index + 1) % 5 == 0) println()
    }
}