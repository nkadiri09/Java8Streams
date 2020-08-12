import com.sun.tools.javac.util.List;

import java.util.stream.Collectors;

public class SimpleApp {

    public static void main(String[] args) {

        List<String> names =
                List.of("Narendra","Reddy","Kadiri","Rameshwara", "Mahendra", "Ravindra" );
        names.stream().forEach(element -> System.out.println(element));
        System.out.println("----------------------------------------------------");
        //names.stream().filter(elements->elements.endsWith("ra")).forEach(System.out::println);
        // List<String> raNames = (List<String>) names.stream().
        // filter(element->element.endsWith("ra")).collect(Collectors.toList());

        List<Integer> ints = List.of(1,3,5,7,9,10,4,25);
        int sum = ints.stream().reduce(10, (num1, num2)->num1+num2);
        System.out.println(sum);
    }
}
