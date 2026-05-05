package test

import org.scalatest.wordspec.AnyWordSpec
import solution.Solution1

class Solution1Spec extends AnyWordSpec {
  "1. Two Sum" should {
    "nums = [2, 7, 11, 15], target = 9 => [0, 1]" in {
      val nums = Array(2, 7, 11, 15)
      val target = 9
      assert(Solution1.twoSum(nums, target) sameElements Array(0, 1))
    }

    "nums = [3, 2, 4], target = 6 => [1, 2]" in {
      val nums = Array(3, 2, 4)
      val target = 6
      assert(Solution1.twoSum(nums, target) sameElements Array(1, 2))
    }

    "nums = [3, 3], target = 6 => [0, 1]" in {
      val nums = Array(3, 3)
      val target = 6
      assert(Solution1.twoSum(nums, target) sameElements Array(0, 1))
    }
  }
}
