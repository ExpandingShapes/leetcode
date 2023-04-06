package solution

import scala.annotation.tailrec

object Solution206 {
  class ListNode(_x: Int = 0, _next: ListNode = null) {
//    override def toString: String = "[" + this.x.toString + if(this.next != null) this.next.toString else "]"
    var next: ListNode = _next
    var x: Int = _x
  }

  def reverseList(head: ListNode): ListNode = {
    @tailrec
    def iter(prev: ListNode, cur: ListNode): ListNode = {
      val next = cur.next
      cur.next = prev
      if(next == null) cur else iter(cur, next)
    }

    if(head == null || head.next == null) head else iter(head, head.next)
  }
}
