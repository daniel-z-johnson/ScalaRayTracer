package com.zaldivar.algebra

class Vector3d(val x: Double, val y: Double, val z: Double) {

  def +(that: Vector3d): Vector3d = new Vector3d(x + that.x, y + that.y, z + that.z)

  def unary_- = new Vector3d(-x, -y, -z)

  def -(that: Vector3d): Vector3d = Vector3d.this + -that
  
  def x(that: Vector3d): Vector3d = new Vector3d(y * that.z - z * that.y, 
		  									x * that.z - z * that.x,
		  									x * that.y - y * that.x)
  
  def *(scalar: Double):Vector3d = new Vector3d(x*scalar, y*scalar, z*scalar)
  
  def *(scalar: Int):Vector3d = new Vector3d(x*scalar, y*scalar, z*scalar)

  def magitude(): Double = math.sqrt(x * x + y * y + z * z)

  def dot(that: Vector3d): Double = x * that.x + y * that.y + z * that.z

  override def equals(any: Any): Boolean = any match {
    case that: Vector3d => x == that.x && y == that.y && z == that.z
    case _ => false
  }

}