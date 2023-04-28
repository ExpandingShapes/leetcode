package solution

import scala.annotation.tailrec

object Solution206 {
  class ListNode(_x: java.lang.Integer, _next: ListNode = null) {
    var next: ListNode = _next
    var x: java.lang.Integer = _x
  }

  def reverseList(head: ListNode): ListNode = {
    @tailrec
    def iter(prev: ListNode, cur: ListNode): ListNode = {
      val next = cur.next
      cur.next = prev
      if(next == null) cur else iter(cur, next)
    }

    if(head == null || head.next == null) head else iter(null, head)
  }
}
