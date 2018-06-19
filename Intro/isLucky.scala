def isLucky(n: Int): Boolean = {
    val(h1, h2) = n.toString.splitAt(n.toString.length / 2)
    h1.map(_.toInt).fold(0)(_+_) == h2.map(_.toInt).fold(0)(_+_)
}
