def areSimilar(a: Array[Int], b: Array[Int]): Boolean = {
    val diffInd = a.indices.filter(i => a(i) !=b (i))
    diffInd.size match{
        case 0 => true
        case 2 => a(diffInd(0)) == b(diffInd(1)) && a(diffInd(1)) == b(diffInd(0))
        case _ => false
    }
}
