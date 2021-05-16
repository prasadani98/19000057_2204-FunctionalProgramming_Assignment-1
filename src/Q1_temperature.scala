//19000057

object Q1_temperature extends App{
  println("Convert temperature into Fahrenheit\n")
  def convert(value_cel:Double):Double = (value_cel*1.8)+32.00

  println("35 Celsius = "+ convert(35.00)+" Fahrenheit")

}
