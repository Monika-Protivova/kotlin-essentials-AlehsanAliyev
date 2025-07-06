package com.motycka.edu.lesson03.model

class Cuboid(private val width: Double, private val height: Double, private val depth: Double) : Shape3D {
    override fun volume(): Double = width * height * depth
    override fun surfaceArea(): Double = 2 * (width * height + width * depth + height * depth)
    override fun toString(): String = "Cuboid(width=$width, height=$height, depth=$depth, volume=${volume()}, surfaceArea=${surfaceArea()})"
}