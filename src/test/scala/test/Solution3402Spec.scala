package test

import org.scalatest.wordspec.AnyWordSpec
import solution.Solution3402

class Solution3402Spec extends AnyWordSpec {
  "3402. Minimum Operations to Make Columns Strictly Increasing" should {
    "[[3,2],[1,3],[3,4],[0,1]] => 15" in {
      assert(Solution3402.minimumOperations(Array(Array(3, 2), Array(1, 3), Array(3, 4), Array(0, 1))) == 15)
    }
    "[[3,2,1],[2,1,0],[1,2,3]] => 12" in {
      assert(Solution3402.minimumOperations(Array(Array(3, 2, 1), Array(2, 1, 0), Array(1, 2, 3))) == 12)
    }
  }
}
