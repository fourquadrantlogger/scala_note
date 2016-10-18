import java.lang.Thread._
import java.util.Date

/**
  * Created by timeloveboy on 16/10/18.
  */
object Timer2 {
  def oncePerSecond(callback:()=>Unit): Unit ={
    while (true){
      callback();
      sleep(1000);
    }
  }

  def main(args: Array[String]) {
    oncePerSecond(()=>
      println(new Date().toString())
    )
  }
}