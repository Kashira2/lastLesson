package egoroff;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        List grades1 = List.of(4.0,5.0,6.0,3.0);
        List grades2 = List.of(3.0,5.0,1.0,5.0);
        List grades3 = List.of(4.0,3.0,3.0,3.0);
        List grades4 = List.of(5.0,5.0,1.0,3.0);
        Student student1 = new Student("Никита", grades1 ,"Информатика");
        Student student2 = new Student("Максим", grades2 ,"Информатика");
        Student student3 = new Student("Владислав", grades3 ,"Информатика");
        Student student4 = new Student("Константин", grades4 ,"Информатика");
        student3.getAverageGrade();
    }
}