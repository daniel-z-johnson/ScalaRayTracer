package com.zaldivar.shapes

import com.zaldivar.algebra.Ray

abstract class Shape {
  
  def intercept(ray: Ray): Double
}