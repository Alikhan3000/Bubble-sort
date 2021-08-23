var value: String? = null
fun main() {
    value = "Kotlin"
//  safe call operator ?.
    println(value?.length)

    //  safe call with let (?. let)
    value?.let {
        println(it.length)
    }
// non null assertion operator (!!)
    val length = if(value != null){
        value!!.length
    }else{
        -1
    }
    println(length)

    // Elvis operator (?:)

    val length2 = value?.length ?: -1
    println(length2)
}