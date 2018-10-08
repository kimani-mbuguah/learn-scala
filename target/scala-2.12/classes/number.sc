import scala.util._

object Game extends App
{
  var smallest = 0;
  var biggest = 100;
  var guess = new Random().nextInt(biggest)
  val help = "You can enter the following commands : smaller, bigger or exit"

  println("Guess a number between " + smallest + " and " + biggest)
  println("Are you ready please press enter")
  readLine()

  println(help)
  while (true)
  {
    println("Is your number : " + guess)
    readLine() match
    {
      case "smaller" => smaller
      case "bigger" => bigger
      case "exit" => sys.exit
      case "?" => println(help)
      case x => println("Unknown option: '" + x + "'")
    }
    guess = nextGuess
  }

  def smaller = biggest = guess

  def bigger = smallest = guess;

  def nextGuess = (smallest + biggest) / 2

}