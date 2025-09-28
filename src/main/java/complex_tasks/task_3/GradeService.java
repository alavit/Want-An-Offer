package complex_tasks.task_3;

import java.util.LinkedList;
import java.util.List;

public class GradeService<T extends Number> {
    private final List<StudentGrade<T>> grades = new LinkedList<>();

    public synchronized void addGrade(StudentGrade<T> grade) throws InvalidGradeException {
        if (grade.getGrade() == null) {
            throw new NullPointerException("Grade is null");
        }

        if (grade.getGrade().doubleValue() > 0.0) {
            grades.add(grade);
        }
        else {
           throw new InvalidGradeException("Invalid grade!");
        }
    }

    public double calculateAverageGradeBySubject(String subject) {
        return grades.stream().filter(g -> g.getSubject().equals(subject))
                .map(StudentGrade::getGrade)
                .mapToInt(Number::intValue)
                .average()
                .orElse(Double.NaN);
    }
}
