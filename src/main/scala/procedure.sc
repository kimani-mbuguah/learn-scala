//using a for loop
def countdown1 (num: Int) = {
  for (i <- num to 0 by -1){
    println(i)
  }
}

countdown1(20)

// Using recursion
def countdown2(x: Int): Unit = if (x > 0) {
  println(x)
  countdown2(x - 1)
}

countdown2(20)