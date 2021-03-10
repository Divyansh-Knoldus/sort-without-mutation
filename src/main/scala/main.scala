object main {                                                           //Main method
  def main(args: Array[String]): Unit = {
    val quick_sort = new sort
    println("Sorted List is: " + quick_sort.sort(List(5, 9, 8, 1, 3))) //sort function to implement sorting operation
  }
}