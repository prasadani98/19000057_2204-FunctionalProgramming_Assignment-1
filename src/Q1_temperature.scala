object Q1_temperature extends App{
  println("Convert celsiyas to farenhit\n")
  def convert(value_cel:Double):Double = (value_cel*1.8)+32.00

  println("far="+ convert(35.00))

}
