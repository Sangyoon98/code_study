import java.io.*

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))

    val n = br.readLine().toInt()
    br.close()

    println(Math.pow((Math.pow(2.0, n.toDouble()) + 1), 2.0).toInt())
}