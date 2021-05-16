//19000057

object Q3_wholesaleCost extends App{

  val price =24.95
  val discount =0.4
  val shippingCost =3.00
  val numOfCopies =60

  def countDiscount(price :Double,numOfCopies :Int,discount :Double):Double= price*discount*numOfCopies

  def countShoppingCost (numOfCopies :Int,shippingCost :Double): Double ={
    if(numOfCopies<=50) 50*shippingCost
    else (50*shippingCost)+((numOfCopies-50)*0.75)
  }

  println("Wholesale cost for 60 copies is "+ (countDiscount(24.95,60,0.4)+countShoppingCost(60,3.0)))

}
