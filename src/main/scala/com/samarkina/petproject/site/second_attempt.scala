package com.samarkina.petproject.site

object second_attempt {
  def main(args: Array[String]): Unit = {
    println(last(List(1, 2, 3, 4)))
    println(last_but_one(List(1, 2, 3, 4)))
    println(k_symbol(2, List(1, 2, 3, 4)))
    println(find_length(List(1, 2, 3, 4)))
    println(reverse_list(List(1, 2, 3, 4)))

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

}
