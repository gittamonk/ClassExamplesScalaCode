package com.technogeeks.scala.function.m2

object FunctionHigherOrderSample9 {
  def main(args: Array[String]) {

    println(apply(layout, 10))

  }

  def apply(f: Int => String, v: Int) = f(v)

  def layout[A](x: A) = "[" + x.toString() + "]"
}