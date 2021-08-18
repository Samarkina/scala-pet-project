package com.samarkina.petproject.site

import scala.collection.mutable.ListBuffer

object second_attempt {
  def main(args: Array[String]): Unit = {
    println(last(List(1, 2, 3, 4)))
    println(last_but_one(List(1, 2, 3, 4)))
    println(k_symbol(2, List(1, 2, 3, 4)))
    println(find_length(List(1, 2, 3, 4)))
    println(reverse_list(List(1, 2, 3, 4)))
    println(palindrome(List(1, 2, 3, 2, 1)))
    println(flat(List(1, 2, List(1, 2), 2, 1)))
    println(compress(List(1, 2, 3, 2, 2, 3, 4)))

  }

  // P1. Find the last element of a list.
  def last(list: List[Int]): Int = {
    val elem = list.last
    elem
  }

  // P2. Find the last but one element of a list.
  def last_but_one(list: List[Int]): Int = {
    val elem = list(list.length - 2)
    elem
  }

  // P3. Find the Kth element of a list.
  def k_symbol(k: Int, list: List[Int]): Int = {
    val elem = list(k)
    elem
  }

  // P4. Find the number of elements of a list.
  def find_length(list: List[Int]): Int = {
    val elem = list.length
    elem
  }

  // P5. Reverse a list.
  def reverse_list(list: List[Int]): List[Int] = {
    val elem = list.reverse
    elem
  }

  // P6. Find out whether a list is a palindrome.
  def palindrome(list: List[Int]): Boolean = {
    list == list.reverse
  }

  // P7. Flatten a nested list structure.
  def flat(list: List[Any]): List[Any] = {
    list flatMap {
      case ms: List[_] => flat(ms)
      case e => List(e)
    }
  }

  // P8. Eliminate consecutive duplicates of list elements.
  def compress(list: List[Any]): List[Any] = {
    val compressed_list: ListBuffer[Any] = ListBuffer[Any]()
    list foreach { a =>
      if (!(compressed_list.contains(a))) {
        compressed_list += a
      }
    }
    compressed_list.toList
  }

}
