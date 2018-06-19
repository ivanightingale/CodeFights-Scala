def almostIncreasingSequence(sequence: Array[Int]): Boolean = {
    (1 until sequence.length).filter(i => sequence(i-1) >= sequence(i)).length <= 1 &&
    (2 until sequence.length).filter(i => sequence(i-2) >= sequence(i)).length <= 1
}
