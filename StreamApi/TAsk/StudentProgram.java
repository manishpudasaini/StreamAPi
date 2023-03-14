package StreamApi.TAsk;

import java.util.List;
import java.util.stream.Collectors;

public class StudentProgram {
    public static void main(String[] args) {
        List<Student> studentList = StudentDataSet.getStudentDetail();
        List<Student> filterPhoneNumberStartwith98 = studentList.stream().filter(num -> num.getMobileNumber().startsWith("98")).collect(Collectors.toList());
        List<Student> filterPhoneNumberStartwith97 = studentList.stream().filter(num -> num.getMobileNumber().startsWith("97")).collect(Collectors.toList());
        System.out.println("Student phone number start with 97 = "+filterPhoneNumberStartwith97);
        System.out.println("Student phone number start with 98 = "+filterPhoneNumberStartwith98);
    }
}
