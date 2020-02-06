package com.samarkina.petproject.Book


object chapter4 {

  def main(args: Array[String]): Unit = {
    val n = 10
    val a = new Array[Int](n)

    println(func1.mkString(", "))
    println(func1)

  }

  def func1() = {
    val first = Map("Eyeshadow" -> 10, "Jeans" -> 30, "Milk" -> 4)
    for((k, v) <- first) yield {
      (k, v - v * 10 / 100)
    }
//    first.map((k, v) => (k, v - v * 10 / 100))

  }


}
