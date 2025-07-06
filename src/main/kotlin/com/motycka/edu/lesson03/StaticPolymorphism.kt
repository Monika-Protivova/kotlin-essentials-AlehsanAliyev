package com.motycka.edu.lesson03


object AreaCalculator {
    fun calculateRectangleArea(a: Double, b: Double): Double = a * b
    fun calculateRectangleArea(a: Int, b: Int): Double = a * b.toDouble()
    fun calculateCircleArea(r: Double): Double = Math.PI * r * r
    fun calculateCircleArea(r: Int): Double = Math.PI * r * r.toDouble()
    fun calculateTriangleArea(a: Double, b: Double): Double = 0.5 * a * b
    fun calculateTriangleArea(a: Int, b: Int): Double = 0.5 * a * b.toDouble()
}

fun main() {
    println(AreaCalculator.calculateRectangleArea(5, 10))
}