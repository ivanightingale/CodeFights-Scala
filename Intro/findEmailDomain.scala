def findEmailDomain(address: String): String = {
    address.drop(address.lastIndexOf('@') + 1)
}
