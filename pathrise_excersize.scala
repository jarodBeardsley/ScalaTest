// Returns the kth largest element of an array of integers, -1 if the array is empty
def find_kth_largest_element(inputArray: Array[Int], k: Int): Int = {
  return inputArray.sorted(Ordering[Int].reverse).lift(k).getOrElse(-1)
}
