

object PartialFunction {
  def partialFunc(a:Int,b:Int):Int = 
  {
    a+b+10
  }
  
  def square(input:Int):Int = 
  {
    input * input
  }
  
  def main(args:Array[String]) = 
  {
    println("The Addition using parital function is : " +partialFunc(args(0).toInt,args(1).toInt))
    println("The Square using parital function Input is : " +square(partialFunc(args(0).toInt,args(1).toInt)))
}
}