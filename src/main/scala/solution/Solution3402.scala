package solution

object Solution3402 {
  def minimumOperations(grid: Array[Array[Int]]): Int = {
    val columnsNumber = grid.head.length
    var result = 0

    for (i <- 0 until columnsNumber) {
      val column = grid.map(_.apply(i))

      for (j <- 1 until column.length) {
        if (column(j) < column(j - 1) + 1) {
          result += column(j - 1) + 1 - column(j)

          column(j) = column(j - 1) + 1
        }
      }
    }

    result
  }
}
