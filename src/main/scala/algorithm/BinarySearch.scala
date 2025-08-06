package algorithm

import scala.annotation.tailrec

object BinarySearch {
  private def binarySearch(array: Array[Int], target: Int): Boolean = {
    var l = 0
    var h = array.length - 1
    while (l <= h) {
      val m = l + (h - l) / 2
      if (array(m) == target)
        return true
      else if (target > array(m))
        l = m + 1
      else
        h = m - 1
    }
    false
  }

  @tailrec
  private def binarySearchFP(array: Array[Int], low: Int, high: Int, target: Int): Boolean =
    (low, high) match {
      case (l, h) if l > h => false
      case (l, h) =>
        val m = l + (h - l) / 2
        array(m) match {
          case midElement if midElement == target => true
          case midElement if target > midElement =>
            binarySearchFP(array, m + 1, h, target)
          case _ => binarySearchFP(array, l, h - 1, target)
        }
    }

  def main(args: Array[String]): Unit = {
    val array = Array(1, 3, 4, 6, 7, 8, 9, 999, 1000, 2868)
    println(binarySearch(array, 9))
    println(binarySearch(array, 10))
    println("\nNow FP version\n")
    println(binarySearchFP(array, 0, array.length - 1, 9))
    println(binarySearchFP(array, 0, array.length - 1, 10))
  }
}
