def alphabeticShift(inputString: String): String = {
    inputString.map(c => if(c == 'z') 'a' else (c + 1).toChar)
}
