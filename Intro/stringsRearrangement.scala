def stringsRearrangement(inputArray: Array[String]): Boolean = {
    inputArray.permutations.exists{ 
        p => p.sliding(2).forall{
            s => (s(0) zip s(1)).count(p => p._1 != p._2) == 1
      }
    }
}
