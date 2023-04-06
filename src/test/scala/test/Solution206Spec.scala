package test

import org.scalatest.wordspec.AnyWordSpec
import solution.Solution206
import solution.Solution206.ListNode

class Solution206Spec extends AnyWordSpec {
  "206. Reverse Linked List" should {
    "head = [1, 2, 3, 4, 5] => [5, 4, 3, 2, 1]" in {
      val head = new ListNode(1)
      val second = new ListNode(2)
      val third = new ListNode(3)
      val fourth = new ListNode(4)
      val fifth = new ListNode(5)

      head.next = second
      head.next.next = third
      head.next.next.next = fourth
      head.next.next.next.next = fifth

      val newHead = Solution206.reverseList(head)
      println("[" + newHead.x + newHead.next.x + newHead.next.next.x + newHead.next.next.next.x + newHead.next.next.next.next.x + "]")
    }
  }
}