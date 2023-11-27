package egoroff;

import lombok.*;

import java.util.List;
import java.util.stream.Collectors;

@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor

public class Student {
    private String name;
    private List<Double> grades;
    private String specialty;

    public double getAverageGrade() {
        double result = grades.stream()
                .collect(Collectors.averagingDouble(g -> g));
        return result;
    }

}
