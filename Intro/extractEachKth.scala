def extractEachKth(inputArray: Array[Int], k: Int): Array[Int] = {
    inputArray.zipWithIndex.filter(x => (x._2 + 1) % k != 0).map(_._1)
}
