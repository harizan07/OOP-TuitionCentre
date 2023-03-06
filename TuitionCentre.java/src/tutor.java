import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;

public class tutor {
    Scanner Input = new Scanner(System.in);
    private
    String _TutorName, _TutorIC, _TutorAddress, _TutorQualification, _YearExp, _DateJoined, _YearsInCentre;



    public String toString_tutors(){
        return get_TutorName() + "\n" + get_TutorIC() + "\n" + get_TutorAddress() + "\n" + get_TutorQualification() + "\n" + get_YearExp() + "\n" + get_DateJoined() + "\n" + get_YearsInCentre();
    }

    //constructor
    public tutor(String tutorname, String tutorIC,
                 String tutorAdd, String tutorQualification,
                 String YearExp, String DateJoined, String YearsInCentre){
        set_TutorName(tutorname);
        set_TutorIC(tutorIC);
        set_TutorAddress(tutorAdd);
        set_TutorQualification(tutorQualification);
        set_YearExp(YearExp);
        set_DateJoined(DateJoined);
        set_YearsInCentre(YearsInCentre);
    }

    //setter
    void set_TutorName(String tutorname){_TutorName = tutorname;}

    void set_TutorIC(String tutorIC){
        _TutorIC = tutorIC;
    }

    void set_TutorAddress(String tutorAddress){
        _TutorAddress = tutorAddress;
    }

    void set_TutorQualification(String tutorQualification){
        _TutorQualification = tutorQualification;
    }

    void set_YearExp(String yearExperience){
        _YearExp = yearExperience;
    }

    void set_DateJoined(String dateJoined){
        _DateJoined = dateJoined;
    }

    void set_YearsInCentre(String Yearsincentre){
        _YearsInCentre = Yearsincentre;
    }


    //getter
    String get_TutorName(){
        System.out.println("Enter tutor's name: ");
        _TutorName = Input.nextLine();
        return _TutorName;
    }

    String get_TutorIC(){
        System.out.println("Enter Tutor's IC: ");
        _TutorIC = Input.nextLine();
        return _TutorIC;
    }

    String get_TutorAddress(){
        System.out.println("Enter tutor address: ");
        _TutorAddress = Input.nextLine();
        return _TutorAddress;
    }

    String get_TutorQualification(){
        System.out.println("Enter tutor qualification: ");
        _TutorQualification = Input.nextLine();
        return _TutorQualification;
    }

    String get_YearExp(){
        System.out.println("Enter year experience: ");
        _YearExp = Input.nextLine();
        return _YearExp;
    }

    String get_DateJoined(){
        System.out.println("Enter date joined: ");
        _DateJoined= Input.nextLine();
        return _DateJoined;
    }

    String get_YearsInCentre(){
        System.out.println("Enter years in centre: ");
        _YearsInCentre = Input.nextLine();
        return _YearsInCentre;
    }
}
