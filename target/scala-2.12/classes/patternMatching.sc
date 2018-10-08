def patternMatch(x: Any): String = x match {

  // constant patterns
  case 0 => "this is an integer"
  case true => "this is a boolean"
  case "Africa's Talking" => "you've got a string"
  case Nil => "an empty List"

  // sequence patterns
  case List(0, _, _) => "a three-element list with 0 as the first element"
  case List(1, _*) => "a list beginning with 1, having any number of elements"
  case Vector(1, _*) => "a vector starting with 1, having any number of elements"
}
patternMatch("Africa's Talking")
