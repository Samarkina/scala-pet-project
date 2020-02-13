package com.samarkina.petproject.book

import scala.collection.mutable
import scala.collection.mutable.ArrayBuffer

object chapter3 {

  def main(args: Array[String]): Unit = {
    val n = 10
    val a = new Array[Int](n)
//    println(func(a, n).mkString(", "))
//    println(smezh(func(a, n)).mkString(", "))
//    println(smezh2(func(a, n)))
//    println(polOtr(Array(-2, -1, 2, 3, -4, 5)).mkString(", "))
//    println(sredZnach(Array(-1.3, -1.2, 1.3, 1.2, -4, 5)))
//      println(reverseArray(Array(-2, -1, 2, 3, -4, 5)).mkString(", "))
//      println(povtorElem(Array(-2, -1, -2, -1, -4, 5)).mkString(", "))
//      println(america().mkString(", "))
      println(importFunc())
  }

  def func(a: Array[Int], n: Int): Array[Int] = {
    for(i <- 0 until n) {
      a(i) = i
    }
    a
  }

  def smezh(a: Array[Int]) = {
    for(i <- 0 to a.length - 2 by 2) {
      val tmp = a(i)
      a(i) = a(i + 1)
      a(i + 1) = tmp
    }
    a
  }

  def smezh2(a: Array[Int]) = {
//    for(i <- 0 to a.length - 2 by 2) yield (a(i + 1), a(i))
    for(i <- 0 to a.length - 2 by 2) yield Array(a(i + 1), a(i)).mkString(", ")


//    var flag = 0
//    for(i <- 0 to a.length - 2) yield {
//      if (flag == 1) {
//        a(i)
//      }
//      else {
//        a(i + 1)
//      }
//    }

  }

  def polOtr(a: Array[Int]) = {
    a.filter(_ > 0) ++ a.filter(_ <= 0)
  }

  def sredZnach(a: Array[Double]) = {
    a.sum / a.length
  }

  def reverseArray(a: Array[Int]) = {
    a.reverse
  }

  def reverseArrayBuffer(a: ArrayBuffer[Int]) = {
    a.reverse
  }

  def povtorElem(a: Array[Int]) = {
    a.distinct
  }

  def america() = {
    java.util.TimeZone.getAvailableIDs.filter(_.containsSlice("America/")).map(_.replace("America/", ""))

  }

  def importFunc(): mutable.Buffer[String] = {
    import java.awt.datatransfer._

    import scala.collection.JavaConversions.asScalaBuffer

    val flavors = SystemFlavorMap.getDefaultFlavorMap.
      asInstanceOf[SystemFlavorMap]

    flavors.getNativesForFlavor(DataFlavor.imageFlavor)

  }



}
