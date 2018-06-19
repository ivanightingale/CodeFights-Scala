def addBorder(picture: Array[String]): Array[String] = {
    val border = "*" * (picture(0).length + 2)
    border +: picture.map("*" + _ + "*") :+ border
}
