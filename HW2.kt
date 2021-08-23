import kotlin.math.pow
import kotlin.math.sqrt
import kotlin.math.*


fun main(args: Array<String>) {
    println("ax2 + bx + c = 0")
    println("ВВЕДИТЕ a, b, c:")

    val(a) = readLine()!!.split(' ').map(String::toFloat)
    val (b) = readLine()!!.split(' ').map(String::toFloat)
    val (c) = readLine()!!.split(' ').map(String::toFloat)
    val root1: Double
    val root2: Double
    val output: String

    val discriminant = b * b - 4.0 * a * c

    if (discriminant > 0) {
        root1 = (-b + Math.sqrt(discriminant)) / (2 * a)
        root2 = (-b - Math.sqrt(discriminant)) / (2 * a)

        output = "root1 = %.2f and root2 = %.2f".format(root1, root2)
    }
    else if (discriminant == 0.0) {
        root2 = (-b / (2 * a)).toDouble()
        root1 = root2

        output = "root1 = root2 = %.2f;".format(root1)
    }
    else {
        val realPart = -b / (2 * a)
        val imaginaryPart = Math.sqrt(-discriminant) / (2 * a)

        output = "x1 = %.2f+%.2fi и x2 = %.2f-%.2fi".format(realPart, imaginaryPart, realPart, imaginaryPart)
    }

    println(output)
}