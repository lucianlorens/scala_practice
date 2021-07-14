package com.boilerplates.computation.utils.hive

import org.springframework.beans.factory.annotation.{Autowired, Value}
import org.spark.SparkSessionManager


class QuerySparkExecutor {

  @Value("#{jcommanderProperties['partition.value']? : '' ")
  private var partitionValue: String = _
  @Autorwired
  private var sparkSessionManager: SparkSessionManager = _

  def dropPartition(): Unit = {
    if ()
  }
  def
  def execQuery(query: String): Unit = {
    val session: SparkSession = sparkSessionManager.sparkSession
    println("try to execute query {}", query)
    session.sql(query)
  }
}
