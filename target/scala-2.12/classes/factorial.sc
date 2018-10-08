def factorial(num: Int) = {
  var factorial = 1
  var i =1
  while(i <= num){
    factorial *= i
    println(factorial)
    i += 1
  }

}

factorial(10)