def variableName(name: String): Boolean = {
    !name(0).isDigit && name.forall(c => c.isDigit || c.isLetter || c == '_')
}
