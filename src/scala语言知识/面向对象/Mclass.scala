package scala语言知识.面向对象

/**
  * Created by timeloveboy on 16/10/18.
  */
class Mclass(a:Int,b:Int) {
    override def toString(): String = {
        return "" + A() + "," + B()
    }

    def A()=a
    //定义了2个有0个参数的函数。2个函数,分别返回a和b

    def B() = b
}
