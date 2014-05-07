import scala.actors.A

/**
 * Created by colmcavanagh on 5/6/14.
 */
def values(fun: (Int) => Int, low: Int, high: Int) = (low to high).map(i => (i, fun(i)))
values(x=> x * x ,-8 , 5)
//fun is the funotion which we apply to the
val a = Array(20, 12, 6, 15, 2, 9)
a.reduceLeft(_ + _)
a.reduceLeft(_ - _)
a.reduceLeft(_ * _)
a.reduceLeft(_ min _)
a.reduceLeft(_ max _)
def factorial(fac: Int) : Int = {
  (fac to (1, -1)).reduceLeft(_ * _)
}//calls itself fo frist time is 4x3
println(factorial(4))//so 4 x 3 x2 x1

val factorialWithFoldLeft = (n: Int) => (n to 1 by -1).foldLeft(1)(_ * _)
println(factorialWithFoldLeft(6))//fold left ignores the last one

def largest(fun: (Int) => Int, inputs: Seq[Int]) =inputs.map(fun).max
largest(x => 15 * x -x * x ,1 to 5)
//from coursera
def sum(f:Int=>Int,a:Int,b:Int):Int={
  if(a>b)0 else f(a)+sum(f,a+1,b)
}
//1+2+3+4
def sumInts(a:Int,b:Int):Int=sum(id,a,b)
def sumCube(a:Int,b:Int):Int=sum(cube,a,b)
def sumFact(a:Int,b:Int):Int=sum(fact,a,b)
def id(x:Int):Int=x
def cube(x:Int):Int=x*x*x
def fact(x:Int):Int=if(x==0)1 else fact(x-1)
sum(cube,1,5)//its smart enough to know
def adjustToPair(fun: (Int, Int) => Int) : ((Int, Int)) => Int = {
  case(x, y) => fun(x, y)
}
println(adjustToPair(_ * _)((6, 7)))


val pairs = (1 to 10) zip (11 to 20)
println(pairs.map(adjustToPair(_ + _)))

def corresponds[B](that:Seq[B])(p: (A,B)=> Boolean):Boolean
val x = Array("Hello","World")
val y = Array("hello","world")
x.corresponds(y)(_.equalsIgnoreCase(_))