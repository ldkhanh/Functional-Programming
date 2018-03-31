import java.util.Arrays;
import java.util.List;

public class FilterExample {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Peter", "Sam", "Khanh", "Vy");

        names.stream().filter(FilterExample::isNotSam).forEach(System.out::println);
    }

    private static boolean isNotSam(String name) {
        return !name.equals("Sam");
    }
}
