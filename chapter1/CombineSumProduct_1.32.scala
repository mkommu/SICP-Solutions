package com.mohan.coe.sicp.scala

object CombineSumProduct111 {

  def main(args: Array[String]): Unit = {

    def mapReduce(f: Int => Int, combine: (Int, Int) => Int, zero: Int)(a: Int, b: Int): Int =
      if( a > b) zero
      else combine(f(a), mapReduce(f, combine, zero)(a + 1, b))

    def product(f: Int => Int)(a: Int, b: Int): Int = mapReduce(f, (x,y) => x * y, 1)(a, b)

    product(x => x * x)(3,4)

    def fact(n: Int) = product(x => x)(1, n)
    val factorial = fact(5)
    println("---------------->"+factorial)
  }
}
