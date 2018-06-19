def sortByHeight(a: Array[Int]): Array[Int] = {
    val sortedPersons = a.filter(_ != -1).sorted
    var ind = -1
    a.map(x => if(x == -1) x else {ind++; sortedPersons(ind)})
}
