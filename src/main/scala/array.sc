val a = new Array[Int](10)                //> a  : Array[Int] = Array(0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
for(i <- 0 until a.length) a(i) = scala.util.Random.nextInt(10)
a 