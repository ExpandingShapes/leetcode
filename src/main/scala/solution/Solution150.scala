package solution

/**
 * https://leetcode.com/problems/evaluate-reverse-polish-notation
 * 150. Evaluate Reverse Polish Notation
 */
object Solution150 {
  def evalRPN(tokens: Array[String]): Int = {
    var stack = List[Int]()

    tokens.foreach { token =>
      if(Set("+", "-", "*", "/").contains(token)){
        val twoLastInts = stack.takeRight(2)
        val result = charToOperation(token.head).apply(twoLastInts.head, twoLastInts.last)
        stack = stack.dropRight(2)
        stack = stack :+ result
      } else {
        stack = stack :+ token.toInt
      }
    }

    stack.head
  }

  private def charToOperation(c: Char): (Int, Int) => Int = c match {
    case '+' => (x: Int, y: Int) => x + y
    case '-' => (x: Int, y: Int) => x - y
    case '*' => (x: Int, y: Int) => x * y
    case '/' => (x: Int, y: Int) => x / y
  }
}
