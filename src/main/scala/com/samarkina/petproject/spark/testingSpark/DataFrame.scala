package com.samarkina.petproject.spark.testingSpark

case class Person(name: String, age: Long)

object DataFrame {
    // like Spark SQL, Datasets, DataFrame
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
    val df2 = spark.read.json("src/main/resources/people2.json")

    // Displays the content of the DataFrame to stdout
//    df.show()

//    df.printSchema()
//
//    df.select("name").show()
//
//    df.select("age").show()

//    df.select($"name", $"age" + 1).show()

//    df.filter($"age" > 21).show()
//
//    df.groupBy("age").count().show()
//
//


//    // Register the DataFrame as a SQL temporary view
//    df.createOrReplaceTempView("people")
//    df2.createOrReplaceTempView("people2")
//
//    val sqlDF2 = spark.sql("SELECT * FROM people2")
//    sqlDF2.show()
//
//    val sqlDF = spark.sql("SELECT * FROM people")
//    sqlDF.show()
//

//    // Register the DataFrame as a global temporary view
//    df.createGlobalTempView("people")
//
//    // Global temporary view is tied to a system preserved database `global_temp`
//    spark.sql("SELECT * FROM global_temp.people").show()
//    // +----+-------+
//    // | age|   name|
//    // +----+-------+
//    // |null|Michael|
//    // |  30|   Andy|
//    // |  19| Justin|
//    // +----+-------+
//
//    // Global temporary view is cross-session
//    spark.newSession().sql("SELECT * FROM global_temp.people").show()
//    // +----+-------+
//    // | age|   name|
//    // +----+-------+
//    // |null|Michael|
//    // |  30|   Andy|
//    // |  19| Justin|
//    // +----+-------+

    // DATASETS

    // Encoders are created for case classes
    val caseClassDS = Seq(Person("Andy", 32)).toDS()
    caseClassDS.show()
    // +----+---+
    // |name|age|
    // +----+---+
    // |Andy| 32|
    // +----+---+

    // Encoders for most common types are automatically provided by importing spark.implicits._
    val primitiveDS = Seq(1, 2, 3).toDS()
    primitiveDS.map(_ + 1).collect() // Returns: Array(2, 3, 4)
    primitiveDS.show()

    // DataFrames can be converted to a Dataset by providing a class. Mapping will be done by name
    val path = "src/main/resources/people.json"
    val peopleDS = spark.read.json(path).as[Person]
    peopleDS.show()
    // +----+-------+
    // | age|   name|
    // +----+-------+
    // |null|Michael|
    // |  30|   Andy|
    // |  19| Justin|
    // +----+-------+




  }

}
