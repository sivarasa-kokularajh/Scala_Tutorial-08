object StringFormatting {
  def toUpper(input: String): String = {
    input.toUpperCase()
  }
  
  def toLower(input: String): String = {
    input.toLowerCase()
  }
  
  def formatNames(name: String, formatFunction: String => String): String = {
    formatFunction(name)
  }

  def main(args: Array[String]): Unit = {
    val names = List("Benny", "Niroshan", "Saman", "Kumara")
    
    for (name <- names) {
      val upperCaseName = formatNames(name, toUpper)
      val lowerCaseName = formatNames(name, toLower)
      println(upperCaseName)
      println(lowerCaseName)
      println()
    }
  }
}