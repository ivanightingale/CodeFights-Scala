def arrayMaxConsecutiveSum(inputArray: Array[Int], k: Int): Int = {
    var oldSum = inputArray.take(k).sum
    var maxSum = oldSum
    (0 to inputArray.size - k - 1).foreach(i => {
        oldSum = oldSum - inputArray(i) + inputArray(i + k)
        if(maxSum < oldSum) maxSum = oldSum
    })
    maxSum
}
