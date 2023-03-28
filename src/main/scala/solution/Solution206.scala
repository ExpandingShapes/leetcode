package solution

object Solution206 {
  class ListNode(_x: Int = 0, _next: ListNode = null) {
    var next: ListNode = _next
    var x: Int = _x
  }

  def reverseList(head: ListNode): ListNode = {
    def iter(prev: ListNode, cur: ListNode) = {

    }

    if(head == null || head.next == null) head else iter(head, head.next)
    ???
  }
}
