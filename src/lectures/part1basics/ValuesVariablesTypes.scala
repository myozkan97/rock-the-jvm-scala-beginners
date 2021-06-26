package lectures.part1basics

object ValuesVariablesTypes extends App {

  val x: Int = 42
  println(x)

  // VALS ARE IMMUTABLE, THIS WILL UPSET THE COMPILER
  // x = 2

  // Compiler can infer types
  val y =  42

  // semicolons are allowed but not necessary, they are needed if you put multiple statements in one line
  val aString: String = "hello";

  val aBoolean: Boolean = false

  val aChar: Char = 'a'

  val anInt: Int = x
  val aShort: Short = 23454
  val aLong: Long = 234234234L
  val aFloat: Float = 2.0f
  val aDouble: Double = 3.14

  // VARIABLES
  var aVariable: Int = 4

  // they can be reassigned
  aVariable = 5 // side effects, be mindful about them


  /*  TAKEAWAYS
  *   prefer vals over vars
  *   all vals and vars have types
  *   compiler automatically infers types when omitted
  *
  * */





}
