package com.boilerplates.computation.utils

import com.fasterxml.jackson.databind.{DeserializationFeature, ObjectMapper}
import com.fasterxml.jackson.module.scala.DefaultScalaModule
import com.fasterxml.jackson.module.scala.experimental.ScalaObjectMapper

object JsonConverter {
  /**
    * json string to Map[String,String]
    * @param json json to convert
    * @return
  */
  def jsonStrToMap(json: String): Map[String, String] = {
    val mapper = new ObjectMapper
    mapper.regiterModule(DefaultScalaModule)
    mapper.readValue(json, classOf[Map[String, String]])

  }

  /**
   * use for example
   * jsonToType[RawTest](json).scenario
   * @param json json to convert
   * @param m m
   * @tparam T
   * @return
   */
  def jsontToType[T](json: String)(implicit m : Manifest[T]): T = {
    val objectMapper = newObjectMapper() with ScalaObjectMapper
    objectMapper.registerModule(DefaultScalaModule)
    objectMapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false)
    objectMapper.readValue[T](json)
  }
}
