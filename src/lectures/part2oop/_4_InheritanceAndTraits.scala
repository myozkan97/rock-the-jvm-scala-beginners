package lectures.part2oop

object _4_InheritanceAndTraits extends App {

  // Single class inheritance like Java
  class Animal {
    val creatureType = "Wild"
    def eat(): Unit = println("nomnom") // this is public
    private def eat2(): Unit = println("nomnom2")
    protected def eat3(): Unit = print("nomnom3")
  }

  class Cat extends Animal {
    def crunch(): Unit = {
      eat3()
      println("crunch ")
    }
  }

  val cat = new Cat
  cat.eat
  // cat.eat2 // wont compile
  // cat.eat3 // wont compile


  // constructors
  class Person(name: String, age: Int) {
    def this(name: String) = this(name, 0)
  }

  class Adult(name: String, age: Int, idcard: String) extends Person(name, age)


  // Overriding
  class Dog extends Animal {
    override def eat = println("crunch, crunch")
    override val creatureType = "Domestic"
  }

  val dog = new Dog
  dog.eat
  println(dog.creatureType)

  // override parameter
  class Dog2(override val creatureType: String) extends Animal {
    override def eat = println("crunch, crunch")
  }

  val dog2 = new Dog2("Domestic")


  // Type Substitution - Polymorphism
  // will use overridden methods (same stuff from Java)
  val unknownAnimal: Animal = new Dog2("K9")



  // Super
  class Dog3(override val creatureType: String) extends Animal {
    override def eat = {
      super.eat()
      println("crunch, crunch")
    }
  }



  // Prevent Overrides
  // 1 - Use final on method or field
  // 2 - Final on the class (prevents extending)
  // 3 - Seal the class ( you can extend classes in THIS FILE but not in other files )
  class Dog4()  {
    final def eat = {
      println("crunch, crunch")
    }
  }

  final class Dog5()  {
    def eat = {
      println("crunch, crunch")
    }
  }

  sealed class Dog6()  {
    def eat = {
      println("crunch, crunch")
    }
  }


}
