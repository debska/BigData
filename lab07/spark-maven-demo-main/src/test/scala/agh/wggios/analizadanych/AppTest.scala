package agh.wggios.analizadanych

import org.junit._
import Assert._
import agh.wggios.analizadanych.datareader.DataReader
import agh.wggios.analizadanych.datamodifyer.DataModifyer
import agh.wggios.analizadanych.datawriter.DataWriter

@Test
class AppTest {
    val obiekt: DataReader = new DataReader
    val b = obiekt.readData()
    val obiekt2: DataModifyer = new DataModifyer
    val zamiana = obiekt2.modifyData(b)
    val obiekt3: DataWriter = new DataWriter
    val wynik = obiekt3.writeData(zamiana)

    @Test
    def testOK() = assertTrue(true)

    @Test
    def testOK2() = assertTrue(b == "ala ma kota")

    @Test
    def testOK3() = assertTrue(zamiana == "ALA MA KOTA")

    @Test
    def testOK4() = assertTrue(wynik)

//    @Test
//    def testKO() = assertTrue(false)

}


