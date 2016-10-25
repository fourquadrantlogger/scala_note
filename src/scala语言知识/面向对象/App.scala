package scala语言知识.面向对象

/**
  * Created by timeloveboy on 16/10/18.
  */
object App {
  def main(args: Array[String]) {
    val m=new Mclass(2,3)
    val n = new Nclass(2, 3)
    println (m.A())
    println(n.B)
    println(m)
  }
}
