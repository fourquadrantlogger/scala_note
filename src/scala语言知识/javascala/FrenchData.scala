package scala语言知识.javascala

import java.util.{Date, Locale}
import java.text.DateFormat
import java.text.DateFormat._

/**
  * Created by timeloveboy on 16/10/17.
  */
object FrenchData {
  def main(args:Array[String]): Unit ={
    val now=new Date
    val df=getDateInstance(LONG,Locale.FRANCE)
    println(df format now)
  }
}
