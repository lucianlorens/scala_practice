package com.boilerplates.computation.subject.computer

import com.boilerplates.computation.model.Subject
import com.boilerplates.computation.subject.loader.SubjectCsvLoader
import org.scalatest.{FlatSpec, Matchers}


class SubjectComputerTest extends FlatSpec with Matchers {
private val sqlContext = SparkContextProducer.sqlContext

  private val subjectDS = SubjectCsvLoader.loadSubject("path.csv", sparkSession)


  "test valueCreation" should "compute correctly" in {
    val subjectDataSet = Subject(
      "value1",
      "value2"
    )

    val expectedSubjectDataSet = Subject(
      "value1",
      "value2"
    )

    subjectDataSet shouldBe expectedSubjectDataSet

  }

}
