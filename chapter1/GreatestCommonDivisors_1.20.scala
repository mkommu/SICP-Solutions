package com.mohan.coe.sicp.scala

object GCD {

  def main(args: Array[String]): Unit = {

    def gcd(a: Int, b: Int): Int = {
      if( b == 0 ) a
      else gcd(b, a % b)
    }
    val result = gcd(206,40)
    println("----result--->>"+result)
  }
}

 /*     Applicative Order Evaluation 
        gcd(206,40)
    --> if(40 == 0) 206 else gcd(40, 206 % 40)
    --> if(false)   206 else gcd(40, 206 % 40)
    --> gcd(40, 206 % 40)
    -->> gcd(40, 6)
    --> if(6 == 0) 40 else gcd(6, 40 % 6)
    --> if(false) 40 else gcd(6, 40 % 6)
    --> gcd(6, 40 % 6)
    -->> gcd(6, 4)
    --> if(4 == 0) 6 else gcd(4, 6 % 4)
    --> if(false) 6 else gcd(4, 6 % 4)
    --> gcd(6, 6 % 4)
    -->> gcd(6, 2)
    --> if(2 == 0) 6 else gcd(2, 6 % 2)
    --> if(false) 6 else gcd(2, 6 % 2)
    --> gcd(2, 6 % 2)
    -->> gcd(2, 0)
    --> if(0 == 0) 2 else gcd(0, 2 % 0)
    --> if(true) 2 else gcd(0, 2 % 0)
    --> 2
  */

