def depositProfit(deposit: Int, rate: Int, threshold: Int): Int = {
    (Math.ceil(Math.log(threshold * 1.0 / deposit) / Math.log(1 + rate / 100.0))).toInt
}
