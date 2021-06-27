package lectures.part2oop

object _3_Objects {

  // SCALA DOES NOT HAVE CLASS-LEVEL FUNCTIONALITY ("static")
  object Person { // type + its only instance
    // static-class level functionality
    val N_EYES = 2
    def canFly: Boolean = false

    // factory method
    def apply(mother: Person, father: Person): Person = new Person("Steve")
  }

  // COMPANIONS

  class Person(val name: String) {
    // instance-level functionality
  }


  // Scala Applications = Scala object with
  // def main(args: Array[String])
  def main(args: Array[String]): Unit = {
    println(Person.N_EYES)
    println(Person.canFly)

    // We use an Object is a SINGLETON INSTANCE
    val mary = Person // the only instance
    val john = Person
    println(mary == john)

    val jane = new Person("Jane")
    val jack = new Person("Jack")

    // calls apply method
    val steve = Person(jane, jack)
  }








}
