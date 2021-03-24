package Student;

public class Student {
    private String firstName;
    private String lastName;
    private double grade;
    private String department;

    Student(String fName, String lName, double nGrade, String nDepartment) {
        firstName = fName;
        lastName = lName;
        grade = nGrade;
        department = nDepartment;
    }

    void setFirstName(String fName) {
        firstName = fName;
    }

    void setLastNameName(String lName) {
        lastName = lName;
    }

    void setGrade(double nGrade) {
        grade = nGrade;
    }

    void setDepartment(String nDepartment) {
        department = nDepartment;
    }

    String getFirstName() {
        return firstName;
    }

    String getLastName() {
        return lastName;
    }

    double getGrade() {
        return grade;
    }

    String getDepartment() {
        return department;
    }
}
