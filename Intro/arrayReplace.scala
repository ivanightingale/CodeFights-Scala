def arrayReplace(inputArray: Array[Int], elemToReplace: Int, substitutionElem: Int): Array[Int] = {
    inputArray.map(x => if(x == elemToReplace) substitutionElem else x)
}
