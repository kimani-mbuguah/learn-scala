val status = 500
val message = status match{
  case 200 =>
    println("The status code is 200")
  case 404 =>{
    println("status code is 404. not found")
}
  case 500=>{
    println("internal server error")
  }
}