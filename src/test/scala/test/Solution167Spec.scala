package test

import org.scalatest.wordspec.AnyWordSpec
import solution.Solution167

class Solution167Spec extends AnyWordSpec {
  "167. Two Sum II - Input Array Is Sorted" should {
    "[2, 7, 11, 15], 9 => [1, 2]" in {
      assert(Solution167.twoSum(Array(2, 7, 11, 15), 9) sameElements Array(1, 2))
    }
    "[2, 3, 4], 6 => [1, 3]" in {
      assert(Solution167.twoSum(Array(2, 3, 4), 6) sameElements Array(1, 3))
    }
    "[-1, 0], -1 => [1, 2]" in {
      assert(Solution167.twoSum(Array(-1, 0), -1) sameElements Array(1, 2))
    }
    "[0, 0, 3, 4], 0 => [1, 2]" in {
      assert(Solution167.twoSum(Array(0, 0, 3, 4), 0) sameElements Array(1, 2))
    }
    "[5, 25, 75], 100 => [2, 3]" in {
      assert(Solution167.twoSum(Array(5, 25, 75), 100) sameElements Array(2, 3))
    }
  }
}
