package services;

import java.util.ArrayList;
import java.util.List;

public class PrintService<T> {
    List<T> values = new ArrayList<>();

    public void addValue(T value) {
        values.add(value);
    }

    public T first() {
        if (values.isEmpty()) {
            throw new IllegalStateException("List is empty");
        }
        return values.get(0);
    }

    public void print() {
        System.out.println(values);
    }
}
