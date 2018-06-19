def alternatingSums(a: Array[Int]): Array[Int] = {
    Array(
        a.zipWithIndex.filter(_._2 % 2 == 0).map(_._1).sum,
        a.zipWithIndex.filter(_._2 % 2 == 1).map(_._1).sum
    )
}
