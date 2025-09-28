package complex_tasks.task_3;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class GradeServiceTest {

    /*    Test cases:
            negative:
                - grade is -1.0 --> InvalidGradeException
                - grade is 0  --> InvalidGradeException
                - grade is null  --> InvalidGradeException
            positive:
                - grade is 0.5 --> grade is added
                - TODO: grade is 1 --> grade is added
                - add 2 grades --> average is calculated
                - TODO: add 2 grades in 2 threads -> average is calculated
     */

    @Test
    void userCannotAddNegativeDoubleGrade() {
        GradeService<Double> service = new GradeService();
        StudentGrade grade = new StudentGrade("Ivan", "Math", -1.0);

        assertThrows(InvalidGradeException.class, () -> {
            service.addGrade(grade);
        }, "Grade cannot be negative double");
    }

    @Test
    void userCannotAddZeroGrade() {
        GradeService<Integer> service = new GradeService();
        StudentGrade grade = new StudentGrade("John", "Grammar", 0);

        assertThrows(InvalidGradeException.class, () -> {
            service.addGrade(grade);
        }, "Grade cannot be 0");
    }

    @Test
    void userCannotAddNullGrade() {
        GradeService<Integer> service = new GradeService();
        StudentGrade grade = new StudentGrade("Mark", "History", null);

        assertThrows(NullPointerException.class, () -> {
            service.addGrade(grade);
        }, "Grade is null");
    }

    @Test
    void userCanAddPositiveDoubleGrade() throws InvalidGradeException {
        GradeService<Double> service = new GradeService();
        StudentGrade grade = new StudentGrade("Greg", "Drawing", 0.5);

        service.addGrade(grade);
    }

    @Test
    void userCanCalculateAverageOfGrades() throws InvalidGradeException {
        GradeService<Double> service = new GradeService();
        StudentGrade grade1 = new StudentGrade("Mark", "Drawing", 1);
        StudentGrade grade2 = new StudentGrade("Greg", "Drawing", 2);
        StudentGrade grade3 = new StudentGrade("Greg", "Hostory", 1);
        double expectedResult = 1.5;
        service.addGrade(grade1);
        service.addGrade(grade2);

        double actualresult = service.calculateAverageGradeBySubject("Drawing");

        assertEquals(expectedResult, actualresult, "Expected result was: " + expectedResult
                + ", but actual result is: " + actualresult);
    }
}
