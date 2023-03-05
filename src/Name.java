public class Name {
    private String fname;
    private String lname;
    private String mname;

        // below count as Set
    public Name(String fname, String mname, String lname){

        this.fname = fname;
        this.mname = mname;
        this.lname = lname;

    }


    public String GetFName(){
        return fname;  // this - refers to class attributes
    }

    public String GetMName(){

        return mname;
    }

    public String GetLName(){

        return lname;

    }
}
