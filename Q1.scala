package labsheet_10

object Q1 {
  def calculateAverage(input: List[Int]): Double = {
    val Fahrenheit = input.map(celsius => (celsius * 9 / 5) + 32)
    val total = Fahrenheit.reduce((total, temp) => total + temp)
    val average = total / Fahrenheit.length
    average
  }

  def main(args: Array[String]): Unit = {
    val input = List(0, 10, 20, 30)
    val average = calculateAverage(input)
    println(s"Average Fahrenheit temperature: $average")
  }

}
