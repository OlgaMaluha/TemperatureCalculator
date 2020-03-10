import java.util.Scanner;

public class TemperatureCalculator {

    public static void main(String[] args) {
        TemperatureConverter temperatureConverter = new TemperatureConverter();
        String inputChoice;
        Scanner scan = new Scanner(System.in);
        do {
            System.out.println("Input your choice:");
            System.out.println("1 for celsius to fahrenheit");
            System.out.println("2 for fahrenheit to celsius");
            System.out.println("X for exit");
            inputChoice = scan.nextLine();

            if (inputChoice.equals("1")) {
                toFahrenheit(temperatureConverter, scan);
            } else if (inputChoice.equals("2")) {
                toCelsius(temperatureConverter, scan);
            } else if (inputChoice.equals("X")) {
                System.out.println("Exiting");
            } else {
                System.out.println("Wrong choice");
            }
        } while (!inputChoice.equals("X"));
    }

    private static void toCelsius(TemperatureConverter temperatureConverter, Scanner scan) {
        System.out.println("Write Fahrenheit degree you would like to convert to Celsius");
        String scannedValue1 = scan.nextLine();
        try {
            Double parsedValueF = Double.parseDouble(scannedValue1);
            System.out.format("Your result is: %.2f C\n", temperatureConverter.fahrenheitToCelsius(parsedValueF));
        } catch (NumberFormatException e) {
            System.out.println("Invalid format of temperature");
        }
    }

    private static void toFahrenheit(TemperatureConverter temperatureConverter, Scanner scan) {
        System.out.println("Please write Celsius degree you would like to convert into Fahrenheit");
        String scannedValue = scan.nextLine();
        try {
            Double parsedValue = Double.parseDouble(scannedValue);

            System.out.format("Your result is: %.2f F\n", temperatureConverter.celsiusToFahrenheit(parsedValue));
        } catch (NumberFormatException e) {
            System.out.println("Invalid format of temperature");
        }
    }
}

