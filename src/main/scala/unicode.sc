def unicode(s: String)={
  var i = 1
  for (c <- s) i *= c.toInt
  i
}

unicode("hello")