package com.motycka.edu.lesson03.model

import kotlin.math.pow

class Sphere(private val radius: Double) : Shape3D {
    override fun volume(): Double = (4.0 / 3.0) * Math.PI * radius.pow(3)
    override fun surfaceArea(): Double = 4 * Math.PI * radius.pow(2)
    override fun toString(): String = "Sphere(radius=$radius, volume=${volume()}, surfaceArea=${surfaceArea()})"
}