package StreamApi.TAsk;

import java.util.ArrayList;
import java.util.List;

public class StudentDataSet {
    public static List<Student> getStudentDetail(){
        List<Student> students = new ArrayList<>();
        students.add(new Student(1,"Manish Pudasaini","Bhadrabas","eziomanish1@gmail.com","98234564"));
        students.add(new Student(2,"Samir Bhandari","Chabhil","samirbhandari@gmail.com","98212464"));
        students.add(new Student(3,"Abhi Kafle","Mitra park","abhikafle@gmail.com","97234589"));
        students.add(new Student(4,"Shashi panta","jorpati","shashipanta@gmail.com","97234664"));
        students.add(new Student(5,"Nelson Katwal","Mulpani","nelsonkatwal@gmail.com","98234764"));

        return students;
    }
}
