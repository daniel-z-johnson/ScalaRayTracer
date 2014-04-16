package com.zaldivar.algebra

class UnitVector(vector: Vector3d)
  extends Vector3d(vector.x / vector.magitude, vector.y / vector.magitude, vector.z / vector.magitude) {

}