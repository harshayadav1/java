package comparators;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Mainclass {
    public static void main(String[] args) {
        List<Student> student = new ArrayList<>();
        student.add(new Student(12, "harsha"));
        student.add(new Student(13, "santosh"));
        student.add(new Student(14, "shashi"));
        student.add(new Student(12, "akash"));
        // Collections.sort(student, new Comparator<Student>(){

        //     @Override
        //     public int compare(Student o1, Student o2) {
        //         if(o1.name.equals(o2.name)){
        //             return o1.marks-o2.marks;
        //         }
        //         else{
        //             return o1.name.compareTo(o2.name);
        //         }
                
        //     }
            
        // });
        Collections.sort(student,Comparator.comparing(Student:: getName).thenComparing(Student:: getMarks).reversed());

        student.forEach(System.out::println);
        
        
    }
    
}
