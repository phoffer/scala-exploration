// import scala.collection.mutable.Map

def formatArgs(args: Iterable[Int]) = args.mkString("\n")
  
var treasureMap = Map[Int, String]()
treasureMap += (1 -> "Go to island.")
treasureMap += (2 -> "Find big X on ground.")
treasureMap += (3 -> "Dig.")
var tup = (4, "Find the treaser.")
treasureMap = treasureMap + tup
// treasureMap = treasureMap + (4, "Find the treaser.") // this doesn't work
println(treasureMap(4))

val romanNumeral = Map(1 -> "I", 2 -> "II", 3 -> "III", 4 -> "IV", 5 -> "V")
println(romanNumeral(4))

println(formatArgs(romanNumeral.values))
// println(formatArgs(romanNumeral.keys))
