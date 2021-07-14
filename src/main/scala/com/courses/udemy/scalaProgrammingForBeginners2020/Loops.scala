package com.courses.udemy.scalaProgrammingForBeginners2020

object Loops {
  def main(args: Array[String]): Unit = {
//    for (a <- 1 to 3; b <- 1 to 3) yield println((a, b))
    val scalaList = List(1,2,3,4)
    scalaList.foreach(println)
    val (ayn, tchocash) = ("ayn", "tchocash")

    println(ayn, tchocash)

    def oneFunction( parameter: String ) : String ={
        parameter
    }




  }
}
