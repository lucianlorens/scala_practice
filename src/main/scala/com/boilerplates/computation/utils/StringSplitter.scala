package com.boilerplates.computation.utils

import scala.annotation.tailrec

import org.apache.spark.sql.Row

object StringSplitter {
  /**
   * Function that split a line to a Row according to a list of fields length
   * @param str str
   * @param fieldsSize field Size
   * @return
   */
  def splitFixedWithStr(str: String, fieldsSize: List[Int]): Row = {
    @tailrec
    def splitLine(line: String,
                  fieldsSize: List[Int],
                  fields: List[String]): List[String] = {
      if (line.isEmpty || fieldsSize.isEmpty) fields
      else {
        splitLine(line.substring(fieldsSize.head),
          fieldsSize.tail,
          fields ++ List(line.substring(0, fieldsSize.head).trim))
      }
    }

    Row.fromSeq(splitLine(str, fieldsSize, List[String]()))
  }
}
