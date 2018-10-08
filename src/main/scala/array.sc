//0 inclusive
val myArray = (0 to 10).toArray
myArray

//0 exclusive
val myArray2 = (0 until 10).toArray
myArray2

// 1. Write a code snippet that sets a to an array of n random integers between 0
// (inclusive) and n (exclusive).
val a = new Array[Int](10)                //> a  : Array[Int] = Array(0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
for(i <- 0 until a.length) a(i) = scala.util.Random.nextInt(10)
a                                         //> res0: Array[Int] = Array(9, 0, 5, 8, 6, 6, 3, 9, 0, 3)
val b = new Array[Int](20)
for(i <- 0 until b.length)
  b(i) = scala.util.Random.nextInt(20)
b

