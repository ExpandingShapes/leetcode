package solution

/*
https://leetcode.com/problems/buy-two-chocolates
*/

object Solution2706 {
def buyChoco(prices: Array[Int], money: Int): Int = {
  val sortedPrices = prices.sorted
  val sum = sortedPrices.take(2).sum
  if(sum <= money)
    money - sum
  else
    money  
  }
}
