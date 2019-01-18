// Hi There!
object Puzzle1 {

  val foo = List(1, 2).map { i => println("Hi"); i + 1 }
  val bar = List(1, 2).map { println("Hi"); _ + 1 }

  // put a1
  val a1 =
    s"""Hi
       |List[Int] = List(2, 3)
       |Hi
       |List[Int] = List(2, 3)
     """.stripMargin

  // put a2
  val a2 =
    s"""Hi
       |Hi
       |List[Int] = List(2, 3)
       |Hi
       |Hi
       |List[Int] = List(2, 3)
     """.stripMargin

  // put a3
  val a3 =
    s"""Hi
       |Hi
       |List[Int] = List(2, 3)
       |Hi
       |List[Int] = List(2, 3)
     """.stripMargin

  // foo put a4 and bar is compile error
  val a4 =
    s"""Hi
       |Hi
       |List[Int] = List(2, 3)
     """.stripMargin

  // a3?
}
