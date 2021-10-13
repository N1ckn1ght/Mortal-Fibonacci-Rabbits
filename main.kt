import java.util.Scanner

fun main()
{
    val sc = Scanner(System.`in`)
    var n: Int = sc.nextInt()
    var m: Int = sc.nextInt()

    val adults = LongArray(n + m - 1) {0}
    val childs = LongArray(n + m - 1) {0}
    childs[m - 1] = 1
    for (i in m..(m + n - 2))
    {
        childs[i] = adults[i - 1]
        adults[i] = adults[i - 1] + childs[i - 1] - childs[i - m]
    }
    println(adults[n + m - 2] + childs[n + m - 2])
}