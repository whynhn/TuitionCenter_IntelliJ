public class TutorList {
    private Tutor AllTutor[] = new Tutor[3];

    void AddTutor(Tutor t){
        for(int i =0; i < 1; i++){
            AllTutor[i] = t;
            System.out.println("Teacher: " + AllTutor[i].tutorName.GetFName()+" "+AllTutor[i].tutorName.GetMName()+" " +AllTutor[i].tutorName.GetLName());
        }
    }

}
