package application;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(5, 2, 10);
        printList(numbers);

        List<String> names = Arrays.asList("Maria", "Alex", "Bob");
        printList(names);
    }

    public static void printList(List<?> anythingList) {
        System.out.println(anythingList);
    }
}
