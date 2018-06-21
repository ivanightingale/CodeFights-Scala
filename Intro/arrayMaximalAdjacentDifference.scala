def arrayMaximalAdjacentDifference(inputArray: Array[Int]): Int = {
    inputArray.sliding(2).map(t => math.abs(t(0) - t(1))).max
}
