//Насырбеков Алихан
fun main() {


    val itemsCost = mapOf<String, Int>("хлеб" to 40, "молоко" to 60)

    var total = 0

    for (item in itemsCost) {
        val cost = itemsCost["хлеб"]
        val cost2 = itemsCost["молоко"]
        if (cost !=null) {
            total += cost
            total += cost2!!


        





}
    println("Стоимость покупки $total")
}}