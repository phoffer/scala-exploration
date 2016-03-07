import ChecksumAccumulator.calculate

object Summer {
  def main(args: Array[String]) {
    for (arg <- args)
      println(arg +": "+ calculate(arg))
  }
}

// scalac ChecksumAccumulator.scala 4.3-summer.scala