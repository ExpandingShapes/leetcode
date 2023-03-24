package solution

/**
 * https://leetcode.com/problems/linked-list-cycle/
 */
object Solution141 {

  class ListNode(var _x: Int = 0) {
    var next: ListNode = null
    var x: Int = _x
  }

  def hasCycle(head: ListNode): Boolean = if(head == null) false else {
    var slow = head
    var fast = head

    while(fast.next != null && fast.next.next != null){
      fast = fast.next.next
      slow = slow.next

      if(fast == slow) return true
    }
    false
  }
}
