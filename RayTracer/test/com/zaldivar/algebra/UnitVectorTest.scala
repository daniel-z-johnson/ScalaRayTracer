package com.zaldivar.algebra
import org.scalatest.FunSuite

import org.junit.runner.RunWith
import org.scalatest.junit.JUnitRunner

@RunWith(classOf[JUnitRunner])
class UnitVectorTest extends FunSuite {
  val unitVectorA = new UnitVector(new Vector3d(1, 2, 3))
  val unitVectorB = new UnitVector(new Vector3d(4, 2, 9))
  val unitVectorC = new UnitVector(new Vector3d(123, 265, 313))
  val unitVectorD = new UnitVector(new Vector3d(104729, 658, 313))
  val unitVectorE = new UnitVector(new Vector3d(104729, 104729, 104729))
  val unitVectorF = new UnitVector(new Vector3d(1, 1, 1))
  val unitVectorG = new UnitVector(new Vector3d(23, 0, 0))
  val unitVectorH = new UnitVector(new Vector3d(0, 23, 0))
  val unitVectorI = new UnitVector(new Vector3d(23, 23, 1))
  val unitVectorJ = new UnitVector(new Vector3d(0, 23, 23))
  val unitVectorK = new UnitVector(new Vector3d(23, 23, 23))
  val unitVectorL = new UnitVector(new Vector3d(31, 1, 1))
  val unitVectorM = new UnitVector(new Vector3d(0, 0, 31))
  val unitVectorN = new UnitVector(new Vector3d(31, 31, 31))
  val unitVectorO = new UnitVector(new Vector3d(1, 7, 1))
  val unitVectorP = new UnitVector(new Vector3d(0, 0, 7))
  val unitVectorQ = new UnitVector(new Vector3d(0, 0, 89))
  val unitVectorR = new UnitVector(new Vector3d(89, 89, 89))
  val unitVectorS = new UnitVector(new Vector3d(97, 0, 1))
  val unitVectorT = new UnitVector(new Vector3d(0, 0, 97))
  val unitVectorU = new UnitVector(new Vector3d(97, 97, 97))
  val unitVectorV = new UnitVector(new Vector3d(103, 107, 109))
  val unitVectorW = new UnitVector(new Vector3d(2, 3, 5))
  val unitVectorX = new UnitVector(new Vector3d(7, 11, 13))
  val unitVectorY = new UnitVector(new Vector3d(17, 17, 17))
  val unitVectorZ = new UnitVector(new Vector3d(5816, 85315, 8516))


  test("unitVectorA magitude is 1") {
    assert(unitVectorA.magitude == 1)
  }

  test("unitVectorB magitude is 1") {
    assert(unitVectorB.magitude == 1)
  }

  test("unitVectorC magitude is 1") {
    assert(unitVectorC.magitude == 1)
  }

  test("unitVectorD magitude is 1") {
    assert(unitVectorD.magitude == 1)
  }

  test("unitVectorE magitude is 1") {
    assert(unitVectorE.magitude == 1)
  }

  test("unitVectorF mag is 1") {
    assert(unitVectorF.magitude == 1)
  }

  test("unitVectorG mag is 1") {
    assert(unitVectorG.magitude == 1)
  }

  test("unitVectorH mag is 1") {
    assert(unitVectorH.magitude == 1)
  }

  test("unitVectorI mag is 1") {
    assert(unitVectorI.magitude == 1)
  }
  
  test("unitVectorJ mag is 1") {
    assert(unitVectorJ.magitude == 1)
  }
  
  test("unitVectorK mag is 1") {
    assert(unitVectorK.magitude == 1)
  }
  
  test("unitVectorL mag is 1") {
    assert(unitVectorL.magitude == 1)
  }
  
  test("unitVectorM mag is 1") {
    assert(unitVectorM.magitude == 1)
  }
  
  test("unitVectorN mag is 1") {
    assert(unitVectorN.magitude == 1)
  }
  
  test("unitVectorO mag is 1") {
    assert(unitVectorO.magitude == 1)
  }
  
  test("unitVectorP mag is 1") {
    assert(unitVectorP.magitude == 1)
  }
  
  test("unitVectorQ mag is 1") {
    assert(unitVectorQ.magitude == 1)
  }
  
  test("unitVectorR mag is 1") {
    assert(unitVectorR.magitude == 1)
  }
  
  test("unitVectorS mag is 1") {
    assert(unitVectorS.magitude == 1)
  }
  
  test("unitVectorT mag is 1") {
    assert(unitVectorT.magitude == 1)
  }
  
  test("unitVectorU mag is 1") {
    assert(unitVectorU.magitude == 1)
  }
  
  test("unitVectorV mag is 1") {
    assert(unitVectorV.magitude == 1)
  }
  
  test("unitVectorW mag is 1") {
    assert(unitVectorW.magitude == 1)
  }
  
  test("unitVectorX mag is 1") {
    assert(unitVectorX.magitude == 1)
  }
  
  test("unitVectorY mag is 1") {
    assert(unitVectorY.magitude == 1)
  }
  
  test("unitVectorZ mag is 1") {
    assert(unitVectorZ.magitude == 1)
  }

}