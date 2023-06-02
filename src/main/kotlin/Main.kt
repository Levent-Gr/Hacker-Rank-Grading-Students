fun main(args: Array<String>) {

    val result = gradingStudents(arrayOf(73,67,38,33))

    println(result.joinToString("\n"))
}


fun gradingStudents(grades: Array<Int>): Array<Int> {
    var finalGrades = emptyArray<Int>()


    for(grade in grades){

        if(grade >= 38 && grade<=100){
            var newGradeAddedTwo = grade+2
            var newGradeAddedOne = grade+1

            if(newGradeAddedTwo%5==0){
                finalGrades+=newGradeAddedTwo
            }else if(newGradeAddedOne%5==0){
                finalGrades+=newGradeAddedOne
            }else{
                finalGrades+=grade
            }
        }else{
            finalGrades+=grade
        }
    }

    return finalGrades

}
