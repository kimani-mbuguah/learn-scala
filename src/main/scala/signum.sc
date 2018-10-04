//The signum of a number is 1 if the number is positive, –1 if it is negative, and
//0 if it is zero. Write a function that computes this value.

def signum (x: Int) = {
  if ( x>0 ){
    1
  }else if ( x<0 ){
    -1
  }else{
    0
  }
}

signum(-2)
signum(0)
signum(9)

