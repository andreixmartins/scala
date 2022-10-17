import scala.collection.mutable.ListBuffer

@main
def main(): Unit = {


  val buffer = new ListBuffer[(Int, Char)]()

  var list: List[Char] = List('a', 'a', 'a', 'a', 'b', 'c', 'c', 'a', 'a', 'd', 'e', 'e', 'e', 'e')
  list.foreach(char => {
    val value = list.takeWhile(_.equals(char))
    if (value.size != 0) {
      list = list.dropWhile(_.equals(char))
      val tuple = (value.size, char)
      buffer += tuple
    }
  })

  println(buffer.toList)

}
