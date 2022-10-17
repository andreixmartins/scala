package test

import scala.collection.mutable.ListBuffer

object Compactor {

  def solution1(list: List[Char]): List[(Int, Char)] = {

    val buffer = new ListBuffer[(Int, Char)]()

    var counter: Int = 1;
    var current: Char = list.head
    list.tail.foreach(char => {
      if (char == current) {
        counter += 1
      } else {
        val tuple = (counter, current)
        buffer += tuple
        counter = 1;
      }
      current = char
    })

    val tuple = (counter, current)
    buffer += tuple

    buffer.toList
  }

  def solution2(list: List[Char]): List[(Int, Char)] = {

    val buffer = new ListBuffer[(Int, Char)]()

    var current = list.head
    var counter = 0
    list.foreach(char => {
      if (char == current) {
        counter += 1;
      } else {
        val tuple = (counter, current)
        buffer += tuple
        counter = 1;
      }
      current = char;
    })

    val tuple = (counter, current)
    buffer += tuple

    buffer.toList

  }

  def solution3(listChars: List[Char]): List[(Int, Char)] = {

    val buffer = new ListBuffer[(Int, Char)]()

    var list: List[Char] = listChars
    list.foreach(char => {
      val value = list.takeWhile(_.equals(char))
      if (value.size != 0) {
        list = list.dropWhile(_.equals(char))
        val tuple = (value.size, char)
        buffer += tuple
      }
    })

    buffer.toList
  }
}
