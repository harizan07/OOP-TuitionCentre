import javafx.util.Pair;

import java.util.ArrayList;


public class Main {
    public static void main(String[] args) {
        Integer BM = 0,BI = 0,MT = 0,SC = 0;
        String tutorName = "", tutorIC = "", tutorAdd = "", tutorQualification = "", yearExp= "", dateJoined = "", yearsInCentre = "",studentName = "",studentIC = "",studentAddress = "",studentYear = "", schoolName = "";

        tutor first_tutor = new tutor(tutorName, tutorIC, tutorAdd, tutorQualification, yearExp, dateJoined, yearsInCentre);
        student first_student = new student(studentName,studentIC,studentAddress,studentYear,schoolName,BM,BI,MT,SC);

        System.out.println(first_tutor.toString_tutors());
        Branches.branches();
        System.out.println(first_student.toString_students());

        Pair<Double,String> p = calculation.calc(first_student);
        System.out.println("Average is " + p.getKey() + "\n Performance: " + p.getValue());


    }
}