package com.mohan.coe.sicp.scala

object CurryingProduct {

  def main(args: Array[String]): Unit = {

    def product(f: Int => Int)(a: Int, b: Int): Int =
      if( a > b) 1
      else f(a) * product(f)(a+1,b)

    val aa = product(x => x*x)(3,4)
    println("-------(f)(Int,Int)-----"+aa)
  }
