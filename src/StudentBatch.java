
public class StudentBatch{
    // data section

    private Tutor classSizes = new Tutor();
    private int studentSize = classSizes.getClassSize();
    private Student AllStudent[] = new Student[studentSize];
    private int currsz = 0;

    public void addStudent(Student std){
        if(currsz < studentSize){
            AllStudent[currsz] = std;

            System.out.println("Student: " + AllStudent[currsz].StdName.GetFName());
            System.out.println("IC: " + AllStudent[currsz].GetIC());
            System.out.println("School: " + AllStudent[currsz].getSchool());
            currsz++;
        }
        else{
            System.out.println("No more Students can be added!!");
        }
    }

    public boolean FindStudent(String fname, String mname, String lname){
        boolean isIn = false;
        for(int a = 0; a<currsz; a++){
            if(AllStudent[a].StdName.GetFName().equals(fname) && AllStudent[a].StdName.GetMName().equals(mname) && AllStudent[a].StdName.GetLName().equals(lname)){
                isIn = true;
                break;
            }
            else{
                isIn = false;
            }
        }
        if (isIn){
            System.out.println("Student " + fname + " Found");
        }
        else{
            System.out.println("Student " + fname + " Not Found");
        }
        return isIn;
    }
}