package test

import org.scalatest.wordspec.AnyWordSpec
import solution.Solution485

class Solution485Spec extends AnyWordSpec {
  "485. Max Consecutive Ones" should {
    "[1, 1, 0, 1, 1, 1] => 3" in {
      val nums = Array(1, 1, 0, 1, 1, 1)
      assert(Solution485.findMaxConsecutiveOnes(nums) == 3)
    }

    "[1, 0, 1, 1, 0, 1] => 2" in {
      val nums = Array(1, 0, 1, 1, 0, 1)
      assert(Solution485.findMaxConsecutiveOnes(nums) == 2)
    }

    "[0] => 0" in {
      val nums = Array(0)
      assert(Solution485.findMaxConsecutiveOnes(nums) == 0)
    }

    "[1, 1, 0, 1] => 2" in {
      val nums = Array(1, 1, 0, 1)
      assert(Solution485.findMaxConsecutiveOnes(nums) == 2)
    }
  }
}
