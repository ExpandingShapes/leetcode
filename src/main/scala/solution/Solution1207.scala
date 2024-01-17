package solution

object Solution1207 {
  def uniqueOccurrences(arr: Array[Int]): Boolean = {
    val occurences = collection.mutable.Map[Int, Int]()

    arr.foreach { x =>
      if (occurences.contains(x))
        occurences.update(x, occurences(x) + 1)
      else
        occurences += (x -> 1)
    }

    occurences.size == occurences.values.toSet.size
  }
}
