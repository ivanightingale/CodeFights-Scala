def digitDegree(n: Int): Int = {
    if(n < 10) 0 else digitDegree(n.toString.map(_.asDigit).sum) + 1

}
