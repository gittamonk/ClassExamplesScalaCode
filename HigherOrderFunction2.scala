package com.technogeeks.scala.function.m2

object HigherOrderFunction2 extends App{
  def capitalizefn(s:String) = s.head.toUpper + s.tail.toLowerCase




val mylistofValues = List("kumar","sampat","sCala","traiNING")



val resultList = mylistofValues.map(capitalizefn)

println(resultList)
println("#################33")
resultList.map(println)
println("#################33")
resultList.foreach(println)
println("#################33")


for (x <-resultList){
  println(x)
}

println(capitalizefn("Hadoop"))
}