package com.zaldivar.shapes

import com.zaldivar.algebra.Ray
import com.zaldivar.algebra.Vector3d
import scala.math._

class Sphere(val center: Vector3d, val radias: Double) extends Shape {

  @Override
  def intercept(ray: Ray): Double = {
    val a: Double = (ray.direction dot ray.direction)
    val b: Double = (2 * (ray.direction dot (ray.postition - center)))
    val c: Double = (((ray.postition - center) dot (ray.postition - center)) - (radias * radias))

    val discriminant: Double = ((b * b) - (4 * a * c))
    if (discriminant < 0)
      -1
    else {
      val x1: Double = (((-b) - sqrt(discriminant)) / (2 * a))
      val x2: Double = (((-b) + sqrt(discriminant)) / (2 * a))
      if (x1 < 0 && x2 < 0) -1
      else if (x1 < 0 && x2 > 0) x2
      else if (x1 > 0 && x2 < 0) x1
      else if (x1 < x2) x1
      else x2
    }

  }

}