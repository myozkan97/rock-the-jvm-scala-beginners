package exercises

object _2_MethodNotations extends App {

  class Person(val name: String, val age: Int, favoriteMovie: String) {
    def likes(movie: String): Boolean  = movie == favoriteMovie

    def hangsOutWith(person: Person): String = s"${this.name} is hanging out with ${person.name}"

    def +(nickname: String): Person = new Person(s"${this.name} (${nickname})", this.age, this.favoriteMovie)

    def unary_+ : Person = new Person(this.name, this.age + 1, this.favoriteMovie)

    def apply(): String = s"Hi, my name is $name, I'm ${this.age} yo. and I like $favoriteMovie"
    def apply(n: Int): String = s"${this.name} watched ${this.favoriteMovie} ${n} times"

    def learns(language: String): String = s"${this.name} learns $language"

    def learnsScala : String = this.learns("Scala")
  }



  /*
1.  Overload the + operator
    mary + "the rockstar" => new person "Mary (the rockstar)"
2.  Add an age to the Person class
    Add a unary + operator => new person with the age + 1
    +mary => mary with the age incrementer
3.  Add a "learns" method in the Person class => "Mary learns Scala"
    Add a learnsScala method, calls learns method with "Scala".
    Use it in postfix notation.
4.  Overload the apply method
    mary.apply(2) => "Mary watched Inception 2 times"
*/

  val john = new Person("john", 18, "Lion King")

  println((+john)())

  println(john.learnsScala)
  println(john learnsScala)

  println(john(5))

}
