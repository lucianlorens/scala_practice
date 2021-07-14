package com.boilerplates.computation.utils

import java.text.SimpleDateFormat
import java.time.LocalDate
import java.time.format.{DateTimeFormatter, DateTimeFormatterBuidler}
import java.time.format.DateTimeFormatter.{BASIC_ISO_DATE, ISO_LOCAL_DATE}
import java.time.temporal.ChronoUnit.DAYS
import java.util.Calendar

import org.apache.commons.lang.StringUtils.{isEmpty, isNotEmpty}
import scala.util.Try


class DateUtils

object DateUtils {
  private val DD_MM_YYYY_FORMAT = new DateTimeFormatterBuilder().parseLenient
    .appendPattern("dd/MM/yyyy")
    .toFormatter

  private val DD_MM_YY_FORMAT = new DateTimeFormatterBuilder().parseLenient
    .appendPattern("dd/MM/YY")
    .toFormatter

  /**
   * Converts a dd/MM/yyyy to a yyyy-MM-dd format
   * @param dateAsString the date to convert
   * @return a String representing the ISO date
   */
  def convertToIsoDate(dateAsString: String): String = {
    convertTo(dateAsString, DD_MM_YYYY_FORMAT, ISO_LOCAL_DATE)
  }


  /**
   * Converts a yyyy-MM-dd to a yyyyMMdd format
   * @param dateAsString the date to convert
   * @return a String representing the ISO date
   */
  def convertIsoDateToBasicIsoDate(dateAsString: String): String = {
    convertTo(dateAsString, ISO_LOCAL_DATE, BASIC_ISO_DATE)
  }

  private def convertTo(dateAsString: String,
                        inputFormatter: DateTimeFormatter,
                        outputFormatter: DateTimeFormatter): String = {
    if (isEmpty(dateAsString)) {
      null
    } else {
      val date = LocalDate.parse(dateAsString, inputFormatter)
      outputFormatter.format(date)
    }
  }

  /**
   * Serializes a date to a yyyy-MM-dd format
   */
  def serializeToIsoDateFormat(date: LocalDate): String ={
    if (date == null ){
      null
    } else {
      ISO_LOCAL_DATE.format(date)
    }
  }





}
