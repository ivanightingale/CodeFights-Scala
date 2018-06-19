def shapeArea(n: Int): Int = {
    if(n == 1) 1 
    else n*4 - 4 + shapeArea(n-1)
}
