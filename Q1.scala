package Labsheet10

import scala.io.StdIn

object Q1 {
  def main(args: Array[String]): Unit ={
    print("Enter the list of temperatures in celsius")
    val InputString = StdIn.readLine()
    val InputList = InputString.split(",").map(_.trim.toInt).toList

    val Output = convertFahrenheit(InputList)
    val totalFahrenheit = TotalFahrenheits(Output)
    val averageFahrenheit = totalFahrenheit / Output.length
    println(s"Average Fahrenheit: $averageFahrenheit")

  }

  def convertFahrenheit(numbers: List[Int]): List[Double] ={
    numbers.map(num => (num * 9/5) + 32)
  }

  def TotalFahrenheits(numbers: List[Double]): Double={
    numbers.reduce((total, temp) => total + temp)
  }
}
