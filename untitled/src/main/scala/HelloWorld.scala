object HelloWorld {
    def main(args: Array[String]): Unit = {
      println("Hello, world!") //prints Hello, World!
      println(square(2))
    }

  def square(x: Int): Int = {
    x*x
  }
}
