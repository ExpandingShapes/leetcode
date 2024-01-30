package test

import org.scalatest.wordspec.AnyWordSpec
import solution.Solution150

class Solution150Spec extends AnyWordSpec {
  "150. Evaluate Reverse Polish Notation" should {
    "[\"2\",\"1\",\"+\",\"3\",\"*\"] => 9" in {
      assert(Solution150.evalRPN(Array("2", "1", "+", "3", "*")) == 9)
    }

    "[\"4\",\"13\",\"5\",\"/\",\"+\"] => 6" in {
      assert(Solution150.evalRPN(Array("4","13","5","/","+")) == 6)
    }

    "[\"10\",\"6\",\"9\",\"3\",\"+\",\"-11\",\"*\",\"/\",\"*\",\"17\",\"+\",\"5\",\"+\"] => 22" in {
      assert(Solution150.evalRPN(Array("10","6","9","3","+","-11","*","/","*","17","+","5","+")) == 22)
    }
  }
}
