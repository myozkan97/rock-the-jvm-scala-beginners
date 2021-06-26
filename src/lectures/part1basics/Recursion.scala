package lectures.part1basics

import scala.annotation.tailrec

object Recursion extends App {

  def factorial(n: Int): Int =
    if (n <= 1) 1
    else {
      println("Computing factorial of " + n + " - I first need factorial of " + (n - 1))
      val result = n * factorial(n - 1)
      println("Computed factorial of " + n)

      result
    }

  println(factorial(10))
//  println(factorial(1000)) // this will crash (stackoverflow)




  // TAIL RECURSION
  // use recursive call as the LAST expression
  def anotherFactorial(n: Int): BigInt = {
    @tailrec  // use this to prevent non tail recursive functions
    def factorialHelper(x: BigInt, accumulator: BigInt): BigInt =
      if (x <= 1) accumulator
      else factorialHelper(x - 1, x * accumulator)

    factorialHelper(n, 1)

  } // this prevents Scala from using extra stack frame

  println(anotherFactorial(13200)) // this'll work


  // NOTE: When you need loops, use tail recursion




  /*
    1. Concatenate a string n times
    2. IsPrime function tail recursive
    3. Fibonacci function, tail recursive
  */

  @tailrec
  def concatenate(str: String, n: Int, acc: String): String = {
    if (n <= 0) acc
    else concatenate(str, n-1, str + acc)
  }

  println(concatenate("hello", 100, ""))



  def isPrime(n: BigInt): Boolean = {
    @tailrec
    def isPrimeHelper(m: BigInt, stillPrime: Boolean): Boolean = {
      if (!stillPrime) false
      else if (m <= 1) true
      else isPrimeHelper(m - 1, (n % m) != 0)
    }

    isPrimeHelper(n / 2, stillPrime = true)
  }

  println(isPrime(234))


  def fibonacci(n: Int): Int = {
    @tailrec
    def fibonacciHelper(m: Int, min1: Int, min2: Int): Int = {
      if (m >= n) min1
      else fibonacciHelper(m + 1, min1 + min2, min1)
    }

    if (n <= 2) 1
    else fibonacciHelper(2, 1, 1)
  }

  println(fibonacci(8))

}


