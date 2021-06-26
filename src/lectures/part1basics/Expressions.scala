package lectures.part1basics

object Expressions extends App {

  val x = 1 + 2 // expression
  println(x)

  println(2 + 3 * 4)
  // + - * / & | ^ << >> >>> (right shift with zero extension)

  println(1 == x)
  // == != > >= < <=

  println(!(1 == x))
  // ! && ||

  var aVariable = 2
  aVariable += 3 // also works with -= *= /= ....... side effects
  println(aVariable)


  // Instructions (DO) vs Expressions (VALUE)

  // IF expression
  val aCondition = true
  val aConditionedValue = if(aCondition) 5 else 3
  println(aConditionedValue)
  println(if(aCondition) 5 else 3)

  var i = 0
  var aWhile = while (i < 10) {
    println(i)
    i += 1

  }
  print(aWhile) // returns Unit

  // NEVER WRITE THIS AGAIN, AVOID LOOPS AT ALL COST!!!

  // EVERYTHING in Scala is an Expression!

  val aWeirdValue = (aVariable = 3) // Unit == void
  println(aWeirdValue)

  // side effects: println(), whiles, reassigning



  // CODE BLOCKS

  val aCodeBlock = {
    val y = 2
    val z = y + 1

    if (z > 2) "hello" else "goodbye"
  }
  // 1. code block is an expression
  // 2. value of the block is the value of the last expression
  // 3. type of this block is String since it's the value of the last expression
  // 4. what happens in block stays in block

  /* TAKEAWAYS
  *   if in Scala is an expression
  *   code blocks in Scala are expressions
  *   instructions are executed (Java), expressions are evaluated (Scala)
  *   in scala we'll think in terms of expressions
  *   do not use while loops, EVER!
  *  */



}
