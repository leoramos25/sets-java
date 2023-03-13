package application;

import entities.Product;
import services.CalculationService;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        final String FILE_PATH = "/home/leonardords/temp/in.csv";

        final List<Product> products = new ArrayList<>();

        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(FILE_PATH))) {
            String line = bufferedReader.readLine();

            while (line != null) {
                String[] fields = line.split(",");
                products.add(new Product(fields[0], Double.parseDouble(fields[1])));
                line = bufferedReader.readLine();
            }

            System.out.printf("Most expensive: %s", CalculationService.max(products));
        } catch (IOException exception) {
            System.out.println(exception.getMessage());
        }
    }
}
