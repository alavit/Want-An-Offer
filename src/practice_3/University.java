package practice_3;

public class University {
    static String universityName;
    final int studentID;
    String studentName;

    static {
        universityName = "MIT";
    }

    public University(int studentID, String studentName) {
        this.studentID = studentID;
        this.studentName = studentName;
    }

    static void changeUniversityName(String newUniversityName) {
        universityName = newUniversityName;
    }

    String getStudentName() {
        return this.studentName;
    }

    void printStudentInfo() {
        System.out.println("Student name: " + this.studentName + ", Stident ID: " + this.studentID + ", University: " + universityName);
    }
}
