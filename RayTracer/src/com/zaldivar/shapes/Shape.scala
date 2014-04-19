package com.zaldivar.shapes

import com.zaldivar.algebra.Ray

abstract class Shape {

  /**
   * Finds the point of interception if it exists
   * 
   * returns -1 if it doesn't intercept or point of interception is behind it
   * 		  DOuble > 0 for anything else, value represents t in dt + o = p
   */
  def intercept(ray: Ray): Double
}