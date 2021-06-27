package lectures.part2oop

object _1_OOBasics extends App {

  val basicClass = new SuperBasicClass

  val person = new Person("Yusuf", 24)
  // println(person.name) // class parameters are not fields
  println(person.age) // this is okay though
  println(person.greet("Ahmet"))
  println(person.greet())
}



class SuperBasicClass

// constructor
class Person(name: String, val age: Int) {
  // body
  val x = 2 // this is a field, can be used with instance

  println(1 + 3)

  def greet(name: String): Unit = println(s"${this.name} says; hi, $name.")

  def greet(): Unit = println(s"Hi, I am $name")


  // multiple constructors
  def this(name: String) = this(name, 0)
  def this() = this("John Doe")
  // because you only can call another constructors, auxiliary constructors are impractilacal
}
