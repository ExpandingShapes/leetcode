package solution
/*
  https://leetcode.com/problems/max-consecutive-ones/
 */
object Solution485 {
  def findMaxConsecutiveOnes(nums: Array[Int]): Int = {
    def iter(max: Int, cur: Int, nums: Array[Int]): Int =
      if(nums.isEmpty)
        Math.max(max, cur)
      else if(nums.head == 1)
        iter(max, cur + 1, nums.tail)
      else
        iter(Math.max(max, cur), 0, nums.tail)

    iter(0, 0, nums)

  }
}
