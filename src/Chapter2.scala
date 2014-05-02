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
}