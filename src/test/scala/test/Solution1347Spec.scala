package test

import org.scalatest.wordspec.AnyWordSpec
import solution.Solution1347

class Solution1347Spec extends AnyWordSpec {
  "1347. Minimum Number of Steps to Make Two Strings Anagram" should {
    "s = bab, t = aba => 1" in {
      assert(Solution1347.minSteps("bab", "aba") == 1)
    }

    "s = leetcode, t = practice => 5" in {
      assert(Solution1347.minSteps("leetcode", "practice") == 5)
    }

    "s = anagram, t = mangaar => 0" in {
      assert(Solution1347.minSteps("anagram", "mangaar") == 0)
    }

    "s = gctcxyuluxjuxnsvmomavutrrfb, t = qijrjrhqqjxjtprybrzpyfyqtzf => 18" in {
      assert(Solution1347.minSteps("gctcxyuluxjuxnsvmomavutrrfb", "qijrjrhqqjxjtprybrzpyfyqtzf") == 18)
    }
  }
}