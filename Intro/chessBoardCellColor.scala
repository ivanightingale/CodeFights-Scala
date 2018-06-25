def chessBoardCellColor(cell1: String, cell2: String): Boolean = {
    cell1.map(_ % 2).sum == cell2.map(_ % 2).sum
}
