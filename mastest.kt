
import kotlin.collections.HashMap
//Насырбеков Алихан


fun main() {

    val names = arrayOf<Any>("KG", "RU", "USA", "TR")
    val codes = arrayOf<Any>("+996", "+7", "+1", "+90")



println("${names[0]} = ${codes[0]}")
println("${names[1]} = ${codes[1]}")
println("${names[2]} = ${codes[2]}")
println("${names[3]} = ${codes[3]}")

    var map = HashMap<Any, Any>()
    map = HashMap()
    map.put(names,codes)
    for (i in map) {

        if (1<2){
        map.put(names[0],codes[0])
        map.put(names[1],codes[1])
        map.put(names[2],codes[2])
        map.put(names[3],codes[3])


        println(map.get("KG"))



    }}}


































