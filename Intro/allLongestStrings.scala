def allLongestStrings(inputArray: Array[String]): Array[String] = {
    val m = inputArray.map(_.length).max
    inputArray.filter(_.length == m)
}all
