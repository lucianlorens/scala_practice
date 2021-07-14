package com.boilerplates.subject.computer.dao

import com.sun.org.slf4j.internal.LoggerFactory
//import org.slf4j.LoggerFactory

class SubjectDao

object SubjectDao{
  private val logger = LoggerFactory.getLogger(classOf[SubjectDao])
  protected val SubjectColumns = List(
    "subject.column1",
    "subject.column2"
  )

  def storeSubjectWrapperIntoHive(
    asOfDate: String,


                                 )

}
