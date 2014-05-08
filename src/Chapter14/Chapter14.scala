package Chapter14

/**
 * Created by colmcavanagh on 5/8/14.
 */
object Chapter14 extends App{
  def swap(p:Tuple2[Int,Int]) = p match {
    case (x,y) => (y,x)
    case _ => Nil
  }
  //use tuples

  val test = new Tuple2(1,2)
  println(swap(test))
//could just tuble.swap
  println(test.swap)
  def swapArray(p:Array[Int]):Array[Int] = p.splitAt(2) match {//took awhile to figture out snytax
    case (Array(x,y) ,z) => Array(y,x) ++z

  }
  val testArray=Array(1,2,3,4,5,6,7)
  val NewArray=swapArray(testArray)
  println(NewArray.deep.mkString(" "))//works


}


