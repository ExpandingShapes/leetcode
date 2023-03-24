package test

import org.scalatest.wordspec.AnyWordSpec
import solution.Solution1332

class Solution1332Spec extends AnyWordSpec {
  "1332. Remove Palindromic Subsequences" should {
    "ababa => 1" in {
      assert(Solution1332.removePalindromeSub("ababa") == 1)
    }
    "abb => 2" in {
      assert(Solution1332.removePalindromeSub("abb") == 2)
    }
    "baabb => 2" in {
      assert(Solution1332.removePalindromeSub("baabb") == 2)
    }
    "bbaabaaa => 2" in {
      assert(Solution1332.removePalindromeSub("bbaabaaa") == 2)
    }
  }
}
