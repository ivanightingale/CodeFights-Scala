def buildPalindrome(s: String): String = {
    val sr = s.reverse
    (0 to s.length).map{i => s.take(i) + sr}.filter{
        str => str.startsWith(s) && str.endsWith(sr)
    }.head
}
