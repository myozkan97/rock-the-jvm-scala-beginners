package lectures.part1basics

import scala.annotation.tailrec

object _6_DefaultArgs extends App {


  // Default arguments
  @tailrec
  def trFactorial(n: Int, acc: Int = 1): Int =
    if (n <= 1) acc
    else trFactorial(n-1, n*acc)

  val fact10 = trFactorial(10)
  val fact11 = trFactorial(11, 2)


  def savePicture(format: String = "jpg", width: Int = 1920, height: Int = 1080): Unit = println("saving picture")
  savePicture("jpg", 800, 600)
  // savePicture(800, 600) this won't work

  /*
  * 1. pass in every leading argument
  * 2. name the arguments
  * */

  savePicture(width = 800) // takes default vals for other parameters
  savePicture(height = 600, width = 800, format = "bmp") // order changed


}
