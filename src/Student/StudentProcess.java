package Student;

import java.util.*;
import java.util.function.Consumer;
import java.util.function.BiConsumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Stream;
import java.util.stream.Collectors;

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

        // task 2 -- not sure
        System.out.println("------------------- Task 2 -------------------");
        Stream<Student> list2 = list
                .stream()
                .filter(stu -> stu.getGrade() > 50 && stu.getGrade() < 100)
                .sorted(Comparator.comparing(Student::getGrade));
        list2.forEach(System.out::println);

        // task 3 -- not finished
        System.out.println("------------------- Task 3 -------------------");
        Stream<Student> list3 = list
                .stream()
                .filter(stu -> stu.getGrade() > 50 && stu.getGrade() < 100)
                ;
        list3.forEach(System.out::println);

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

    }
}
