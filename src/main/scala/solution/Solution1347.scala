package solution

/**
 * NOT WORKING
 * 1347. Minimum Number of Steps to Make Two Strings Anagram
 * https://leetcode.com/problems/minimum-number-of-steps-to-make-two-strings-anagram/
 */
object Solution1347 {
  def minSteps(s: String, t: String): Int = {
    var count = 0
    var count2 = 0
    var freqS = collection.mutable.Map[Char, Int]()
    var freqT = collection.mutable.Map[Char, Int]()

    val frequencyS = s.foreach { c =>
      if (freqS.contains(c))
        freqS.update(c, freqS(c) + 1)
      else
        freqS += (c -> 1)
    }

    val frequencyT = t.foreach { c =>
      if (freqT.contains(c))
        freqT.update(c, freqT(c) + 1)
      else
        freqT += (c -> 1)
    }

    freqS.foreach { case (key, value) =>
      println(s"$key -> $value")
    }

    println("FREQ2")

    freqT.foreach { case (key, value) =>
      println(s"$key -> $value")
    }

//    freqS.filter(x => freqT.isDefinedAt(x._1)).

//    freqS.foreach { entry =>
//      if (freqT.isDefinedAt(entry._1)) {
//        if (freqT(entry._1) == freqS(entry._1)) {} else {
//          count2 = count2 + (freqS(entry._1) - freqT(entry._1)).abs
//        }
//      } else {
//        count = count //+ freqS(entry._1)
//      }
//    }

    freqS.foreach { entry =>
      if (freqT.isDefinedAt(entry._1)) {
        if (freqS(entry._1) > freqT(entry._1)) {
          count += freqS(entry._1) - freqT(entry._1)//).abs
        } else {
          //count2 = count2 + (freqS(entry._1) - freqT(entry._1)).abs
        }
      } else {
        count = count + freqS(entry._1)
      }
    }

    count + count2 / 2 //+ count2 % 2
  }
}
