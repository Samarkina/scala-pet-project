package com.samarkina.petproject


import com.datastax.spark.connector.SomeColumns
import com.datastax.spark.connector.writer.{TTLOption, WriteConf}
import org.apache.kafka.common.serialization.StringDeserializer
import org.apache.spark._
import org.apache.spark.sql.{Dataset, SparkSession}
import org.apache.spark.streaming._
import org.apache.spark.streaming.kafka010._
import org.apache.spark.streaming.dstream.DStream

object HelloWorld extends App {
  println("Hello World!")
}

object some {
  def main(args: Array[String]): Unit = {
    val str = "2 4 5 6 7 8 9"
    val pairs = str.map(letter => (letter, 1))
//    println(pairs)

//    val sc = new StreamingContext(spark.sparkContext, Seconds(1))

    val spark = SparkSession.builder
      .master("local[*]")
      .appName("Set_theory")
      .getOrCreate()

    spark.sparkContext.setLogLevel("ERROR")
    val sc = spark.sparkContext


    // Set Theory in Spark
    val jvmLanguages = sc.parallelize(List("Scala", "Java", "Groovy", "Kotlin", "Ceylon"))
    val functionalLanguages = sc.parallelize(List("Scala", "Kotlin", "JavaScript", "Haskell"))
    val webLanguages = sc.parallelize(List("PHP", "Ruby", "Perl", "PHP", "JavaScript"))

    val result = webLanguages.distinct.union(jvmLanguages)
    println(result.toDebugString)
    result.collect.foreach(println)

    println("----Intersection----")
    val intersection = jvmLanguages.intersection(functionalLanguages)
    println(intersection.toDebugString)
    intersection.collect.foreach(println)

    println("----Subtract----")
    val substraction = webLanguages.distinct.subtract(functionalLanguages)
    println(substraction.toDebugString)
    substraction.collect.foreach(println)



  }
}

