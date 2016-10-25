object run {
  def main(args: Array[String]) {
    for (x <- List(1, 2, 3, 4, 5, 6, 7, 8, 9, 10) if x % 2 == 0) println(x)
  }
}
