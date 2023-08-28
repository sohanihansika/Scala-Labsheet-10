package Labsheet10

import scala.io.StdIn

object Q2 {
  def main(args: Array[String]): Unit ={
    print("Enter the list of words ")
    val InputString = StdIn.readLine()
    val InputList = InputString.split(",").map(_.trim.toString).toList

    val wordLength = numberOfLetters(InputList)
    val totalOccurrences = totalCount(wordLength)

    print(s"Total Occurrences : $totalOccurrences")
  }

  def numberOfLetters(words: List[String]): List[Int] = {
    words.map(_.length)
  }

  def totalCount(lengths: List[Int]): Int = {
    lengths.reduce((total, length) => total+length)
  }

}
