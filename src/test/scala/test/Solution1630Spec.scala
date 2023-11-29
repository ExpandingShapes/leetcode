package test

import org.scalatest.wordspec.AnyWordSpec
import solution.Solution1630

class Solution1630Spec extends AnyWordSpec {
  "1630. Arithmetic Subarrays" should {
    "nums = [4,6,5,9,3,7], l = [0,0,2], r = [2,3,5] =>" +
    "[true,false,true]" in {
      val nums = Array(4,6,5,9,3,7)
      val l = Array(0, 0, 2)
      val r = Array(2, 3, 5)

      assert(Solution1630.checkArithmeticSubarrays(nums, l, r) == List(true, false, true))
    }

    "nums = [-12,-9,-3,-12,-6,15,20,-25,-20,-15,-10], l = [0,1,6,4,8,7], r = [4,4,9,7,9,10] =>" +
    "[false,true,false,false,true,true]" in {
      val nums = Array(-12,-9,-3,-12,-6,15,20,-25,-20,-15,-10)
      val l = Array(0,1,6,4,8,7)
      val r = Array(4,4,9,7,9,10)

      assert(Solution1630.checkArithmeticSubarrays(nums, l, r) == List(false,true,false,false,true,true))
    }
  }
}
