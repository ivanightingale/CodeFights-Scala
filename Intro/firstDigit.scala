def firstDigit(inputString: String): Char = {
    if(inputString(0).isDigit) inputString(0) else firstDigit(inputString.drop(1))
}
