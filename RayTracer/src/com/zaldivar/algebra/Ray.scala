package com.zaldivar.algebra

class Ray(val postition: Vector3d, val direction: UnitVector) {
  def this (postition: Vector3d, direction: Vector3d) = this(postition, new UnitVector(direction))

}