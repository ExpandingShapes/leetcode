package solution

object Solution3536 {
      def maxProduct(n: Int): Int = {
        n.toString.split("").map(_.toInt).sorted.takeRight(2).product
    }
}
