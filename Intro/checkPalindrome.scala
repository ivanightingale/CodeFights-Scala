def checkPalindrome(inputString: String): Boolean = {
    val l = inputString.length;
    if(l <= 1) return true;
    return inputString(0) == inputString(l - 1) && checkPalindrome(inputString.slice(1, l - 1))
}
