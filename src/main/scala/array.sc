val a = new Array[Int](10)                //> a  : Array[Int] = Array(0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
for(i <- 0 until a.length) a(i) = scala.util.Random.nextInt(10)
a

//0 inclusive
val myArray = (0 to 10).toArray
myArray

//0 exclusive
val myArray2 = (0 until 10).toArray
myArray2