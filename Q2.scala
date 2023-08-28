package labsheet_10

object Q2 {
  def countLetterOccurrences(input: List[String]): Int = {
    val Lengths = input.map(_.length)
    val totalOccurrences = Lengths.reduce((total, temp) => total + temp)
    totalOccurrences
  }

  def main(args: Array[String]): Unit = {
    val input = List("apple", "banana", "cherry", "date")
    val totalCount = countLetterOccurrences(input)
    println(s"Total count of letter occurrences: $totalCount")
  }

}
