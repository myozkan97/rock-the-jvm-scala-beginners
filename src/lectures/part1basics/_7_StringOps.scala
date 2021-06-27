package lectures.part1basics

object _7_StringOps extends App {

  val str: String = "Hello, I am learning Scala"

  // Java Stuff
  println(str.charAt(2))
  println(str.substring(2))
  println(str.substring(2, 11))
  println(str.split(" ").toList)
  println(str.startsWith("Hello"))
  println(str.replace("Hello", "Shalom"))
  println(str.toLowerCase())
  println(str.length)

  // Scala stuff
  val aNumberString = "45"
  val aNumber: Int = aNumberString.toInt
  println('a' +: aNumberString :+ 'z')
  println(str.reverse)
  println(str.take(2))

  // Scala-specific: String interpolators

  // S-interpolators
  val name = "Cem"
  val age = 34
  val greeting = s"Hello, my name is $name and I am $age years old."
  println(greeting)
  val anotherGreeting = s"Hello, my name is $name and I'll be turning ${age + 1} years old."
  println(anotherGreeting)


  // F-interpolators
  val speed = 1.2f
  val myth = f"$name can eat $speed%2.2f burgers per minute."
  println(myth)

  // raw-interpolator
  println(raw"This is a \n newline")
  val escaped = "This is a \n newline"
  println(raw"$escaped") // this won't escape new line
}
