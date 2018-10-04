def power1(x: Double, n: Int): Double =
  if (n == 0) 1
  else if (n < 0) 1 / power1(x, -n)
  else if (n % 2 == 0 && n > 2) power1(power1(x, n / 2), 2)
  else x * power1(x, n - 1)

power1(2, 10)  //> 1024.0
power1(2, 1)   //> 2.0
power1(2, 13)  //> 8192.0
power1(2, -4)  // 0.0625