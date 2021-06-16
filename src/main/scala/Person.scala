class Person(val name: String,val age:Int) extends Ordered[Person] {
  def compare(that: Person): Int = {

    if (this.name.equals(that.name)) { (this.age) compare (that.age)}
    else {(this.name.length) compare (that.name.length)}}}

object Main {
  def main(args: Array[String]): Unit = {
    val personOne = new Person("Test", 24)
    val personTwo = new Person("Test", 25)

    val personThree = new Person("TestAgain", 25)
    val personFour = new Person("Test", 26)
    println(personOne < personTwo)
    println(personOne > personTwo)

    println(personThree < personFour)
    println(personOne == personTwo)
}}