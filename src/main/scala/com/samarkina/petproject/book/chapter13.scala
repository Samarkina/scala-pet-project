package com.samarkina.petproject.book

object chapter13 {

  def main(args: Array[String]): Unit = {

    println(func1)
    println(func2)
    println(func3)

  }

  def func1() = {
    for (i <- (0 until 100).par) print(i + " ")
  }

  def func2() = {
    for (i <- (0 until 100).par) yield i + " "
  }

  def func3() = {
    (0 until 100).par.filter(_ % 2 == 0)
  }

}
