package egoroff;

import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {

        Student s1 = new Student("Света", randomGrades(), "Информатика");
        Student s2 = new Student("Андрей", randomGrades(), "Информатика");
        Student s3 = new Student("Лиза", randomGrades(), "Информатика");
        Student s4 = new Student("Настя", randomGrades(), "Информатика");
        Student s5 = new Student("Вера", randomGrades(), "Математика");
        Student s6 = new Student("Никита", randomGrades(), "Информатика");
        Student s7 = new Student("Стас", randomGrades(), "Информатика");
        Student s8 = new Student("Гена", randomGrades(), "Информатика");
        Student s9 = new Student("Дима", randomGrades(), "Русский");
        Student s10 = new Student("Костя", randomGrades(), "Информатика");
        Student s11 = new Student("Антон", randomGrades(), "Информатика");
        Student s12 = new Student("Сережа", randomGrades(), "Информатика");

        List<Student> students = new ArrayList<>();
        students.add(s1);
        students.add(s4);
        students.add(s3);
        students.add(s4);
        students.add(s5);
        students.add(s6);
        students.add(s7);
        students.add(s8);
        students.add(s9);
        students.add(s10);
        students.add(s11);
        students.add(s12);

        System.out.println(students);

        getAverage(students).stream()
                .forEach(s -> System.out.println(s.getName() + ":" + s.getAverageGrade()));
    }

    public static List<Student> getAverage(List<Student> st) {
        List<Student> result = st.stream()
                .filter(s -> s.getSpecialty().equals("Информатика"))
                .filter(s -> s.getAverageGrade() > 4.5)
                .limit(5)
                .sorted((a, b) -> Double.compare(b.getAverageGrade(), a.getAverageGrade()))
                .collect(Collectors.toList());
        return result;
    }

    public static List<Double> randomGrades(){
        List<Double> grades = List.of(0.0, 0.0, 0.0, 0.0, 0.0);
        List<Double> result = grades.stream()
                .map(g-> Math.ceil((g + new Random().nextDouble() * 10d)* Math.pow(10, 1)) / Math.pow(10, 1))
                .collect(Collectors.toList());
        return result;
    }
}