

object CourseFee {
  def courseMatch(input:String):String = {
    input match{
      case "Android" => "12999"
      case "Big Data Development" => "17999"
      case "Spark" => "19999"
      case _ => "Course is not available"
    }
  }
  
  def main(args:Array[String]) = {
    println("Available course Android , Big Data Development and Spark")
    println("Enter course name to check fees")
    
    var course = scala.io.StdIn.readLine()
    println("fee is "+courseMatch(course))
  }
}