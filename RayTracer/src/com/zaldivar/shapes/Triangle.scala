package com.zaldivar.shapes

import com.zaldivar.algebra.Ray
import com.zaldivar.algebra.Vector3d
import com.zaldivar.algebra.UnitVector

class Triangle(val v1: Vector3d, val v2: Vector3d, val v3: Vector3d) extends Shape {
  val normal: Vector3d = new UnitVector((v1v2) x (v1v3))
  private val v1v2: Vector3d = v2 - v1
  private val v1v3: Vector3d = v3 - v1
  private val v2v3: Vector3d = v3 - v2
  private val v3v1: Vector3d = v1 - v3

  /**
   * return Double if less than zero it is an invalid point
   */
  override def intercept(ray: Ray): Double = {
    // Partially completed for testing purposes
    if ((normal dot ray.direction) == 0)
      -1
    else {
      val x: Double = ((normal dot (v1 - ray.postition)) / (normal dot ray.direction))
      val interceptionPoint: Vector3d = ray.pointAtX(x)
      val n1: Double = (normal dot ((v1v2) x (interceptionPoint - v1)))
      val n2: Double = (normal dot ((v2v3) x (interceptionPoint - v2)))
      val n3: Double = (normal dot ((v3v1) x (interceptionPoint - v3)))
      val allPositive: Boolean = ((n1 > 0) && (n2 > 0) && (n3 > 0))
      val allNegitive: Boolean = ((n1 < 0) && (n2 < 0) && (n3 < 0))
      if (allNegitive || allPositive)
        x
      else
        -1
    }
  }
}