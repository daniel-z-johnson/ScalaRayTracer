package com.zaldivar.image

class ColorARGB {
  private var alpha: Double = 0.0
  private var red: Double = 0.0
  private var green: Double = 0.0
  private var blue: Double = 0.0

  def SetRed(red: Double): Unit = this.red = red
  def setBlue(blue: Double): Unit = this.blue = blue
  def setGreen(green: Double): Unit = this.green = green
  def setALpha(alpha: Double): Unit = this.alpha = alpha

  private def inRange(componet: Double, value: Double): Double = {
    val x: Double = componet + value
    if (x < 0)
      0
    else if (x > 1)
      1
    else
      x
  }
  
  def addToRed(value: Double):Unit = red = inRange(red, value)
  def addToBlue(value: Double):Unit = blue = inRange(blue, value)
  def addToGreen(value: Double):Unit = green = inRange(green, value)
  def addToAlpha(value: Double):Unit = alpha = inRange(alpha, value)
  
  def colorArgbAsInt():Int = {
    // This next part is ugly will atempt to fix latter
    def a:Int =  (alpha * 255).toInt
    def r:Int = (red * 255).toInt
    def g:Int = (green * 255).toInt
    def b:Int = (blue * 255).toInt
    (a << 24) | (r << 16) | (g << 8) | (b)
  }
}