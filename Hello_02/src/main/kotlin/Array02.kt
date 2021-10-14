fun main() {

    /**
     * Java 에서 배열은 한번 생성이 되면
     * 배열의 크기를 변경 할 수 없다
     *
     * KT 에서는 java 와 같은 배열 요소가 없다
     * List 형의 특별한 데이터 타입만 존재
     *
     * 불변형 List 와 가변형 List 가 존재한다
     * 불변형 List 는 한번 크기, 요소가 지정되면
     *      요소를 추가, 삭제 할 수 없다 ex)state, ListOf
     *      데이터의 변경으로 인한 오류 등을 최소화 하기 위함
     * 가변형 List 는 코드가 실행되는 과정에서
     *      요소를 추가, 삭제할 수 있다 ex)MutableList
     */
    // lList는 한번 생성되면 변경이 불가하다. 불변형 List
    var lList = listOf(1,2,3,4,5,6)

    // mArray는 코드를 추가가 가능하다. 가변형 List
    var mArray : MutableList<Int> = mutableListOf()
    mArray.add(100)
    mArray.add(200)
    println(mArray)

    // Java의 ArrayList를 가져온 가변형 list 데이터
    var aArray:ArrayList<Int> = arrayListOf<Int>()
    aArray.add(100)
    aArray.add(200)
    aArray.add(300)

    println("Array, $aArray,")
    // 실제값으로 요소를 제거하기, 200을 제거하라
    aArray.remove(200)
    // index번째 요소를 제거하라
    aArray.removeAt(0)
    println(aArray)
}