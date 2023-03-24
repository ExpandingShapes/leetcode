package solution

object Solution88 {
    def merge(nums1: Array[Int], m: Int, nums2: Array[Int], n: Int): Unit = {
      def swapWithNext(i: Int, x: Int): Unit = {
        if(nums1(i + 1) == 0){
          nums1(i + 1) = nums1(i)
          nums1(i) = x
        } else {
          val next = nums1(i + 1)
          nums1(i + 1) = nums1(i)
          nums1(i) = x
          swapWithNext(i + 2, next)
        }
      }

      nums2.foreach{ num =>
        val j = nums1.lastIndexWhere(x => x <= num && x != 0)
        if(j == -1){
          if(num >= nums1.findLast(_ != 0).getOrElse(Int.MinValue)){
            nums1(nums1.indexWhere(_ == 0)) = num
          } else {
            println("ELSE")
            val lastNonZeroIndex = nums1.indexWhere(_ == 0)
            nums1(lastNonZeroIndex) = nums1(lastNonZeroIndex - 1)
            nums1(lastNonZeroIndex - 1) = num
          }
        } else {
          if(num > nums1(j))
            nums1(j + 1) = num
          else
          swapWithNext(j, num)
        }
      }
      }


//  val a1 = Array(2, 0)
//  merge(a1, 1, Array(1), 1)
  val a1 = Array(1, 2, 3, 0, 0, 0)
  merge(a1, 3, Array(2, 5, 6), 3)
  println(a1.mkString("Array(", ", ", ")"))
}