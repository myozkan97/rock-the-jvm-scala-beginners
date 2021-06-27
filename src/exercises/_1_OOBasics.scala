package exercises

object _1_OOBasics extends App {
  val writer = new Writer("Paul", "Coelho", 1947)

  val novel = new Novel("The Alchemist", 1988, writer)

  println(writer.fullName())
  println(novel.isWrittenBy)
  println(novel.name)
  println(novel.copy(1223).yearOfRelease)

  println("\n\n")
  val counter = new Counter(12)
  println(counter.getCount)
  println(counter.increment.getCount)
}

class Writer(val fName: String, val surname: String, val yearOfBirth: Int) {
  def fullName(): String = s"${this.fName} ${this.surname}"

}

class Novel(val name: String, val yearOfRelease: Int, val author: Writer) {
  def getAuthorAge: Int = this.yearOfRelease - author.yearOfBirth

  def isWrittenBy: String = author.fullName()

  def copy(newYearOfRelease: Int): Novel = new Novel(this.name, newYearOfRelease, this.author)

}


// DO NOT MODIFY INSTANCES, JUST CREATE A NEW VERSIONS OF 'EM.
class Counter(val num: Int) {
  def getCount: Int = this.num

  def increment: Counter = new Counter(this.getCount + 1) // immutability - IMPORTANT!!!!!

  def decrement: Counter = new Counter(this.getCount  - 1)

  def increment(amount: Int): Counter = new Counter(this.getCount + amount)

  def decrement(amount: Int): Counter = new Counter(this.getCount  - amount)
}

