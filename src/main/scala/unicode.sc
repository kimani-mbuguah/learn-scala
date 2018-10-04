//Write a for loop for computing the product of the Unicode codes of all letters
//in a string. For example, the product of the characters in "Hello" is 825152896.
def unicode(s: String)={
  var i = 1
  for (c <- s) i *= c.toInt
  i
}

unicode("hello")