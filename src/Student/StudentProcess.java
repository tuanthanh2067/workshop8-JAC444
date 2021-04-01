package Student;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StudentProcess {

    public static void main(String[] args) {
        Student[] students = {
                new Student("Jack", "Smith", 50.0, "IT"),
                new Student("Aaron", "Johnson", 76.0, "IT"),
                new Student("Maaria", "White", 35.8, "Business"),
                new Student("John", "White", 47.0, "Media"),
                new Student("Laney", "White", 62.0, "IT"),
                new Student("Jack", "Jones", 32.9, "Business"),
                new Student("Wesley", "Jones", 42.89, "Media")};

        // task 1
        System.out.println("------------------- Task 1 -------------------");
        List<Student> list = Arrays.asList(students);
        list.forEach(System.out::println);

        // task 2
        System.out.println("------------------- Task 2 -------------------");
        Stream<Student> list2 = list
                .stream()
                .filter(stu -> stu.getGrade() > 50 && stu.getGrade() < 100)
                .sorted(Comparator.comparing(Student::getGrade));
        list2.forEach(System.out::println);

        // task 3
        System.out.println("------------------- Task 3 -------------------");
        Optional<Student> list3 = list
                .stream()
                .filter(stu -> stu.getGrade() > 50 && stu.getGrade() < 100)
                .findFirst()
                ;
        System.out.println(list3);

        // task 4
        System.out.println("------------------- Task 4a -------------------");
        Stream<Student> list4a = list
                .stream()
                .sorted(Comparator.comparing(Student::getLastName))
                .sorted(Comparator.comparing(Student::getFirstName));
        list4a.forEach(System.out::println);

        System.out.println("------------------- Task 4b -------------------");
        Stream<Student> list4b = list
                .stream()
                .sorted(Comparator.comparing(Student::getLastName, Comparator.reverseOrder()))
                .sorted(Comparator.comparing(Student::getFirstName, Comparator.reverseOrder()))
                ;
        list4b.forEach(System.out::println);

        // task 5
        System.out.println("------------------- Task 5 -------------------");
        Stream<String> list5 = list
                .stream()
                .sorted(Comparator.comparing(Student::getLastName))
                .map(Student::getLastName)
                .distinct()
                ;
        list5.forEach(System.out::println);

        // task 6
        System.out.println("------------------- Task 6 -------------------");
        Stream<String> list6 = list
                .stream()
                .sorted(Comparator.comparing(Student::getLastName))
                .sorted(Comparator.comparing(Student::getFirstName))
                .map(Student::getName)
                ;
        list6.forEach(System.out::println);

        // task 7
        System.out.println("------------------- Task 7 -------------------");
        Map<String, List<Student>> list7 = list
                .stream()
                .collect(Collectors.groupingBy(Student::getDepartment))
                ;
        list7.forEach((department, returnedStudents) -> {
            System.out.println(department);
            returnedStudents.forEach(System.out::println);
        });

        // task 8
        System.out.println("------------------- Task 8 -------------------");
        Map<String, Long> list8 = list
                .stream()
                .collect(Collectors.groupingBy(Student::getDepartment, Collectors.counting()))
                ;
        list8.forEach((department, count) -> {
            System.out.println(department + " has " + count + " Student(s)");
        });
        // task 9
        System.out.println("------------------- Task 9 -------------------");
       double list9 = list
               .stream()
               .mapToDouble(stu -> stu.getGrade())
               .sum();
       System.out.println("Sum of Student's grades: " + list9);

        // task 10
        System.out.println("------------------- Task 10 -------------------");
        OptionalDouble list10 = list
                .stream()
                .mapToDouble(stu -> stu.getGrade())
                .average();

        System.out.println("Average of Students' grades: " + list10.getAsDouble());
    }
}
