def isIPv4Address(inputString: String): Boolean = {
    inputString.matches("\\d+.\\d+.\\d+.\\d+") &&
    inputString.split('.').map(_.toLong).forall(i => i >= 0 && i <= 255)
}
