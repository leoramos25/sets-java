package application;

import services.PrintService;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        PrintService<String> service = new PrintService<>();

        System.out.print("How many values? ");
        int values = scanner.nextInt();

        for (int i = 0; i < values; i++) {
            String value = scanner.next();
            service.addValue(value);
        }

        service.print();
        String fistElement = service.first();
        System.out.printf("First element: %s", fistElement);

        scanner.close();
    }
}
