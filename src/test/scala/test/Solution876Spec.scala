package test

import org.scalatest.wordspec.AnyWordSpec
import solution.Solution876
import solution.Solution876.ListNode

class Solution876Spec extends AnyWordSpec {
  "876. Middle of the Linked List" should {
    "head = [1, 2, 3, 4, 5] => [3, 4, 5]" in {
      val head = new ListNode(1)
      val second = new ListNode(2)
      val third = new ListNode(3)
      val fourth = new ListNode(4)
      val fifth = new ListNode(5)

      head.next = second
      head.next.next = third
      head.next.next.next = fourth
      head.next.next.next.next = fifth

      assert(Solution876.middleNode(head).x == 3)
    }

    "head = [1, 2, 3, 4, 5, 6] => [4, 5, 6]" in {
      val head = new ListNode(1)
      val second = new ListNode(2)
      val third = new ListNode(3)
      val fourth = new ListNode(4)
      val fifth = new ListNode(5)
      val sixth = new ListNode(6)

      head.next = second
      head.next.next = third
      head.next.next.next = fourth
      head.next.next.next.next = fifth
      head.next.next.next.next.next = sixth

      assert(Solution876.middleNode(head).x == 4)
    }
  }
}
