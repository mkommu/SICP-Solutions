
package com.mohan.coe.sicp.scala

object SumOfTwoLargeSquares1 {
def main(args: Array[String]): Unit = {

    def square(x: Int) : Int = x * x

    def sumSquares(x:Int, y:Int) : Int = square(x) + square(y)

    def sumOfTwoLargeSquares(x:Int,y:Int,z:Int): Int =
      if(x >= y)
        sumSquares(x, if(y > z) y else z)
    else
        sumSquares(y, if(x > z) x else z)

    val sum = sumOfTwoLargeSquares(5,2,5)
    println("-sum->>>"+sum)

  }

}
