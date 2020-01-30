package com.samarkina.petproject

object Skeleton {

   def main(args: Array[String]): Unit = {

//     println( last(List(1, 1, 2, 3, 5, 8)) )
//     println( penultimate(List(1, 1, 2, 3, 5, 8)) )
//     println( nth(3, List(1, 1, 2, 3, 5, 8)) )
//     println( length(List(1, 1, 2, 3, 5, 8)) )
//     println( reverse(List(1, 1, 2, 3, 5, 8)) )
//     println( isPalindrome(List(1, 2, 3, 2, 1)) )
//     println( isPalindrome2(List(1, 2, 3, 2, 1)) )
//     println( isPalindrome2(List(1, 3, 3, 2, 1)) )
     val list = List(List(1, 1), 2, List(3, List(5, 8)), List(3, List(5, 8, List(9))))
     //println( list.flatten(x => x) )
//     println( flatten(List(List(1, 1), 2, List(3, List(5, 8)), List(3, List(5, 8, List(9))))) )
//      val li = List(List(1, 1), 2, List(3, List(5, 8)))
//     val name = Seq("Nidhi", "Singh")
//     print(li.flatMap(_.toString))


   }


  def last(list: List[Int]): Int = {
    // Find the last element of a list.
    list.last
  }

  def penultimate(list: List[Int]) : Int = {
    // Find the last but one element of a list.
    //  предпоследний
    //  list(list.size - 2)
    list.init.last
  }

  def nth(number: Int, list: List[Int]) : Int = {
    // Find the Kth element of a list.
    // By convention, the first element in the list is element 0.
    // Example:
    //
    // scala> nth(2, List(1, 1, 2, 3, 5, 8))
    // res0: Int = 2
    list(number)
  }

  def length(list: List[Int]) : Int = {
    // Find the number of elements of a list.
    //Example:
    //scala> length(List(1, 1, 2, 3, 5, 8))
    //res0: Int = 6
    list.length
  }

  def reverse(list: List[Int]) = {
    //  Reverse a list.
    //Example:
    //scala> reverse(List(1, 1, 2, 3, 5, 8))
    //res0: List[Int] = List(8, 5, 3, 2, 1, 1)
    list.reverse
  }

  def isPalindrome(list: List[Int]) : Boolean  = {
    // Find out whether a list is a palindrome.
    //Example:
    //scala> isPalindrome(List(1, 2, 3, 2, 1))
    //res0: Boolean = true

    val len = list.length
    for(i <- 0 until len / 2) {
      println(len - i - 1)
      if (list(i) != list(len - i - 1)) return false
    }
    true
  }

  def isPalindrome2(list: List[Int]) : Boolean  = {
    // Find out whether a list is a palindrome.
    //Example:
    //scala> isPalindrome(List(1, 2, 3, 2, 1))
    //res0: Boolean = true

    list == list.reverse
  }

 // def flatten(list: List[Any])   = {
    // Flatten a nested list structure.
    //Example:
    //scala> flatten( List(List(1, 1), 2, List(3, List(5, 8))) )
    //res0: List[Any] = List(1, 1, 2, 3, 5, 8)

//     list.flatMap {
//        case ms: List[_] => {
//          println("ms: " + ms)
//          flatten(ms)
//        }
//        case e => {
//          println("e: " + e)
//          List(e)
//        }
//     }

//    list.map {
//      case ms: List[_] => {
//        println("ms: " + ms)
//        flatten(ms)
//      }
//      case e => {
//        println("e: " + e)
//        e
//      }
//    }






  //}





}
