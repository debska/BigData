package agh.wggios.analizadanych.datareader

import agh.wggios.analizadanych

class DataReader {
  def readData(): String = {
    val source = scala.io.Source.fromFile("c:\\Users\\HP\\Desktop\\IiAD semestr 6\\big data\\lab7\\spark-maven-demo-main\\tekst_maly.txt")
    val lines = try source.mkString finally source.close()
    println(lines)
    return lines
  }

}
