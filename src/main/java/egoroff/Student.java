package egoroff;

import lombok.*;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Student {
    private String name;
    private List<Double> grades;
    private String specialty;

    public double getAverageGrade() {
        double result = grades.stream()
                .mapToDouble(Double::doubleValue).sum();
        return result / getGrades().size();
    }


}
