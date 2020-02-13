package com.samarkina.petproject.book

import scala.io.Source

object chapter4 {

  def main(args: Array[String]): Unit = {
    val n = 10
    val a = new Array[Int](n)

//    println(func1.mkString(", "))
    println(func2)
    println(func3)
    println(func4)
    println(func5)

    {
      print("!@#")


    }


  }

  def func1() = {
    val first = Map("Eyeshadow" -> 10, "Jeans" -> 30, "Milk" -> 4)
    for((k, v) <- first) yield {
      (k, v - v * 10 / 100)
    }
  }

  def func2() = {
    val source = Source.fromInputStream(getClass.getResourceAsStream("../../../../myFile.txt"))
    val lineIterator = source.getLines
    val scores = scala.collection.mutable.Map[String, Int]()

    for (elem <- lineIterator) {
      if (scores.contains(elem)) scores(elem) += 1 else scores += ((elem, 1))
    }
    scores
  }


  def func3() = {
    val source = Source.fromInputStream(getClass.getResourceAsStream("../../../../myFile.txt"))
    val lineIterator = source.getLines
    var scores = Map[String, Int]()

    for (elem <- lineIterator) {
      if (scores.contains(elem)) scores = scores + ((elem, scores(elem) + 1)) else scores = scores + ((elem, 1))
    }
    scores
  }

  def func4() = {
    val source = Source.fromInputStream(getClass.getResourceAsStream("../../../../myFile.txt"))
    val lineIterator = source.getLines
    var scores = scala.collection.immutable.SortedMap[String, Int]()

    for (elem <- lineIterator) {
      if (scores.contains(elem)) scores = scores + ((elem, scores(elem) + 1)) else scores = scores + ((elem, 1))
    }
    scores
  }

  def func5() = {
    val source = Source.fromInputStream(getClass.getResourceAsStream("../../../../myFile.txt"))
    val lineIterator = source.getLines
    var scores = new java.util.TreeMap[String, Int]()

    for (elem <- lineIterator) {
      if (scores.containsKey(elem)) scores.put(elem, scores.get(elem) + 1) else scores.put(elem, 1)
    }
    scores
  }



}
