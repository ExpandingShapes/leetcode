package solution

/*
  217. Contains Duplicate
 */
object Solution217 {
    def containsDuplicate(nums: Array[Int]): Boolean = {
        nums.distinct.toSet.size != nums.length
    }
}
