package solution

/**
 * 1704. Determine if String Halves Are Alike
 * https://leetcode.com/problems/determine-if-string-halves-are-alike/
 */
object Solution1704 {
  def halvesAreAlike(s: String): Boolean = {
    val isVowel = (c: Char) =>
      Set('a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U').contains(c)

    val leftHalf = s.take(s.length/2)
    val rightHalf = s.takeRight(s.length/2)

    leftHalf.count(isVowel(_)) == rightHalf.count(isVowel(_))
  }
}
