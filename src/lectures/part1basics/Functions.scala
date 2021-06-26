package lectures.part1basics

object Functions extends App {

  def aFunction(a: String, b: Int): String =
    a  + " " + b

  println(aFunction("hello", 3))


  def aParameterlessFunction(): Int = 42

  println(aParameterlessFunction())
  println(aParameterlessFunction) // this is also ok


  def aRepeatedFunction(aString: String, n: Int): String = {
    if (n == 1) aString
    else aString + aRepeatedFunction(aString, n - 1)
  }

  println(aRepeatedFunction("hello", 3))

  // WHEN YOU NEED LOOPS, USE RECURSION!!!!


  // compiler can infer the return type of a function
  def anotherFunction(a: String, b: Int) =
    a  + " " + b


  // in recursive functions though, compiler cannot infer the return type of a function
//  def anotherRepeatedFunction(aString: String, n: Int) = {
//    if (n == 1) aString
//    else aString + anotherRepeatedFunction(aString, n - 1)
//  }



  // for functions with just side effects, return Unit
  def aFunctionWithSideEffects(aString: String): Unit = println(aString)

  // nested functions
  def aBigFunction(n: Int): Int = {
    def aSmallerFunction(a: Int, b: Int): Int = a + b

    aSmallerFunction(n, n-1)
  }



  /*
  * 1. Write a greeting function (name, age) => "Hi, my name is $name and I am $age years old"
  * 2. Write a Factorial function 1 * 2 * 3 ... * n (Recursive)
  * 3. Write a Fibonacci Function f(1) = 1, f(2) = 1, f(n) = f(n-1) + f(n - 2)
  * 4. Test if a number is prime
  * */

  def greetingFunction(name: String, age: Int): String = {
    "Hi, my name is " + name + " and I am " + age + " years old."
  }

  def factorialFunction(n: Int): Int = {
    if (n <= 0) 1
    else n * factorialFunction(n - 1)
  }

  println(factorialFunction(5))



  def fibonacci(n: Int): Int = {
    if (n <= 2) 1
    else  fibonacci(n - 1) + fibonacci(n - 2)
  }

  println(fibonacci(4))


  def isPrime(n: Int): Boolean = {
    def isPrimeUntil(t: Int): Boolean =
      if (t <= 1) true
      else n % t != 0 && isPrimeUntil(t-1)

    isPrimeUntil(n / 2)
  }

  println(isPrime(12))




// compiler cannot infer type of a recursive function






}
