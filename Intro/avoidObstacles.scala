def avoidObstacles(inputArray: Array[Int]): Int = {
    def from(n: Int): Stream[Int] = n #:: from(n + 1)
    val options = from(1)
    options.filter(i => inputArray.forall(_%i != 0))(0)
}
