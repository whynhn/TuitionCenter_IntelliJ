public class Tutor {
    Name tutorName;
    String tutorIc;
    Address tutorAddress;
    int numyearexp;
    String qualification;
     int ClassSize = 4;


    public int getClassSize(){
        return ClassSize;
    }


    void SetNameTutor(Name name){
        tutorName = name;
    }

    void SetAddressTutor(Address address){
        tutorAddress = address;
    }

    void SetExp(int exp){
        numyearexp = exp;
    }

    void SetQual(String qual){
        qualification =qual;
    }

    void SetIC(String Ic){
        tutorIc = Ic;
    }

}
