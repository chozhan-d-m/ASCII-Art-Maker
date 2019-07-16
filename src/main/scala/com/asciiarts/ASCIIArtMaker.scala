package com.asciiarts

object ASCIIArtMaker {
  def setAsciiArt(alphabet: Char): Array[String] = {
    val asciiArt: Array[String] = Array("", "", "", "", "", "", "", "")
    alphabet match {
      case 'A' =>
        asciiArt(0) = "          "
        asciiArt(1) = "    /\\    "
        asciiArt(2) = "   /  \\   "
        asciiArt(3) = "  / /\\ \\  "
        asciiArt(4) = " / ____ \\ "
        asciiArt(5) = "/_/    \\_\\"
        asciiArt(6) = "          "
        asciiArt(7) = "          "

      case 'B' =>
        asciiArt(0) = " ____  "
        asciiArt(1) = "|  _ \\ "
        asciiArt(2) = "| |_) |"
        asciiArt(3) = "|  _ < "
        asciiArt(4) = "| |_) |"
        asciiArt(5) = "|____/ "
        asciiArt(6) = "       "
        asciiArt(7) = "       "

      case 'C' =>
        asciiArt(0) = "  _____ "
        asciiArt(1) = " / ____|"
        asciiArt(2) = "| |     "
        asciiArt(3) = "| |     "
        asciiArt(4) = "| |____ "
        asciiArt(5) = " \\_____|"
        asciiArt(6) = "        "
        asciiArt(7) = "        "

      case 'D' =>
        asciiArt(0) = " _____  "
        asciiArt(1) = "|  __ \\ "
        asciiArt(2) = "| |  | |"
        asciiArt(3) = "| |  | |"
        asciiArt(4) = "| |__| |"
        asciiArt(5) = "|_____/ "
        asciiArt(6) = "        "
        asciiArt(7) = "        "

      case 'E' =>
        asciiArt(0) = " ______ "
        asciiArt(1) = "|  ____|"
        asciiArt(2) = "| |__   "
        asciiArt(3) = "|  __|  "
        asciiArt(4) = "| |____ "
        asciiArt(5) = "|______|"
        asciiArt(6) = "        "
        asciiArt(7) = "        "

      case 'F' =>
        asciiArt(0) = " ______ "
        asciiArt(1) = "|  ____|"
        asciiArt(2) = "| |__   "
        asciiArt(3) = "|  __|  "
        asciiArt(4) = "| |     "
        asciiArt(5) = "|_|     "
        asciiArt(6) = "        "
        asciiArt(7) = "        "

      case 'G' =>
        asciiArt(0) = "  _____ "
        asciiArt(1) = " / ____|"
        asciiArt(2) = "| |  __ "
        asciiArt(3) = "| | |_ |"
        asciiArt(4) = "| |__| |"
        asciiArt(5) = " \\_____|"
        asciiArt(6) = "        "
        asciiArt(7) = "        "

      case 'H' =>
        asciiArt(0) = " _    _ "
        asciiArt(1) = "| |  | |"
        asciiArt(2) = "| |__| |"
        asciiArt(3) = "|  __  |"
        asciiArt(4) = "| |  | |"
        asciiArt(5) = "|_|  |_|"
        asciiArt(6) = "        "
        asciiArt(7) = "        "

      case 'I' =>
        asciiArt(0) = " _____ "
        asciiArt(1) = "|_   _|"
        asciiArt(2) = "  | |  "
        asciiArt(3) = "  | |  "
        asciiArt(4) = " _| |_ "
        asciiArt(5) = "|_____|"
        asciiArt(6) = "        "
        asciiArt(7) = "        "

      case 'J' =>
        asciiArt(0) = "      _ "
        asciiArt(1) = "     | |"
        asciiArt(2) = "     | |"
        asciiArt(3) = " _   | |"
        asciiArt(4) = "| |__| |"
        asciiArt(5) = " \\____/ "
        asciiArt(6) = "        "
        asciiArt(7) = "        "

      case 'K' =>
        asciiArt(0) = " _  __"
        asciiArt(1) = "| |/ /"
        asciiArt(2) = "| ' / "
        asciiArt(3) = "|  <  "
        asciiArt(4) = "| . \\ "
        asciiArt(5) = "|_|\\_\\"
        asciiArt(6) = "       "
        asciiArt(7) = "       "

      case 'L' =>
        asciiArt(0) = " _      "
        asciiArt(1) = "| |     "
        asciiArt(2) = "| |     "
        asciiArt(3) = "| |     "
        asciiArt(4) = "| |____ "
        asciiArt(5) = "|______|"
        asciiArt(6) = "        "
        asciiArt(7) = "        "

      case 'M' =>
        asciiArt(0) = " __  __ "
        asciiArt(1) = "|  \\/  |"
        asciiArt(2) = "| \\  / |"
        asciiArt(3) = "| |\\/| |"
        asciiArt(4) = "| |  | |"
        asciiArt(5) = "|_|  |_|"
        asciiArt(6) = "        "
        asciiArt(7) = "        "

      case 'N' =>
        asciiArt(0) = " _   _ "
        asciiArt(1) = "| \\ | |"
        asciiArt(2) = "|  \\| |"
        asciiArt(3) = "| . ` |"
        asciiArt(4) = "| |\\  |"
        asciiArt(5) = "|_| \\_|"
        asciiArt(6) = "       "
        asciiArt(7) = "       "

      case 'O' =>
        asciiArt(0) = "  ____  "
        asciiArt(1) = " / __ \\ "
        asciiArt(2) = "| |  | |"
        asciiArt(3) = "| |  | |"
        asciiArt(4) = "| |__| |"
        asciiArt(5) = " \\____/ "
        asciiArt(6) = "        "
        asciiArt(7) = "        "

      case 'P' =>
        asciiArt(0) = " _____  "
        asciiArt(1) = "|  __ \\ "
        asciiArt(2) = "| |__) |"
        asciiArt(3) = "|  ___/ "
        asciiArt(4) = "| |     "
        asciiArt(5) = "|_|     "
        asciiArt(6) = "        "
        asciiArt(7) = "        "

      case 'Q' =>
        asciiArt(0) = "  ____  "
        asciiArt(1) = " / __ \\ "
        asciiArt(2) = "| |  | |"
        asciiArt(3) = "| |  | |"
        asciiArt(4) = "| |__| |"
        asciiArt(5) = " \\___\\_\\"
        asciiArt(6) = "        "
        asciiArt(7) = "        "

      case 'R' =>
        asciiArt(0) = " _____  "
        asciiArt(1) = "|  __ \\ "
        asciiArt(2) = "| |__) |"
        asciiArt(3) = "|  _  / "
        asciiArt(4) = "| | \\ \\ "
        asciiArt(5) = "|_|  \\_\\"
        asciiArt(6) = "        "
        asciiArt(7) = "        "

      case 'S' =>
        asciiArt(0) = "  _____ "
        asciiArt(1) = " / ____|"
        asciiArt(2) = "| (___  "
        asciiArt(3) = " \\___ \\ "
        asciiArt(4) = " ____) |"
        asciiArt(5) = "|_____/ "
        asciiArt(6) = "        "
        asciiArt(7) = "        "

      case 'T' =>
        asciiArt(0) = " _______ "
        asciiArt(1) = "|__   __|"
        asciiArt(2) = "   | |   "
        asciiArt(3) = "   | |   "
        asciiArt(4) = "   | |   "
        asciiArt(5) = "   |_|   "
        asciiArt(6) = "         "
        asciiArt(7) = "         "

      case 'U' =>
        asciiArt(0) = " _    _ "
        asciiArt(1) = "| |  | |"
        asciiArt(2) = "| |  | |"
        asciiArt(3) = "| |  | |"
        asciiArt(4) = "| |__| |"
        asciiArt(5) = " \\____/ "
        asciiArt(6) = "        "
        asciiArt(7) = "        "

      case 'V' =>
        asciiArt(0) = "__      __"
        asciiArt(1) = "\\ \\    / /"
        asciiArt(2) = " \\ \\  / / "
        asciiArt(3) = "  \\ \\/ /  "
        asciiArt(4) = "   \\  /   "
        asciiArt(5) = "    \\/    "
        asciiArt(6) = "         "
        asciiArt(7) = "         "

      case 'W' =>
        asciiArt(0) = "__          __"
        asciiArt(1) = "\\ \\        / /"
        asciiArt(2) = " \\ \\  /\\  / / "
        asciiArt(3) = "  \\ \\/  \\/ /  "
        asciiArt(4) = "   \\  /\\  /   "
        asciiArt(5) = "    \\/  \\/    "
        asciiArt(6) = "             "
        asciiArt(7) = "             "

      case 'X' =>
        asciiArt(0) = "__   __"
        asciiArt(1) = "\\ \\ / /"
        asciiArt(2) = " \\ V / "
        asciiArt(3) = "  > <  "
        asciiArt(4) = " / . \\ "
        asciiArt(5) = "/_/ \\_\\"
        asciiArt(6) = "       "
        asciiArt(7) = "       "

      case 'Y' =>
        asciiArt(0) = "__     __"
        asciiArt(1) = "\\ \\   / /"
        asciiArt(2) = " \\ \\_/ / "
        asciiArt(3) = "  \\   /  "
        asciiArt(4) = "   | |   "
        asciiArt(5) = "   |_|   "
        asciiArt(6) = "         "
        asciiArt(7) = "         "

      case 'Z' =>
        asciiArt(0) = " ______"
        asciiArt(1) = "|___  /"
        asciiArt(2) = "   / / "
        asciiArt(3) = "  / /  "
        asciiArt(4) = " / /__ "
        asciiArt(5) = "/_____|"
        asciiArt(6) = "       "
        asciiArt(7) = "       "

      //--
      case 'a' =>
        asciiArt(0) = "       "
        asciiArt(1) = "       "
        asciiArt(2) = "  __ _ "
        asciiArt(3) = " / _` |"
        asciiArt(4) = "| (_| |"
        asciiArt(5) = " \\__,_|"
        asciiArt(6) = "       "
        asciiArt(7) = "       "

      case 'b' =>
        asciiArt(0) = " _     "
        asciiArt(1) = "| |    "
        asciiArt(2) = "| |__  "
        asciiArt(3) = "| '_ \\ "
        asciiArt(4) = "| |_) |"
        asciiArt(5) = "|_.__/ "
        asciiArt(6) = "       "
        asciiArt(7) = "       "

      case 'c' =>
        asciiArt(0) = "      "
        asciiArt(1) = "      "
        asciiArt(2) = "  ___ "
        asciiArt(3) = " / __|"
        asciiArt(4) = "| (__ "
        asciiArt(5) = " \\___|"
        asciiArt(6) = "      "
        asciiArt(7) = "      "

      case 'd' =>
        asciiArt(0) = "     _ "
        asciiArt(1) = "    | |"
        asciiArt(2) = "  __| |"
        asciiArt(3) = " / _` |"
        asciiArt(4) = "| (_| |"
        asciiArt(5) = " \\__,_|"
        asciiArt(6) = "       "
        asciiArt(7) = "       "

      case 'e' =>
        asciiArt(0) = "      "
        asciiArt(1) = "      "
        asciiArt(2) = "  ___ "
        asciiArt(3) = " / _ \\"
        asciiArt(4) = "|  __/"
        asciiArt(5) = " \\___|"
        asciiArt(6) = "      "
        asciiArt(7) = "      "

      case 'f' =>
        asciiArt(0) = "  __ "
        asciiArt(1) = " / _|"
        asciiArt(2) = "| |_ "
        asciiArt(3) = "|  _|"
        asciiArt(4) = "| |  "
        asciiArt(5) = "|_|  "
        asciiArt(6) = "     "
        asciiArt(7) = "     "

      case 'g' =>
        asciiArt(0) = "       "
        asciiArt(1) = "       "
        asciiArt(2) = "  __ _ "
        asciiArt(3) = " / _` |"
        asciiArt(4) = "| (_| |"
        asciiArt(5) = " \\__, |"
        asciiArt(6) = "  __/ |"
        asciiArt(7) = " |___/ "

      case 'h' =>
        asciiArt(0) = " _      "
        asciiArt(1) = "| |     "
        asciiArt(2) = "| |__   "
        asciiArt(3) = "|  __ \\ "
        asciiArt(4) = "| |  | |"
        asciiArt(5) = "|_|  |_|"
        asciiArt(6) = "        "
        asciiArt(7) = "        "

      case 'i' =>
        asciiArt(0) = " _ "
        asciiArt(1) = "(_)"
        asciiArt(2) = " _ "
        asciiArt(3) = "| |"
        asciiArt(4) = "| |"
        asciiArt(5) = "|_|"
        asciiArt(6) = "   "
        asciiArt(7) = "   "

      case 'j' =>
        asciiArt(0) = "   _ "
        asciiArt(1) = "  (_)"
        asciiArt(2) = "   _ "
        asciiArt(3) = "  | |"
        asciiArt(4) = "  | |"
        asciiArt(5) = "  | |"
        asciiArt(6) = " _/ |"
        asciiArt(7) = "|__/ "

      case 'k' =>
        asciiArt(0) = " _    "
        asciiArt(1) = "| |   "
        asciiArt(2) = "| | __"
        asciiArt(3) = "| |/ /"
        asciiArt(4) = "|   < "
        asciiArt(5) = "|_|\\_\\"
        asciiArt(6) = "      "
        asciiArt(7) = "      "

      case 'l' =>
        asciiArt(0) = " _ "
        asciiArt(1) = "| |"
        asciiArt(2) = "| |"
        asciiArt(3) = "| |"
        asciiArt(4) = "| |"
        asciiArt(5) = "|_|"
        asciiArt(6) = "   "
        asciiArt(7) = "   "

      case 'm' =>
        asciiArt(0) = "           "
        asciiArt(1) = "           "
        asciiArt(2) = " _ __ ___  "
        asciiArt(3) = "| '_ ` _ \\ "
        asciiArt(4) = "| | | | | |"
        asciiArt(5) = "|_| |_| |_|"
        asciiArt(6) = "           "
        asciiArt(7) = "           "

      case 'n' =>
        asciiArt(0) = "       "
        asciiArt(1) = "       "
        asciiArt(2) = " _ __  "
        asciiArt(3) = "| '_ \\ "
        asciiArt(4) = "| | | |"
        asciiArt(5) = "|_| |_|"
        asciiArt(6) = "       "
        asciiArt(7) = "       "

      case 'o' =>
        asciiArt(0) = "       "
        asciiArt(1) = "       "
        asciiArt(2) = "  ___  "
        asciiArt(3) = " / _ \\ "
        asciiArt(4) = "| (_) |"
        asciiArt(5) = " \\___/ "
        asciiArt(6) = "       "
        asciiArt(7) = "       "

      case 'p' =>
        asciiArt(0) = "       "
        asciiArt(1) = "       "
        asciiArt(2) = " _ __  "
        asciiArt(3) = "| '_ \\ "
        asciiArt(4) = "| |_) |"
        asciiArt(5) = "| .__/ "
        asciiArt(6) = "| |    "
        asciiArt(7) = "|_|    "

      case 'q' =>
        asciiArt(0) = "       "
        asciiArt(1) = "       "
        asciiArt(2) = "  __ _ "
        asciiArt(3) = " / _` |"
        asciiArt(4) = "| (_| |"
        asciiArt(5) = " \\__, |"
        asciiArt(6) = "    | |"
        asciiArt(7) = "    |_|"

      case 'r' =>
        asciiArt(0) = "      "
        asciiArt(1) = "      "
        asciiArt(2) = " _ __ "
        asciiArt(3) = "| '__|"
        asciiArt(4) = "| |   "
        asciiArt(5) = "|_|   "
        asciiArt(6) = "      "
        asciiArt(7) = "      "

      case 's' =>
        asciiArt(0) = "     "
        asciiArt(1) = "     "
        asciiArt(2) = " ___ "
        asciiArt(3) = "/ __|"
        asciiArt(4) = "\\__ \\"
        asciiArt(5) = "|___/"
        asciiArt(6) = "     "
        asciiArt(7) = "     "

      case 't' =>
        asciiArt(0) = " _   "
        asciiArt(1) = "| |  "
        asciiArt(2) = "| |_ "
        asciiArt(3) = "| __|"
        asciiArt(4) = "| |_ "
        asciiArt(5) = " \\__|"
        asciiArt(6) = "     "
        asciiArt(7) = "     "

      case 'u' =>
        asciiArt(0) = "       "
        asciiArt(1) = "       "
        asciiArt(2) = " _   _ "
        asciiArt(3) = "| | | |"
        asciiArt(4) = "| |_| |"
        asciiArt(5) = " \\__,_|"
        asciiArt(6) = "       "
        asciiArt(7) = "       "

      case 'v' =>
        asciiArt(0) = "       "
        asciiArt(1) = "       "
        asciiArt(2) = "__   __"
        asciiArt(3) = "\\ \\ / /"
        asciiArt(4) = " \\ V / "
        asciiArt(5) = "  \\_/  "
        asciiArt(6) = "       "
        asciiArt(7) = "       "

      case 'w' =>
        asciiArt(0) = "          "
        asciiArt(1) = "          "
        asciiArt(2) = "__      __"
        asciiArt(3) = "\\ \\ /\\ / /"
        asciiArt(4) = " \\ V  V / "
        asciiArt(5) = "  \\_/\\_/  "
        asciiArt(6) = "          "
        asciiArt(7) = "          "

      case 'x' =>
        asciiArt(0) = "      "
        asciiArt(1) = "      "
        asciiArt(2) = "__  __"
        asciiArt(3) = "\\ \\/ /"
        asciiArt(4) = " >  < "
        asciiArt(5) = "/_/\\_\\"
        asciiArt(6) = "      "
        asciiArt(7) = "      "

      case 'y' =>
        asciiArt(0) = "       "
        asciiArt(1) = "       "
        asciiArt(2) = " _   _ "
        asciiArt(3) = "| | | |"
        asciiArt(4) = "| |_| |"
        asciiArt(5) = " \\__, |"
        asciiArt(6) = "  __/ |"
        asciiArt(7) = " |___/ "

      case 'z' =>
        asciiArt(0) = "     "
        asciiArt(1) = "     "
        asciiArt(2) = " ____"
        asciiArt(3) = "|_  /"
        asciiArt(4) = " / / "
        asciiArt(5) = "/___|"
        asciiArt(6) = "     "
        asciiArt(7) = "     "

      case ' ' =>
        asciiArt(0) = "  "
        asciiArt(1) = "  "
        asciiArt(2) = "  "
        asciiArt(3) = "  "
        asciiArt(4) = "  "
        asciiArt(5) = "  "
        asciiArt(6) = "  "
        asciiArt(7) = "  "

      case _ =>
        asciiArt(0) = ""
        asciiArt(1) = ""
        asciiArt(2) = ""
        asciiArt(3) = ""
        asciiArt(4) = ""
        asciiArt(5) = ""
        asciiArt(6) = ""
        asciiArt(7) = ""

    }
    asciiArt
  }

  def getAsciiArt(str: String): Array[String] = {
    val art: Array[String] = Array("", "", "", "", "", "", "", "")
    str.foreach(x => {
      val tempArt = setAsciiArt(x)
      art(0) = art(0) + tempArt(0)
      art(1) = art(1) + tempArt(1)
      art(2) = art(2) + tempArt(2)
      art(3) = art(3) + tempArt(3)
      art(4) = art(4) + tempArt(4)
      art(5) = art(5) + tempArt(5)
      art(6) = art(6) + tempArt(6)
      art(7) = art(7) + tempArt(7)
    }
    )
    art
  }

  def main(args: Array[String]): Unit = {
    getAsciiArt("ASCII Art Maker").foreach(println)
  }
}



