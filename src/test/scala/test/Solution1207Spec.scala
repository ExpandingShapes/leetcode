package test

import org.scalatest.wordspec.AnyWordSpec
import solution.Solution1207

class Solution1207Spec extends AnyWordSpec {
  "1347. Minimum Number of Steps to Make Two Strings Anagram" should {
    "arr = [1,2,2,1,1,3] => true" in {
      assert(Solution1207.uniqueOccurrences(Array(1, 2, 2, 1, 1, 3)))
    }
    "arr = [1, 2] => false" in {
      assert(!Solution1207.uniqueOccurrences(Array(1, 2)))
    }
    "arr = [-3, 0, 1, -3, 1, 1, 1, -3, 10, 0] => true" in {
      assert(Solution1207.uniqueOccurrences(Array(-3, 0, 1, -3, 1, 1, 1, -3, 10, 0)))
    }
  }
}