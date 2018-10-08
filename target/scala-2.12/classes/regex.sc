import scala.util.matching.Regex

val numberPattern: Regex = "[7]".r

numberPattern.findFirstMatchIn("7th floor Galana plaza") match {
  case Some(_) => println("The number 7 found")
  case None => println("The number 7 was not found in this string")
}