package solution

import scala.annotation.tailrec

/**
 * https://leetcode.com/problems/arithmetic-subarrays/
 * 1630. Arithmetic Subarrays
 */
object Solution1630 {
  def checkArithmeticSubarrays(nums: Array[Int], l: Array[Int], r: Array[Int]): List[Boolean] = {
    l.zip(r).map(x => arithmeticSequenceCheck(nums.slice(x._1, x._2 + 1).sorted)).toList
  }

  private def arithmeticSequenceCheck(array: Array[Int]): Boolean = {
    val diff = array(1) - array.head

    @tailrec
    def iter(i: Int): Boolean = {
      if (i == array.length)// - 1)
        true
      else {
        if (array(i) - array(i - 1) == diff)
          iter(i + 1)
        else
          false
      }
    }

    iter(1)
  }
}
