//Насырбеков Алихан

fun main() {
    val day = readLine()!!
    when(day){
        "1","3","5","7","8","10","12" ->println("Месяц ${day} - дней ${31}")
        "4","6","9","11" -> println("Месяц ${day} - дней ${30}")
        else->{
            println("Месяц ${day} - дней ${28}")
        }


    }
}