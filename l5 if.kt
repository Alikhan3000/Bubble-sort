

//Насырбекоа Алихан
fun main() {
    println("Введите четырёхзначное число")

    val string = readLine()!!.split(' ')[0].map { it.toInt() }


    if ((string[0] + string[1]) == (string[2] + string[3])) {


        println(true)

    } else if ((string[0] + string[1]) != (string[2] + string[3])) {
        println(false)
    }
}



    










