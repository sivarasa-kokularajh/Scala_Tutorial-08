object NumberPatternMatching {
  def main(args: Array[String]): Unit = {
    if (args.length == 1) {
      val input = args(0).toInt
      val result = input match {
        case n if n <= 0 => "Negative/Zero is input"
        case n if n % 2 == 0 => "Even number is given"
        case n if n % 2 != 0 => "Odd number is given"
      }
      println(result)
    } else {
      println("Please provide a single integer input.")
    }
  }
}
