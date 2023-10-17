import java.util.Arrays;
import java.util.List;
import java.util.function.ToIntFunction;

public class Runner_exm4 {
    public static void main(String[] args) {
        List<String> list1 = Arrays.asList("Java", "C#", "JavaScript", "PHP");

        //Среди всех элементов коллекции, вывести
        //максимальное количество символов в элементе
        int maxLength = 0;
        for (String item : list1) {
            if (item.length() > maxLength) {
                maxLength = item.length();
            }
        }
        System.out.println("max length=" + maxLength);

        //Java 8
        maxLength = list1.stream()
                         .mapToInt(str -> str.length())
                         .max()
                         .getAsInt();

        System.out.println("\nmax length=" + maxLength);
    }
}
