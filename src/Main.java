import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
      

        float total =0;
        float average;

        // Create a new TuitionCenter object
        TuitionCenter tc = new TuitionCenter("UTP");


        // Create a new StudentBatch class to use method Find Student
        StudentBatch class1 = new StudentBatch();


        // Create headmaster
        Headmaster ahmad = new Headmaster();
        Name headMastername = new Name("Ahmad" , "Faizal" , "Rashid");
        ahmad.SetName(headMastername);
        Address headMasterAdd = new Address("Jalan D" , "8900" , "Perak Tgh" , "Perak", "Malaysia");
        ahmad.SetAddress(headMasterAdd);
        ahmad.SetQualHead("PhD Medicine");
        tc.addHeadmaster(ahmad);

        // Create some tutors
        // Tutor Abu
        Tutor abu = new Tutor();
        //abu.SetClassSize(4);
        Name tutorname = new Name("Abu", "Ali", "Siddiq");
        abu.SetNameTutor(tutorname);
        abu.SetIC("1216719");
        Address teacherAddress = new Address("Jalan A", "2345", "Besut", "Terengganu", "Malaysia");
        abu.SetAddressTutor(teacherAddress);
        abu.SetExp(3);
        abu.SetQual("Master Degree");
        tc.addTutor(abu);

        Tutor aji = new Tutor();
        Name tutorname2 = new Name("Aji", "Mhd", "Kin");
        aji.SetNameTutor(tutorname2);
        aji.SetIC("2019830");
        Address teacherAddress2 = new Address("Jalan B", "2467", "KK", "Perlis", "Malaysia");
        aji.SetAddressTutor(teacherAddress2);
        aji.SetExp(4);
        aji.SetQual("PhD");
        tc.addTutor(aji);

        Tutor sarah = new Tutor();
        Name tutorname3 = new Name("Sarah", "Lynn", "Mir");
        sarah.SetNameTutor(tutorname3);
        sarah.SetIC("898907");
        Address teacherAddress3 = new Address("Jalan C", "5432", "Penampang", "Sabah", "Malaysia");
        sarah.SetAddressTutor(teacherAddress3);
        sarah.SetExp(6);
        sarah.SetQual("PhD and Master Degree");
        tc.addTutor(sarah);

        // Create some students
        Student zahin = new Student();
        Name studentName = new Name("Zahin", "Syukran", "Sukeri");
        zahin.SetName(studentName);
        zahin.SetSchool("SMKTM");
        zahin.SetIC("3405896");
        Address studentAddress = new Address("Jalan 123", "2345", "jerteh", "Terengganu", "Malaysia");
        tc.addStudent(zahin);
        class1.addStudent(zahin);

        Student wahyu = new Student();
        Name studentName2 = new Name("Seni", "Wahyuputri", "Hussain");
        wahyu.SetName(studentName2);
        wahyu.SetSchool("SMKP");
        wahyu.SetIC("121200");
        Address studentAddress2 = new Address("Jalan 124", "88", "KK", "sabah", "Malaysia");
        tc.addStudent(wahyu);
        class1.addStudent(wahyu);


        Student qama = new Student();
        Name studentName3 = new Name("Noor", "Qamarina", "Mhd");
        qama.SetName(studentName3);
        qama.SetSchool("MRSM");
        qama.SetIC("1512300");
        Address studentAddress3 = new Address("Jalan 125", "99", "Kajang", "Selangor", "Malaysia");
        tc.addStudent(qama);
        class1.addStudent(qama);

        //insert mark student
        for(int i = 0; i <3 ;i++){
            System.out.println("Enter Marks #" + (i+1) +" for student 1" + ": ");
            float mark = input.nextFloat();
            while(mark < 0 || mark > 100){

                System.out.println("Error!!");
                System.out.println("Enter Marks #" + (i+1) + ": ");

                if(input.hasNextFloat()){
                    mark = input.nextFloat();
                }
                else
                    input.next();
            }

            zahin.SetMark(mark, i);

        }

        zahin.displayMarks();
        total+= zahin.calcTotalMark();
        average = zahin.calcAvg();

        System.out.println("Max: " + zahin.calcMax());
        System.out.println("Min: " + zahin.calcMin());

        for(int i = 0; i <3 ;i++){
            System.out.println("Enter Marks #" + (i+1) + " for student 2" + ": ");
            float mark = input.nextFloat();
            while(mark < 0 || mark > 100){

                System.out.println("Error!!");
                System.out.println("Enter Marks #" + (i+1) + ": ");

                if(input.hasNextFloat()){
                    mark = input.nextFloat();
                }
                else
                    input.next();
            }

            wahyu.SetMark(mark, i);

        }

        wahyu.displayMarks();
        total+= wahyu.calcTotalMark();
        average = wahyu.calcAvg();

        System.out.println("Max: " + wahyu.calcMax());
        System.out.println("Min: " + wahyu.calcMin());


        for(int i = 0; i <3 ;i++){
            System.out.println("Enter Marks #" + (i+1) + " for student 3" + ": ");
            float mark = input.nextFloat();
            while(mark < 0 || mark > 100){

                System.out.println("Error!!");
                System.out.println("Enter Marks #" + (i+1) + ": ");

                if(input.hasNextFloat()){
                    mark = input.nextFloat();
                }
                else
                    input.next();
            }

            qama.SetMark(mark, i);

        }

        qama.displayMarks();
        total+= qama.calcTotalMark();
        average = qama.calcAvg();

        System.out.println("Max: " + qama.calcMax());
        System.out.println("Min: " + qama.calcMin());


        System.out.println("-----------------------------------------");
        System.out.println();
        tc.displayReport();

        System.out.println("STUDENT IN BATCH");
        class1.FindStudent("Seni" , "Wahyuputri" , "Hussain");
    }

    // Display report

}
