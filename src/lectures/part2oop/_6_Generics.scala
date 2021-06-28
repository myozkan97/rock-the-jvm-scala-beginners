package lectures.part2oop

object _6_Generics extends App {

  class MyList[+A] {
    // use the type A
//    def add(element: A): MyList[A] = ??? // this wont compile

    // If we add a dog to a list of cats, return a new list with the generic type of Animal
    def add[B >: A] (element: B): MyList[B] = ???
  }

  trait MyList2[A] {
    // use the type A
  }

  // Multiple Generic Types
  class MyMap[Key, Value]

  val listOfIntegers = new MyList[Int]
  val listOfStrings = new MyList[String]


  // generic methods
  // method signature with generics
  object MyList {
    def empty[A]: MyList[A] = ???
  }

  val emptyListOfIntegers = MyList.empty[Int]

  // Variance Problem
  class Animal
  class Cat extends Animal
  class Dog extends Animal


  // Million Dollar Question:  If cat extends animal does a list of cats extend Animal?
  // 1. List[Cat] extends List[Animal] => Covariance
  class CovariantList[+A]
  val animal: Animal = new Cat
  val animalList: CovariantList[Animal] = new CovariantList[Cat]
  // animalList.add(new Dog), would that be okay? HARD QUESTION

  // 2. INVARIANCE
  class InvariantList[A]
  // val invariantAnimalList: InvariantList[Animal] = new InvariantList[Cat]
  // line above will make compiler unhappy

  // 3. Hell, no. CONTRAVARIANCE
  class Trainer[-A]
  val trainer: Trainer[Cat] = new Trainer[Animal]



  // Bounded Types
  // only subtypes of Animal are allowed
  class Cage[A <: Animal](animal: A)
  val cage  = new Cage(new Dog)



}
