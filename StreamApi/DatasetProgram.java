package StreamApi;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class DatasetProgram {
    public static void main(String[] args) {
        List<String> namelist = DataSet.getStudentNameList();
        System.out.println("Number of  student = "+namelist.size());

        namelist.stream().forEach(name -> System.out.println(name));

        List<String> nameStartWithM = namelist.stream().
                filter(naam -> naam.startsWith("M"))  //itermidiate part of stream
                .collect(Collectors.toList());  //used to collect data in list
        System.out.println("Name start with M : "+nameStartWithM);


    }
}
