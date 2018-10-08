/*import scala.collection.mutable.ArrayBuffer
val myArray  = new Array[Int](10)
myArray

val a = Array[Int](1,2,3,4,5)

val b = Array("Hello", "World")
b

val c = new ArrayBuffer[Int]()
c +=1

c += (2,3,4,5)

val d = Array[String]("Hey","You")
d

val setArray = new Array[Int](30)
for(i <- 0 until setArray.length){
  setArray(i) = scala.util.Random.nextInt(30)
}
  setArray

val e = new Array[Int](20)
for(i <- 0 until e.length){
  e(i) = scala.util.Random.nextInt(20)}
e

// 2. Write a loop that swaps adjacent elements of an array of integers. For example,
// Array(1, 2, 3, 4, 5) becomes Array(2, 1, 4, 3, 5).

//double every even number in the array
val a = Array[Int](1,2,3,4,5)
for (elem <- a if  elem%2 == 0) yield 2*elem                                       //> res1: Array[Int] = Array(1, 2, 3, 4, 5)
//double every element in the array
for(i<-a)yield 2*i
//add all elements. array must numeric
a.sum
//get max/min
a.max
a.min
//sort
val b = Array(2,8,9,4,3,7,6)
b.sorted
*/

// 2. Write a loop that swaps adjacent elements of an array of integers. For example,
// Array(1, 2, 3, 4, 5) becomes Array(2, 1, 4, 3, 5).
val a = Array[Int](1,2,3,4,5)
a                                         //> res1: Array[Int] = Array(1, 2, 3, 4, 5)
for(i <- 0 until (if(a.length % 2 == 0) a.length else a.length - 1) if(i % 2 == 1) ) {
  val temp = a(i)
  a(i) = a(i-1)
  a(i-1) = temp
}
a