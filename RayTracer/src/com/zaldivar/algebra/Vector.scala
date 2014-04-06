package com.zaldivar.algebra

class Vector(val x: Double, val y: Double, val z: Double) {
  
  def +(that: Vector): Vector = new Vector(x + that.x, y + that.y, z + that.z)
  
  def unary_- = new Vector(-x, -y, -z)
  
  def -(that: Vector): Vector = this + -that
  
  def magitude(): Double = math.sqrt(x*x + y*y + z*z)

  override def equals(any: Any): Boolean = any match {
    case that: Vector => x == that.x && y == that.y && z == that.z
    case _ => false
  }
}