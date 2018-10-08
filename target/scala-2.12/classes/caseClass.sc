// define the class
class Person(val firstName: String, val lastName: String, val age: Int) {

  println("the constructor begins")
  val fullName = firstName + " " + lastName
  val personAge = age

  def printFullName {
    // access the fullName field, which is created above
    println(fullName)
  }

  def checkAge() = {
    if(personAge <0 ){
      println("the age can not be a negative number")
    }
  }

  printFullName
  checkAge()


}
val p = new Person("Kimani", "Mbugua", -22)