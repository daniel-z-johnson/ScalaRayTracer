package com.zaldivar.algebra
import org.scalatest.FunSuite

import org.junit.runner.RunWith
import org.scalatest.junit.JUnitRunner

@RunWith(classOf[JUnitRunner])
class VectorTest extends FunSuite {
  val a: Vector = new Vector(1, 2, 3)
  val b: Vector = new Vector(2, 3, 4)
  val c: Vector = new Vector(3, 5, 7)
  val negC: Vector = new Vector(-3, -5, -7)
  
  val magA: Double = math.sqrt(1 + 4 + 9)
  val magB: Double = math.sqrt(4 + 9 + 16)
  val magC: Double = math.sqrt(9 + 25 + 49)

  test("a + b = c") {
    assert(a + b == c)
  }

  test("b + a = c") {
    assert(b + a == c)
  }

  test("c - a = b") {
    assert(c - a == b)
  }

  test("c - b = a") {
    assert(c - b == a)
  }
  
  test("using -c really yields -c") {
    assert(-c == negC)
  }
  
  test("using -negc yields c") {
    assert(-negC == c)
  }
  
  test("uing - twice on c yields c, will never use in code but it is a test") {
    assert(-(-c) == c)
  }
  
  test("magitude function works test a") {
    assert(magA == a.magitude)
  }
  
  test("magitude function works test b") {
    assert(magB == b.magitude)
  }
  
  test("magitude function works test c") {
    assert(magC == c.magitude)
  }
  
  test("magitude function works test negC") {
    assert(magC == negC.magitude)
  }

}