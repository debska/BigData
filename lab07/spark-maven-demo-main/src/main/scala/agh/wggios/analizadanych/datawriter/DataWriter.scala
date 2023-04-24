package agh.wggios.analizadanych.datawriter
import java.io._

class DataWriter {

  def writeData(tekst: String): Boolean = {
    val fileName = "c:\\Users\\HP\\Desktop\\IiAD semestr 6\\big data\\lab7\\tekst_duzy.txt"
    val pw = new PrintWriter(new File(fileName))
    pw.write(tekst)
    pw.close()
    return true
  }


}
