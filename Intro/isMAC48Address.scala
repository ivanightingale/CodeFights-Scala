def isMAC48Address(inputString: String): Boolean = {
    return inputString.matches("([0-9]|[A-F]){2}-([0-9]|[A-F]){2}-([0-9]|[A-F]){2}-([0-9]|[A-F]){2}-([0-9]|[A-F]){2}-([0-9]|[A-F]){2}")
}
