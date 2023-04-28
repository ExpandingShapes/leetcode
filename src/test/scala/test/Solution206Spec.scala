package test

import scala.annotation.tailrec
import org.scalatest.wordspec.AnyWordSpec
import solution.Solution206
import solution.Solution206.ListNode

class Solution206Spec extends AnyWordSpec {
  "206. Reverse Linked List" should {
    "head = [1, 2, 3, 4, 5] => [5, 4, 3, 2, 1]" in {
      val head = new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(4, new ListNode(5)))))

      println(s"BEFORE: ${listToString(head)}")
      val newHead = Solution206.reverseList(head)
      val newHeadString = listToString(newHead)
      println(s"AFTER: $newHeadString")
      assert(newHeadString == "[ 5 4 3 2 1 ]")
    }

    "head = [1, 2] => [2, 1]" in {
      val head = new ListNode(1, new ListNode(2))

      println(s"BEFORE: ${listToString(head)}")
      val newHead = Solution206.reverseList(head)
      val newHeadString = listToString(newHead)
      println(s"AFTER: $newHeadString")
      assert(newHeadString == "[ 2 1 ]")
    }

    "head = [] => []" in {
      val head = new ListNode(null)

      println(s"BEFORE: ${listToString(head)}")
      val newHead = Solution206.reverseList(head)
      val newHeadString = listToString(newHead)
      println(s"AFTER: $newHeadString")
      assert(newHeadString == "[]")
    }
  }

  def listToString(head: ListNode): String = {
    @tailrec
    def iter(head: ListNode, acc: String): String = if(head.next != null) {
      iter(head.next, acc + s" ${head.x}")
    } else {
      acc + s" ${head.x}"
    }

    if(head.x != null) "[" + iter(head, "") + " ]" else "[]"
  }
}