package com.samarkina.petproject.spark.testingSpark

import org.apache.spark.sql.SparkSession

object RDD {
  def main(args: Array[String]): Unit = {
    val spark = SparkSession.builder
      .master("local[*]")
      .appName("Set_theory")
      .getOrCreate()

    spark.sparkContext.setLogLevel("ERROR")
    val sc = spark.sparkContext

    // read from file
    val stateNamesCSV = sc.textFile("src/main/resources/StateNames.csv")
    // split / clean data
    val headerAndRows = stateNamesCSV.map(line => line.split(",").map(_.trim))
    // get header
    val header = headerAndRows.first
    // filter out header (eh. just check if the first val matches the first header name)
    val data = headerAndRows.filter(_ (0) != header(0))
    // splits to map (header/value pairs)
    val stateNames = data.map(splits => header.zip(splits).toMap)
    // print top-5
    stateNames.take(5).foreach(println)

  }
}

import org.apache.spark.sql.SparkSession

object SimpleApp {
  def main(args: Array[String]) {
    val spark = SparkSession.builder
      .master("local[*]")
      .appName("Set_theory")
      .getOrCreate()
    spark.sparkContext.setLogLevel("ERROR")
    val sc = spark.sparkContext

    val lines = sc.textFile("src/main/resources/data.txt")
    val lineLengths = lines.map(s => s.length)
    val totalLength = lineLengths.reduce((a, b) => a + b)
    println(lineLengths)
    println("totalLength")
    println(totalLength)
  }
}
