def adjacentElementsProduct(inputArray: Array[Int]): Int = {
    inputArray.sliding(2).map(_.product).max
}
