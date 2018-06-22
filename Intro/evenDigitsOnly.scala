def evenDigitsOnly(n: Int): Boolean = {
    n.toString.forall(_.asDigit % 2 == 0)
}
