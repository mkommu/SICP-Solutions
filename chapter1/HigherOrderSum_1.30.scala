package com.mohan.coe.sicp.scala

object HigherOrderSum {

  def main(args: Array[String]): Unit = {

    // Iterative Way
    def sum(f: Int => Int, a:Int, b:Int) : Int =
      if (a > b) 0
      else f(a) + sum(f, a+1, b)

    def sumProduct(a: Int, b: Int): Int =
      sum(x => x+x, a,b)
    val aa = sumProduct(3,6)
    println("-----aa------->>>"+aa)

    //Tail Recursion
    def recurSum(f: Int => Int,a: Int, b: Int ) = {
      def loop(a: Int, acc: Int): Int =
        if ( a > b) acc
        else
          loop(a+1, f(a) + acc)
      loop(a,0)
    }
    val bb = recurSum(x => x+x,3,6)
    println("--------bb--->>>>>>"+bb)

  }

}
