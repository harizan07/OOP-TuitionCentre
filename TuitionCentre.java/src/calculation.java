import java.util.Scanner;
import javafx.util.Pair;

 class calculation {
     public static Pair<Double,String> calc(student first_student){
         double total;
         double average;
         String performance = " ";
         total = first_student.get_BahasaMelayu() + first_student.get_BahasaInggeris() + first_student.get_Mathematics() + first_student.get_Science();
         average = total / 5;
         if(average <=100 && average >=75){
             performance = "One of the top or on top";
         }else if(average <75 && average >=50) {
             performance = "Average or above average";
         }else if(average <50 && average >=25) {
             performance = "Not so great";
         }else if(average <25 && average >=0) {
             performance = "Poor, need extra focus on this student";
         } else {
             performance = "Wrong/invalid input";
         }
         return new Pair<Double,String>(average,performance);
     }


}
