import java.util.Scanner

fun main()
{
    val sc = Scanner(System.`in`)
    var n: Int = sc.nextInt()
    var m: Int = sc.nextInt()

    val childs = LongArray(n + m) {0}
    var psum: Long = 0

    childs[m] = 1
    for (i in (m + 1)..(m + n - 1))
    {
        psum += childs[i - 2] - childs[i - m - 1]
        childs[i] = psum
    }
    println("test " + (childs[n + m - 1] + psum + childs[n + m - 2] - childs[n - 1]).toString())
}
