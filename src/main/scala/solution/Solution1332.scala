package solution

import org.openjdk.jmh.annotations.{Benchmark, BenchmarkMode, Mode, OutputTimeUnit}
import org.openjdk.jmh.infra.Blackhole
import solution.Solution1332.{removePalindromeSub, removePalindromeSub2}

import java.util.concurrent.TimeUnit

/*
  https://leetcode.com/problems/remove-palindromic-subsequences/
 */
object Solution1332 {
  def removePalindromeSub(s: String): Int = {
    if(s.isEmpty) {
      0
    } else {
      if(s == s.reverse) 1 else 2
    }
  }

  def removePalindromeSub2(s: String): Int = {
    if(s.isEmpty) {
      0
    } else {
      if(s.endsWith(s.take(s.length / 2).reverse)) 1 else 2
    }
  }
}

@OutputTimeUnit(TimeUnit.MILLISECONDS)
@BenchmarkMode(Array(Mode.Throughput))
class Solution1332{
  @Benchmark
  def reverse: Int = {
    removePalindromeSub("bbaabaaa")
  }

//  @Benchmark
//  def endsWithReverse(blackhole: Blackhole): Int = {
//    removePalindromeSub2("bbaabaaa")
//  }
}