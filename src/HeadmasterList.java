public class HeadmasterList extends Headmaster {

    protected Headmaster allHeadmaster[] = new Headmaster[1];

    void AddHeadmaster(Headmaster h){
        for(int i =0; i < 1; i++){
            allHeadmaster[i] = h;
            System.out.println("Headmaster: " + allHeadmaster[i].headMastername.GetFName()+" "+allHeadmaster[i].headMastername.GetMName()+" " +allHeadmaster[i].headMastername.GetLName());
        }
    }



}