package com.samarkina.petproject.Book

object chapter2 {
  def main(args: Array[String]): Unit = {
//    while (true) {
//      val a = scala.io.StdIn.readLine("Write the number: \n").toInt
//      println(countDown(a))
//    }

//    for(i <- 0 to 10 reverse) println(i)
//    (10 to 0 by -1).foreach(println(_))
//    val s = "Hello"
//    for(elem <- s) {
//      elem.toLong
//    }
//    s.map(_.toLong).reduce(_ * _)
//    val s2 = s.map(_.toLong).product
//
//    println(s2)
    // 0 1 2 3 4 5

//    println(product("Hello"))
//    println(productRec("Hello"))


      println(xN(4, -2))





  }

  def sgn(x : Double): Int = {
    x match {
      case e if e < 0 => -1
      case e if e > 0 => 1
      case _ => 0
    }
  }

  def multiply(m: Int) = (n:Int) => m * n


  def countDown(n: Int) = {
    (n to 0 by -1).foreach(println(_))
  }

  def product(s: String) = {
    s.map(_.toLong).product
  }

  def productRec(s: String): Long = {
    if (s.isEmpty) 0
    else {
      val sHead = s.head.toLong
      if (s.length > 1) {
        sHead * productRec(s.tail)
      }
      else sHead
    }
  }

  def xN(x: Double, n: Int): Double = {
    n match {
      case n if n > 0 => x * xN(x, n - 1)
      case n if n < 0 => x * xN(1 / x, -n + 1)
      case _ => 1
    }
  }



}

