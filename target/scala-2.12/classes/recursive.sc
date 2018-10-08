def power1(x: Double, n: Int): Double =
  if (n == 0) 1
  else if (n < 0) 1 / power1(x, -n)
  else if (n % 2 == 0 && n > 2) power1(power1(x, n / 2), 2)
  else x * power1(x, n - 1)

power1(2, 10)  //> 1024.0
power1(2, 1)   //> 2.0
power1(2, 13)  //> 8192.0
power1(2, -4)  // 0.0625

//using pattern matching
def power2(x: Double, n: Int): Double = n match {
  case 0 => 1
  case n if (n < 0) => 1 / power2(x, -n)
  case n if (n % 2 == 0 && n > 2) => power2(power2(x, n / 2), 2)
  case _ => x.toDouble * power2(x, n - 1)
}

power2(2, 10)  //> 1024.0
power2(2, 1)   //> 2.0
power2(2, 13)  //> 8192.0
power2(2, -4)  //> 0.0625