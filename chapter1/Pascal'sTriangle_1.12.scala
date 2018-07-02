com.mohan.coe.sicp.scala

object Pascal {

  def main(args: Array[String]): Unit = {

    for(row <- 0 to 5){
      for(col <- 0 to row)
        print(pascal(col,row)+ " ")
      println()
    }
    def pascal(c:Int, r:Int): Int = (c,r) match {
        case(0,_) => 1
        case(c,r)  if(c==r) => 1
        case(c,r) => pascal(c,r-1)+pascal(c-1,r-1)
    }
  }
 }
