def palindromeRearranging(inputString: String): Boolean = {
    inputString.groupBy(c => c).count(_._2.size % 2 == 1) <= 1
}
