package solution

import scala.annotation.tailrec

/*
  160. Intersection of Two Linked Lists
 */

object Solution160 {
  class ListNode(var _x: Int = 0) {
  var next: ListNode = null
  var x: Int = _x
}

    @tailrec
    def getIntersectionNode(headA: ListNode, headB: ListNode): ListNode = {
        if(headA == null) {
            null
        } else {
            if(iter(headA, headB)){
                headA
            } else {
                getIntersectionNode(headA.next, headB)
            }
        }
    }
    def iter(nodeA: ListNode, nodeB: ListNode): Boolean = if(nodeB == null) {
          false
    } else {
            if(nodeA == nodeB) true else iter(nodeA, nodeB.next)
        }
}