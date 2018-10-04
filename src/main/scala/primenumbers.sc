
//checks if an argument passed to the number is a prime number
def isPrime2(i :Int) : Boolean = {
       if (i <= 1)
           false
       else if (i == 2)
           true
       else
         !(2 to (i-1)).exists(x => i % x == 0)
     }
isPrime2(7)

//function to print all prime numbers between 0 and n

def primeNumber (inputValue: Int) = {
  var counter = 0
  while (counter <= inputValue){
    //perform prime number checks and print it to the console
    var notPrime = false
    var i = 2
    while (i <= counter){
      if (counter % i == 0 && i != counter){
        notPrime = true
      }

      i += 1
    }
    if (notPrime ==false){
      println(counter)
    }

    counter +=1
  }
}

//test primeNumber ()

primeNumber(100)