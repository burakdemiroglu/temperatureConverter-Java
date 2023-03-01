import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Temperature Converter");
        System.out.print("Enter temperature: ");
        double temp = scanner.nextDouble();

        System.out.print("Is this in (C)elsius or (F)ahrenheit? ");
        String unit = scanner.next();

        if (unit.equalsIgnoreCase("C")) {
            double fahrenheit = (temp * 9/5) + 32;
            System.out.println("Temperature in Fahrenheit: " + fahrenheit + "°F");
        } else if (unit.equalsIgnoreCase("F")) {
            double celsius = (temp - 32) * 5/9;
            System.out.println("Temperature in Celsius: " + celsius + "°C");
        } else {
            System.out.println("Invalid unit entered.");
        }
    }
}
