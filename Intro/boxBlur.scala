def boxBlur(image: Array[Array[Int]]): Array[Array[Int]] = {
    Array.tabulate(image.length - 2, image(0).length - 2){
    (r, c) => (
        image(r)(c) + image(r)(c + 1) + image(r)(c + 2) +
        image(r + 1)(c) + image(r + 1)(c + 1) + image(r + 1)(c + 2) +
        image(r + 2)(c) + image(r + 2)(c + 1) + image(r + 2)(c + 2) ) / 9
  }
}
