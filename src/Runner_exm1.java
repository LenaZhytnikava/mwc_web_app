import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class Runner_exm1 {
    public static void main(String[] args) {
        //Функц. интерфейсы Java 8
        //для работы с коллекциями
        List<String> list1 = Arrays.asList("Java", "C++", "JavaScript", "PHP");

        //Вывод элементов коллекции в консоль
        for (String item : list1) {
            System.out.println(item);
        }
        //Java 8
        //Метод forEach() используется для перебора элементов коллекции
        //и выполенения некторая действия во время этого перебора
        System.out.println("\nJava 8");
        Consumer<String> consumer = language -> System.out.println(language);
        list1.forEach(consumer);

        //Лямбда-выражения допустимо применять как в контексте отдельной
        //локальной переменной(как в примере выше), так и в контексте
        //параметра типа некторого фукнц. интерфейса для любого метода
        list1.forEach(language -> System.out.println(language));
    }
}