package solution

/**
 * https://leetcode.com/problems/middle-of-the-linked-list/
 */
object Solution876 {
  class ListNode(_x: Int = 0, _next: ListNode = null) {
    var next: ListNode = _next
    var x: Int = _x
  }

  def middleNode(head: ListNode): ListNode = {
    var slow = head
    var fast = head

    while(fast != null && fast.next != null){
      fast = fast.next.next
      slow = slow.next
    }
    slow
  }
}
