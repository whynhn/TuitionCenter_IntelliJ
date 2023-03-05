public class TuitionCenter extends Tutor {
    private String name;

    private Headmaster[] headmasters = new Headmaster[1];
    private Student[] students = new Student[3];
    private Tutor[] tutors = new Tutor[3];

    public TuitionCenter(String name) {
        this.name = name;
    }

    public void addStudent(Student student) {
        // Add student to student list
        for (int i = 0; i < students.length; i++) {
            if (students[i] == null) {
                students[i] = student;
                break;
            }
        }
    }

    public void addTutor(Tutor tutor) {
        // Add tutor to tutor list
        for (int i = 0; i < tutors.length; i++) {
            if (tutors[i] == null) {
                tutors[i] = tutor;
                break;
            }
        }
    }

    public void addHeadmaster(Headmaster headmaster) {
        // Add tutor to tutor list
        for (int i = 0; i < headmasters.length; i++) {
            if (headmasters[i] == null) {
                headmasters[i] = headmaster;
                break;
            }
        }
    }




    public void displayReport() {
        System.out.println("Report for " + name);
        System.out.println("Number of students: " + students.length);
        System.out.println("Number of tutors: " + tutors.length);

        for (int i = 0; i < headmasters.length; i++) {
            if (tutors[i] != null) {
                System.out.println("Headmaster " + (i + 1) + ":");
                System.out.println("Name: " + headmasters[i].headMastername.GetFName() + " " + headmasters[i].headMastername.GetLName());
                System.out.println("Address: " + headmasters[i].headMasterAddress.getStreet()+ " " +headmasters[i].headMasterAddress.getPostcode()+ " "+headmasters[i].headMasterAddress.getDistrict());
                System.out.println("Qualification: " + headmasters[i].hQualification);
                System.out.println();
            }

        }

        for (int i = 0; i < students.length; i++) {
            if (students[i] != null) {
                System.out.println("Student " + (i + 1) + ":");
                System.out.println("Name: " + students[i].StdName.GetFName() + " " + students[i].StdName.GetLName());
                System.out.println("Average marks: " + students[i].calcAvg());
                System.out.println("Minimum marks: " + students[i].calcMin());
                System.out.println("Maximum marks: " + students[i].calcMax());
                System.out.println();
            }
        }

        for (int i = 0; i < tutors.length; i++) {
            if (tutors[i] != null) {
                System.out.println("Tutor " + (i + 1) + ":");
                System.out.println("Name: " + tutors[i].tutorName.GetFName() + " " + tutors[i].tutorName.GetLName());
                System.out.println("IC: " + tutors[i].tutorIc);
                System.out.println("Address: " + tutors[i].tutorAddress.getStreet()+ " " +tutors[i].tutorAddress.getPostcode()+ " "+tutors[i].tutorAddress.getDistrict());
                System.out.println("Experience: " + tutors[i].numyearexp + " years");
                System.out.println("Qualification: " + tutors[i].qualification);
                System.out.println();
            }

        }


    }
}