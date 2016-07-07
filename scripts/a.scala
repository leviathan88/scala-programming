lazy val a = { println("evaluated"); 4}

val result = if (a>10) "less than ten" else if (a==5) "its five" else "its done"
println(result)

val functionLoop = (1 to 100).reverse.mkString(",") //(100 to 1 by -1).mkString(",")
println(functionLoop)

//for loops
var res = ""
for (a <- 1 to 100) {
  res = res + a
}
println(res)

//using for with Lists
val xs = List(1,2,3,4)
var newList = List[Int]()
for (a <- xs) {
  newList = newList :+ (a + 1)
}
println(newList)

//functional for loop
val newFList = for (a <- xs) yield (a+1)
println(newFList)
