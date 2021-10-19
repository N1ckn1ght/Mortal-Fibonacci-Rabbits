import java.util.Scanner

fun main()
{
    val sc = Scanner(System.`in`)
    var n: Int = sc.nextInt()
    var m: Int = sc.nextInt()

    val rbits = LongArray(n + m) {0}
    rbits[m - 1] = 1

    for (i in (m + 1)..(m + n - 1))
    {
        rbits[i] = rbits[i - 1] + rbits[i - 2] - rbits[i - m - 1]
    }
    println((rbits[n + m - 1] + rbits[n + m - 2]).toString())
}
