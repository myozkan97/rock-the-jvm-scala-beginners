package lectures.part2oop

import scala.language.postfixOps

object _2_MethodNotations extends App {

  class Person(val name: String, favoriteMovie: String) {
    def likes(movie: String): Boolean  = movie == favoriteMovie

    def hangsOutWith(person: Person): String = s"${this.name} is hanging out with ${person.name}"

    // put space between ! and :
    def unary_! : String = s"$name what the flying fuck"

    def isAlive: Boolean = true

    // paranthesis are important
    def apply(): String = s"Hi, my name is $name and I like $favoriteMovie"

  }

  val mary = new Person("Mary", "Green Book")
  println(mary.likes("Green Book"))

  // infix notation / syntactic sugar / operator notation (method has to have one parameter)
  println( mary likes "Green Book")

  // "operators" in Scala
  println(mary hangsOutWith (new Person("Tom", "Titanic")))
  // here hangout is an operator
  // you can actually overload "+", sick...

  // holy cow, this is cool
  // all operators are methods
  println(1.+(2))


  // Prefix Notation
  val x = -1
  val y = 1.unary_- // these two equal

  // unary_ prefix only works with - + ~ !
  println(!mary)
  println(mary.unary_!) // these two are the same

  // Postfix Notation
  println(mary.isAlive)
  println(mary isAlive)

  // Apply
  println(mary.apply())
  println(mary()) // these two are the same





}
