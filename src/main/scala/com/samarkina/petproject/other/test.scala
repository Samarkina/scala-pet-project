package com.samarkina.petproject.other

import java.util.Calendar

object test {
  def main(args: Array[String]): Unit = {
    val list = List(1, 2, 3, 4)
    for (l <- list if l % 2 == 0) {
      println(s"${l} is even")
    }

//    val doubled = list.map(l => l * 2)
    val doubled = list.map(_ * 2)
    println(doubled)

    val string_list = List("124", "234")
//    val len = string_list.map(l => l.length * 2)
    val len = string_list.map(_.length * 2)
    println(len)

    val test_map = Map((1, "Lena"), (2, "Olya"), (3, "Olga"), (4, "Daria"))

    val cleared_map = test_map.map{case (k, v) => (k, v + " Lastname")}
    println(cleared_map)

    val a = List(1,2,3,5,6)
    val b = List(3,4,5)
    val result = a.zip(b)
    println(result)

    val test_seq: Seq[Int] = Seq(1, 2, 3, 4)
    val filtered_seq = test_seq.filter(_ > 3)
    println(filtered_seq)

    val sum_seq = test_seq.sum
    val reduced_right_seq = test_seq.reduceRight(_ - _)
    val reduced_left_seq = test_seq.reduceLeft(_ - _)
    println(sum_seq)
    println(reduced_right_seq)
    println(reduced_left_seq)

    val fold_left_seq = test_seq.foldLeft(100)(_ - _)
    println(fold_left_seq)

    // diff reduceRight and reduceLeft

    val divide = (x: Double, y: Double) => {
      val result = x - y
      println(s"$x minus $y is $result")
      result
    }

    val c = Array(1.0, 2.0, 3.0, 4.0)
    val reduce_left_c = c.reduceRight(divide)

    val string_list_2 = "apple" :: "banana" :: 1 :: 2 :: Nil

    val strings = string_list_2.filter {
      case s: String => true
      case _ => false
    }
    println(strings)

    def onlyStrings(a: Any) = a match {
      case s: String => true
      case _ => false
    }

    val strings_2 = string_list_2.filter(onlyStrings)
    println(strings_2)

    val now = Calendar.getInstance().getTime
    print(now)


  }

}
