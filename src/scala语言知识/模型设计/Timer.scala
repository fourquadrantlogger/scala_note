package scala语言知识.模型设计

import java.lang.Thread._
import java.util.Date

/**
  * Created by timeloveboy on 16/10/18.
  */
object Timer {
  def oncePerSecond(callback:()=>Unit): Unit ={
    while (true){
      callback();
      sleep(1000);
    }
  }
  def dosomething(){
    println(new Date().toString())
  }

  def main(args: Array[String]) {
    oncePerSecond(dosomething)
  }
}
