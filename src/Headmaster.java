public class Headmaster {

    protected Name headMastername;
    protected Address headMasterAddress;

    protected String hQualification;


    public void SetName(Name name){
        this.headMastername = name;
    }

    public Name getHeadMastername (){
        return headMastername;
    }


    public void SetAddress(Address address){
        this.headMasterAddress = address;
    }

    public Address getHeadMasterAddress() {
        return headMasterAddress;
    }

    public void SetQualHead(String qual){
        this.hQualification = qual;
    }

    public String gethQualification () {
        return hQualification;
    }
}
