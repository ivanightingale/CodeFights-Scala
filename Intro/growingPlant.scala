def growingPlant(upSpeed: Int, downSpeed: Int, desiredHeight: Int): Int = {
    if(upSpeed >= desiredHeight) 1
    else growingPlant(upSpeed, downSpeed, desiredHeight - upSpeed + downSpeed) + 1
}
