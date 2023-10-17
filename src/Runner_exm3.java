import org.w3c.dom.ls.LSOutput;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Runner_exm3 {
    public static void main(String[] args) {
        List<String> list1 = Arrays.asList("Java", "C#", "JavaScript", "PHP");
        //Использование интерфейса Stream в Java 8
        Stream<String> stream1 = list1.stream();
        stream1.forEach(item -> System.out.println(item));

        //Объект stream может быть использован единожны
        //для совершения новых действиях над объектами коллекции
        //через стримы, нужно будет создать новый объект stream
        System.out.println("\n");
        Stream<String> stream2 = list1.stream();
        stream2.forEach(item -> System.out.println(item));

        //Поскольку неудобно всегда создавать новую переменную для
        //работы со стримами, то применяют способ столбчатой записи вызова методов
        //Для столбчатой записи вызова методов, нужно понимать
        //какой из методов является терминальным, а какой - нетерминальным
        //Если метод возвращает новый Stream как результат свокй работы,
        //то данным являет нетерминальной операцией
        //Если метод возвращает результат своей работы отличный от Stream
        //то данный метод является терминальной операцией
        list1.stream()
             .forEach(item -> System.out.println(item));

        //Т.к. метод .sorted() является нетерминальной операцией, то
        //можно продолжать вызывать методы в столбч. записи
        //Любой терминыльный метод завершает столбч. запись вызова методов
        System.out.println("\nSorted stream");
        list1.stream()
             .sorted((item1, item2) -> item2.length() - item1.length())
             .forEach(item -> System.out.println(item));

        System.out.println("\nOriginal collection");
        list1.forEach(item -> System.out.println(item));
    }
}
