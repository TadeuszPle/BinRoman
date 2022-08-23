import scala.collection.immutable.TreeMap
import scala.io.StdIn.{readChar, readInt}

object Main{


  val romMap: TreeMap[Int, String] = TreeMap(
      0 -> "",
      1 -> "I",
      4 -> "IV",
      5 -> "V",
      9 -> "IX",
      10 -> "X",
      40 -> "XL",
      50 -> "L",
      90 -> "XC",
      100 -> "C",
      400 -> "CD",
      500 -> "D",
      900 -> "CM",
      1000 -> "M")

  def intToRom(number: Int): String = {
    val biggest = romMap.rangeTo(number).last
    biggest match {
      case (0, _)=> romMap(0)
      case (i, _) => romMap(i) ++ intToRom(number - i)
    }
  }

  def intToBin(number: Int): String = number.toBinaryString

 

  def main(args: Array[String]): Unit = { 
    
    println("Enter number: ")
    val number = readInt()
    print("Enter: \n B to covert to binary \n R to convert to Roman\n")
    val conversionType = readChar()
    conversionType.toUpper match{
      case 'B' => print(intToBin(number))
      case 'R' => print(intToRom(number))
      case _ => println("Wrong input data")
    }

  }
    
   
}

/*

  */