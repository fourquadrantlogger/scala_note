package scala语言知识.语法

/**
  * Created by paidian on 17-2-14.
  */
object expression {
  def main(arg: Array[String]): Unit = {
    val c = {
      val i1 = 234
      val j1 = 234235 / i1
      i1 * j1
    }

    println(c)
  }
}
