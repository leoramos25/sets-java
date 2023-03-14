package application;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> integers = Arrays.asList(1, 2, 3, 4);
        List<Double> doubles = Arrays.asList(3.14, 6.28);
        List<Object> objects = new ArrayList<>();

        copy(integers, objects);
        copy(doubles, objects);
        printList(objects);
    }

    public static void copy(List<? extends Number> sourceList, List<? super Object> targetList) {
        targetList.addAll(sourceList);
    }

    public static void printList(List<?> list) {
        System.out.println(list);
    }
}
