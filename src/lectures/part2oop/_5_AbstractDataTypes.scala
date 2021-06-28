package lectures.part2oop

object _5_AbstractDataTypes extends App {

  // abstract
  // like java, Abstract classes can have non-abstract members
  abstract class Animal {
    val creatureType: String = "Wild"
    def eat: Unit
  }

  class Dog extends Animal {
    override val creatureType: String = "Canine"
    override def eat: Unit = println("crunch crunch")
  }


  // traits
  // traits can also have non-abstract members
  // but they don't have constructor parameters (weird?)
  trait Carnivore {
    def eat(animal: Animal): Unit
    val preferredMeal: String = "fresh meat"

  }

  // like java it can have more than 1 traits (Interfaces)
  class Crocodile extends Animal with Carnivore {
    override val creatureType: String = "croc"
    override def eat(animal: Animal): Unit = println(s"I'm a croc and I'm eating ${animal.creatureType}")
    override def eat: Unit = println("nom nom nom")
  }


  val dog = new Dog
  val croc = new Crocodile
  croc.eat(dog)

  // TRAITS VS ABSTRACT CLASSES
  // 1 - traits do not have constructor parameters
  // 2 - multiple trait may be inherited by the same class
  // 3 - traits = behaviour, abstract = "is a thing"
}
