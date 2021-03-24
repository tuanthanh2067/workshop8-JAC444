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

    public void setFirstName(String fName) {
        firstName = fName;
    }

    public void setLastNameName(String lName) {
        lastName = lName;
    }

    public void setGrade(double nGrade) {
        grade = nGrade;
    }

    public void setDepartment(String nDepartment) {
        department = nDepartment;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public double getGrade() {
        return grade;
    }

    public String getDepartment() {
        return department;
    }

    public String getName() {
        return firstName + " " + lastName;
    }

    @Override
    public String toString() {
        return getName() + " grade: " + grade + " in department: " + department;
    }

    @Override
    public boolean equals(Object another) {
        if (another == this) return true;
        if (!(another instanceof Student)) return false;
        Student stu = (Student) another;
        return firstName.equals(stu.getFirstName()) &&
                lastName.equals(stu.getLastName()) &&
                department.equals(stu.getDepartment()) &&
                (grade == stu.getGrade());

    }


}
