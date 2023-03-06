import java.util.ArrayList;
import java.util.Scanner;

public class student {
    Scanner Input = new Scanner(System.in);
    private
    String _StudentName, _StudentIC, _StudentAddress, _StudentYear, _SchoolName;
    Integer _BahasaMelayu, _BahasaInggeris, _Mathematics, _Science;

    public String toString_students(){
        return get_StudentName() + "\n" + get_StudentIC() + "\n" + get_StudentAddress() + "\n" + get_StudentYear()+ "\n" + get_SchoolName() + "\n";
    }

    //constructor
    public student(String studentName, String studentIC, String studentAddress
                   ,String studentYear, String schoolName,Integer BM,
                   Integer BI,Integer MT, Integer SC){
        set_StudentName(studentName);
        set_StudentIC(studentIC);
        set_StudentAddress(studentAddress);
        set_StudentYear(studentYear);
        set_SchoolName(schoolName);
        set_BahasaMelayu(BM);
        set_BahasaInggeris(BI);
        set_Mathematics(MT);
        set_Science(SC);
    }

    //setter
    void set_StudentName(String studentName){_StudentName = studentName;}
    void set_StudentIC(String studentIC){_StudentIC = studentIC;}
    void set_StudentAddress(String studentAddress){_StudentAddress = studentAddress;}
    void set_StudentYear(String studentYear){_StudentName = studentYear;}
    void set_SchoolName(String schoolName){_SchoolName = schoolName;}
    void set_BahasaMelayu(Integer BM){_BahasaMelayu = BM;}
    void set_BahasaInggeris(Integer BI){_BahasaInggeris = BI;}
    void set_Mathematics(Integer MT){_Mathematics = MT;}
    void set_Science(Integer SC){_Science = SC;}

    //getter
    String get_StudentName(){
        System.out.println("Enter student's name: ");
        _StudentName = Input.nextLine();
        return _StudentName;}
    String get_StudentIC(){
        System.out.println("Enter student IC: ");
        _StudentIC = Input.nextLine();
        return _StudentIC;}
    String get_StudentAddress(){
        System.out.println("Enter student address: ");
        _StudentAddress = Input.nextLine();
        return _StudentAddress;}
    String get_StudentYear(){
        System.out.println("Enter year: ");
        _StudentYear = Input.nextLine();
        return _StudentYear;}
    String get_SchoolName(){
        System.out.println("Enter school name: ");
        _SchoolName = Input.nextLine();
        return _SchoolName;
    }
    Integer get_BahasaMelayu(){
        System.out.println("Enter BM result: ");
        _BahasaMelayu = Input.nextInt();
        return _BahasaMelayu;}
    Integer get_BahasaInggeris(){
        System.out.println("Enter BI result: ");
        _BahasaInggeris = Input.nextInt();
        return _BahasaInggeris;}
    Integer get_Mathematics(){
        System.out.println("Enter MT result: ");
        _Mathematics = Input.nextInt();
        return _Mathematics;}
    Integer get_Science(){
        System.out.println("Enter SC result: ");
        _Science = Input.nextInt();
        return _Science;}




}
