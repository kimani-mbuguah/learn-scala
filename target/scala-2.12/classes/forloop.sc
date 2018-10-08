/*
4. Write a Scala equivalent for the Java loop
for (int i = 10; i >= 0; i--) System.out.println(i);
*/

for(i <- 10.to(0,-1)) println(i)

//use reverse
for (i <- 0 to 10 reverse) println(i)

//use by to control the increment
for (i <- 10 to 0 by -1) println(i)