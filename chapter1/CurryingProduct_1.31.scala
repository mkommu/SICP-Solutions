package com.mohan.coe.sicp.scala

object CurryingProduct {

  def main(args: Array[String]): Unit = {

    def product(f: Int => Int)(a: Int, b: Int): Int =
      if( a > b) 1
      else f(a) * product(f)(a+1,b)

    val aa = product(x => x*x)(3,4)
    println("-------(f)(Int,Int)-----"+aa)
  }
  
  // Factorial in terms of product
   def factorial(n: Int) = product(x => x)(1,n)
   val fact = factorial(5)
   println("------fact------>>>"+fact)
  
  
  
