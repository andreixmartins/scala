package test

import org.scalatest.{BeforeAndAfterAll, BeforeAndAfterEach}
import org.scalatest.funsuite.AnyFunSuite


class CompactorTest extends AnyFunSuite with BeforeAndAfterAll with BeforeAndAfterEach {


  override def beforeEach(): Unit = {
    super.beforeEach()
//    println()
//      for((x,i) <- list.view.zipWithIndex) println("String #" + i + " is " + x)
//
//      for (i <- list.indices) println("String #" + i + " is " + list(i))
  }

  test("Solution 1") {

    println("Solution 1")

    val list: List[Char] = List('a', 'a', 'b', 'a', 'a', 'z', 'a')
    val expected = List((2, 'a'), (1, 'b'), (2, 'a'), (1, 'z'), (1, 'a'))
    println(s"Expected result: ${expected}")
    val result = Compactor.solution1(list)
    println(s"Result: ${result}")
    assert(expected == result)
  }

  test("Solution 2") {

    println("Solution 2")

    val list: List[Char] = List('a', 'a', 'a', 'a', 'x', 'a', 'x', 'x', 'x', 'v', 'y', 'y', 'y', 'y')
    val expected = List((4, 'a'), (1, 'x'), (1, 'a'), (3, 'x'), (1, 'v'), (4, 'y'))
    println(s"Expected result: ${expected}")
    val result = Compactor.solution2(list)
    println(s"Result: ${result}")
    assert(expected == result)
  }

  test("Solution 3") {

    println("Solution 3")

    val list: List[Char] = List('a', 'a', 'a', 'a', 'x', 'a', 'x', 'x', 'x', 'v', 'y', 'y', 'y', 'y')
    val expected = List((4, 'a'), (1, 'x'), (1, 'a'), (3, 'x'), (1, 'v'), (4, 'y'))
    println(s"Expected result: ${expected}")
    val result = Compactor.solution3(list)
    println(s"Result: ${result}")
    assert(expected == result)
  }
}
