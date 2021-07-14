package com.boilerplates.computation.subject.loader

import com.boilerplates.computation.model.Subject
import org.apache.spark.sql.{Dataset, SparkSession}

object SubjectCsvLoader {
  def subjectLoad (file: String, sparkSession: SparkSession) :DataSet[Subject] = {
  import sparkSession.implicits._
    sparkSession.read
      .format("csv")
      .option("delimiter", ";")
      .option("header", "true")
      .load(this.getClass.getResource(file).getPath)
      .map(
        row =>
          Subject(
            row(0),
            row(1)
          )
      )
  }

}
