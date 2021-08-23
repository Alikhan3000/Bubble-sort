fun main (){


    val arr = mutableListOf(10, 2, 10, 3, 1, 2, 5, 2,-1, 3)
    val a = bubbleSort(arr)
    println(a)
    println(a)


}
fun bubbleSort(array: MutableList<Int>): List<Int> {
    if (array.size == 0) return array
    var isSorted = false
    var counter = 0
    while (!isSorted) {
        isSorted = true
        for (i in 0 until array.size - 1 - counter) {
            if(array[i] > array[i+1]) {
                isSorted = false
                swap(array, i, i + 1)
            }
        }
        counter++
    }
    return array
}

fun swap(array: MutableList<Int>, i: Int, j: Int) {
    val temp = array[j]
    array[j] = array[i]
    array[i] = temp
}
