public class tutor {
    private:
    String _TutorName, _TutorIC, _TutorAddress, _TutorQualification, _YearExp, _DateJoined, _YearsInCentre;
    void TutorName(String tutorname){
        _TutorName = tutorname;
    }

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
        _DateJoined = DateJoined;
    }

    void set_YearsInCentre(String Yearsincentre){
        _YearsInCentre = Yearsincentre;
    }

    String get_TutorName(){
        return _TutorName;
    }

    String get_TutorIC(){
        return _TutorIC;
    }

    String get_TutorAddress(){
        return _TutorAddress;
    }

    String get_TutorQualification(){
        return _TutorQualification;
    }

    String get_YearExp(){
        return _YearExp;
    }

    String get_DateJoined(){
        return _DateJoined;
    }

    String get_YearsInCentre(){
        return _YearsInCentre;
    }
}
