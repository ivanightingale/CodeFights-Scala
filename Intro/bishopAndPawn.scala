def bishopAndPawn(bishop: String, pawn: String): Boolean = {
    Math.abs(bishop(0) - pawn(0)) == Math.abs(bishop(1) - pawn(1))
}
