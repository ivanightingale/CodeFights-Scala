def matrixElementsSum(matrix: Array[Array[Int]]): Int = {
    matrix.transpose.flatMap(_.takeWhile(_ != 0)).sum
}
