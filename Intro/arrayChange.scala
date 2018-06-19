def arrayChange(inputArray: Array[Int]): Int = {
    inputArray.size match{
        case 0 => 0
        case 1 => 0
        case _ => {
            if(inputArray(1) <= inputArray(0)) {
                val thisStep = inputArray(0) - inputArray(1) + 1
                inputArray(1) += thisStep
                thisStep + arrayChange(inputArray.drop(1))
            }
            else arrayChange(inputArray.drop(1))
        }
    }
}

/*
def arrayChange(inputArray: Array[Int]): Int = {
  var sum = 0
  inputArray.reduceLeft{
    (a,b) => {
      if(a >= b) {sum += a - b + 1; a + 1} else b
    }
  }
  sum
}
*/
