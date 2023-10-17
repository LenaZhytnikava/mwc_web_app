import by.itclass.Student;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.function.Supplier;

public class Runner_exm7 {
    public static void main(String[] args) {
        List<Student> students = Arrays.asList(
//                new Student(1, "Alex"),
//                new Student(4, "Kate"),
//                new Student(8, "Bob"),
//                new Student(2, "Masha")
        );

        //Метод возваращает первый найденный элемент стрима
        Student student = students.stream()
                                  .findAny()
                                  .orElse(new Student(0, null));

        System.out.println(student);

        student = students.stream()
                .findAny()
                .or(() -> Optional.of(new Student()))
                .get();

        System.out.println(student);
    }
}
