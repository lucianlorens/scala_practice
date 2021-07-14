package com.boilerplates.computation.model

object Subject {
  def apply(
     column1: String,
     column2: String
  ): Subject =
    this(
      column1,
      column2
    )
}

case class Subject(
                  column1: String,
                  column2: String
                  )
