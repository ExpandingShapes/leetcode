package solution

import scala.annotation.tailrec

object Solution167 {
  def twoSum(numbers: Array[Int], target: Int): Array[Int] = {
    @tailrec
    def iter(num: Int, nums: Array[Int]): Array[Int] = {
      if(nums.exists(_ + num == target)){
        val firstIndex = numbers.indexOf(num) + 1
        Array(firstIndex, numbers.indexOf(target - num, firstIndex) + 1)
      } else {
        iter(nums.head, nums.tail)
      }
    }

    iter(numbers.head, numbers)
  }
}
