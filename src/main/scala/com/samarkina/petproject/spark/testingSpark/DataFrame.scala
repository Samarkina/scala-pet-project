package com.samarkina.petproject.spark.testingSpark

object DataFrame {
  def main(args: Array[String]): Unit = {
    import org.apache.spark.sql.SparkSession

    val spark = SparkSession
      .builder()
      .appName("Spark SQL basic example")
//      .config("spark.some.config.option", "some-value")
      .config("spark.master", "local")
      .getOrCreate()

    // For implicit conversions like converting RDDs to DataFrames
    import spark.implicits._

    val df = spark.read.json("src/main/resources/people.json")

    // Displays the content of the DataFrame to stdout
    df.show()




  }

}
