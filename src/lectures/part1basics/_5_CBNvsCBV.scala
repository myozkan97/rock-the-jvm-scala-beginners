package lectures.part1basics

object _5_CBNvsCBV extends App {

  def calledByValue(x: Long): Unit = {
    println("by value: " + x)
    println("by value: " + x)
  }

  def calledByName(x: => Long): Unit = {
    println("by name: " + x)
    println("by name: " + x)
  }

  calledByValue(System.nanoTime())
  calledByName(System.nanoTime())

  /* output:
  by value: 163068856073400
  by value: 163068856073400
  by name: 163069039211600
  by name: 163069039339700
  * */


  def infinite(): Int = 1 + infinite()
  def printFirst(x: Int, y: => Int) = println(x)

//  printFirst(infinite(), 34) // this will crash
  printFirst(34, infinite())
  // line above won't crash, since it's called by name and not used. So it won't be evaluated
}

