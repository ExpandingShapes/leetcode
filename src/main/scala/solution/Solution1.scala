package solution

object Solution1 {
  def twoSum(nums: Array[Int], target: Int): Array[Int] = {
    val map = nums.zipWithIndex.toMap

    val i1 = nums.indices.indexWhere(i => map.get(target - nums(i)).exists(_ != i))

    if (i1 == -1)
      Array(-1, -1)
    else
      Array(i1, map(target - nums(i1)))
  }
}
