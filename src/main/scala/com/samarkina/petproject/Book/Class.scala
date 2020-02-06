package com.samarkina.petproject.Book

class Person(name: String, age: Int) {
  def description = name + "is" + age + "Years old"
}

class Person2(val name: String, val age: Int) {
  def description = name + "is" + age + "Years old"
}


object Class {

  def main(args: Array[String]): Unit = {
    val person = new Person("Kate", 25)
   // person.name not exist

    val person2 = new Person2("Kate", 25)
    println(person2.age)
    //we can use age an name




  }
}