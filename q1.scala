object InterestCalculator 
{
  def calculateInterest(depositAmount: Double): Double = 
  {
    val interestRate = 
      if (depositAmount <= 20000) 0.02
      else if (depositAmount <= 200000) 0.04
      else if (depositAmount <= 2000000) 0.035
      else 0.065
      
    val interest = depositAmount * interestRate
    interest
  }
  def main(args: Array[String]): Unit = 
  {
    val depositAmount = 250000 
    val interest = calculateInterest(depositAmount)
    println(s"The interest earned on Rs. $depositAmount deposit is Rs. $interest")
  }
}