def areEquallyStrong(yourLeft: Int, yourRight: Int, friendsLeft: Int, friendsRight: Int): Boolean = {
    Seq(yourLeft, yourRight).sorted == Seq(friendsLeft, friendsRight).sorted
}
