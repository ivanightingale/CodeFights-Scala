def minesweeper(matrix: Array[Array[Boolean]]): Array[Array[Int]] = {
    val row = matrix.length
    val col = matrix(0).length
    val bordered = (0 until col + 2).map(_ => false).toArray +:
    matrix.map(false +: _ :+ false) :+ (0 until col + 2).map(_ => false).toArray
    Array.tabulate(row, col){
    (r, c) => 
        (0 until 9).map(i => bordered(r + i / 3)(c + i % 3)).map(i => i match{
            case false => 0
            case true => 1
        }).sum - (bordered(r + 1)(c + 1) match{
            case false => 0
            case true => 1
        })
    }
}
