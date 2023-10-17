import by.itclass.Student;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.function.Predicate;

public class Runner_exm6 {
    public static void main(String[] args) {
        List<Student> students = Arrays.asList(
                new Student(1, "Alex"),
                new Student(4, "Kate"),
                new Student(8, "Bob"),
                new Student(2, "Masha")
        );

        //Вывести в алфавитном порядке имена студентов
        //для которвых id кратно 2
        List<String> nameList = new ArrayList<>();
        for (Student student : students) {
            if (student.getId() % 2 == 0) {
                String name = student.getName();
                nameList.add(name);
            }
        }

        nameList.sort(Comparator.naturalOrder());
        for (String name : nameList) {
            System.out.println(name);
        }

        //Java 8
        System.out.println();
        students.stream()
                .filter(stud -> stud.getId() % 2 != 0)
                .map(stud -> stud.getName())
                .sorted()
                .forEach(name -> System.out.println(name));
    }
}
