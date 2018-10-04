def countdown(n: Int) ={
  var counter = n
  while( n<20){
    println()
    counter -= 1
  }
}

countdown(4)

//def countDown(n: Int): Unit= if(n == 0) println(0) else if(n>0) {println(n);countDown(n-1)}