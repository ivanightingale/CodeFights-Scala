def knapsackLight(value1: Int, weight1: Int, value2: Int, weight2: Int, maxW: Int): Int = {
    if(weight1 + weight2 <= maxW) value1 + value2
    else if(weight1 > maxW) if(weight2 > maxW) 0 else value2
    else if(weight2 > maxW) value1
    else if(value1 > value2) value1 else value2
}
