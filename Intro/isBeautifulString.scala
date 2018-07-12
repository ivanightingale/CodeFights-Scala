def isBeautifulString(inputString: String): Boolean = {
    val charCount = ('a' to 'z').map(c => inputString.count(_ == c))
    charCount.reverse == charCount.sorted
}
