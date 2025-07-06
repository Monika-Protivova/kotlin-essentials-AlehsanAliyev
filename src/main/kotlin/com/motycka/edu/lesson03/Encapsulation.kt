package com.motycka.edu.lesson03

import java.time.LocalDate
class Assignment() {

    lateinit var due: LocalDate
    lateinit var assignedTo: String

    constructor(due: LocalDate, assignedTo: String) : this() {
        this.due = due
        this.assignedTo = assignedTo
    }

    private var internalGrade: Int? = null

    fun setFinalGrade(score: Int) {
        if (score < 0 || score > 100) {
            throw IllegalArgumentException("Final grade must be between 0 and 100")
        }
        internalGrade = score
    }

    fun getFinalGrade(): Int? {
        return internalGrade
    }
}

/*
 Uncomment the main function to try the solution.
 */

//fun main() {
//    val assignment = Assignment(LocalDate.now(), "John Doe")
//    assignment.setFinalGrade(90)
//    println(assignment.getFinalGrade())
//}
