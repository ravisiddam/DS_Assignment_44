package core
//task1
object scalaAssignment2 {
  def main(args: Array[String]): Unit = {
    for (a <- 1 to 10) {
      println(fib(a))
    }
  }

  def fib(n: Int): Int = {
    var first = 0
    var second = 1
    var count = 0

    while (count < n) {
      val next = first + second
      first = second
      second = next
      count = count + 1
    }
    return first

  }
}