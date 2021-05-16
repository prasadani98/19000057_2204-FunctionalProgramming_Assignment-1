//19000057

object Q2_volume extends App{

  println("The volume of a sphere with radius r is 4/3 Pi r3.\n")

  def cal_volume(radius:Double):Double = (4.0/3.0)*(22.0/7.0)*math.pow(radius,3)

  println("Volume of a sphere with radius 5 = "+cal_volume(5.0))




}
