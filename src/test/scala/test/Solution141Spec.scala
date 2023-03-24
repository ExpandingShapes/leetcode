package test

import org.scalatest.wordspec.AnyWordSpec
import solution.Solution141
import solution.Solution141.ListNode

class Solution141Spec extends AnyWordSpec {
  "141. Linked List Cycle" should {
    "head = [3, 2, 0, -4] => true" in {
      val head = new ListNode(3)
      val second = new ListNode(2)
      val third = new ListNode(0)
      val fourth = new ListNode(-4)

      head.next = second
      head.next.next = third
      head.next.next.next = fourth
      head.next.next.next = second

      assert(Solution141.hasCycle(head))
    }

    "head = [1, 2] => true" in {
      val head = new ListNode(1)
      val second = new ListNode(2)

      head.next = second
      head.next.next = head

      assert(Solution141.hasCycle(head))
    }

    "head = [1] => false" in {
      val head = new ListNode(1)

      assert(!Solution141.hasCycle(head))
    }
  }
}



