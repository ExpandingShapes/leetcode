package test

import org.scalatest.wordspec.AnyWordSpec
import solution.Solution88

class Solution88Spec extends AnyWordSpec {
  "88. Merge Sorted Array" should {
    "[1 2 3 0 0 0] 3 [2 5 6] 3 => [1 2 2 3 5 6]" in {
      val nums1 = Array(1, 2, 3, 0, 0, 0)
      Solution88.merge(nums1, 3, Array(2, 5, 6), 3)
      assert(nums1 sameElements Array(1, 2, 2, 3, 5, 6))
    }
  }
}
