/**
 * Created by colmcavanagh on 5/2/14.
 */
object Chapter2 extends App {


  def computeUniCode(z: String) {
    var sum = 0
    for (i <- z) {
      sum += i.toInt
      println(sum)
    }
    sum
  }
  println(computeUniCode("Hello"))
  //carys example like p185
  def signum(i: Int): Int = i match {
    case n if n > 0 => 1
    case n if n < 0 => -1
    case _ => 0//anything else
  }
}