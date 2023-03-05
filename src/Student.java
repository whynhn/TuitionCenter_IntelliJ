// created by team in KL
public class Student {
    // data/attributes

    Name StdName;
    private Address StudentAddress;
    private String ic;
    private String schoolname;
    private float marks[] = new float[3];
    private float TotalMark = 0;
    private float max = -999;
    private float min = 999;
    private float average;


    // methods or operations
    void SetName(Name name){
        StdName = name;
    }

    Name getStdName () {
        return StdName;
    }

    void SetAddress(Address address){
        StudentAddress = address;
    }

    Address getStudentAddress () {
        return StudentAddress;
    }

    void SetIC(String IC){
        ic= IC;
    }

    String GetIC(){
        return ic;
    }
    void SetSchool(String school){
        schoolname = school;
    }

    String getSchool(){
        return schoolname;
    }



    void displayMarks(){

        System.out.println("Student: " + StdName.GetFName());
        System.out.println("");
        for(int i = 0; i < marks.length; i++){

            System.out.println("Subject #" + (i+1)+ " :" + marks[i]);
        }
        System.out.println("------------------------------------");
    }

    void SetMark(float mark, int i){
        marks[i] = mark;
    }

    float calcTotalMark(){
        for(int i  = 0; i < marks.length; i++){
            TotalMark += marks[i];
        }
        System.out.println("Total Mark For "+ marks.length + " Subjects = "+ TotalMark);
        return TotalMark;
    }

    float calcMax(){
        for(int i  = 0; i < marks.length; i++){
            if(max < marks[i]){
                max = marks[i];
            }
        }
        return max;
    }

    float calcMin(){
        for(int i  = 0; i < marks.length; i++){
            if(min > marks[i]){
                min = marks[i];
            }
        }
        return min;
    }

    float calcAvg(){
        average = TotalMark / marks.length;

        System.out.println("The Average Mark is " + average);
        return average;
    }



}
