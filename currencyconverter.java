import java.util.Scanner;

public class currencyconverter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Hardcoded exchange rates (these rates can be dynamic if fetched from an API)
        double usdToEurRate = 0.85;
        double eurToUsdRate = 1.18;
        double usdToGbpRate = 0.75;
        double gbpToUsdRate = 1.33;
        double eurToGbpRate = 0.88;
        double gbpToEurRate = 1.14;

        System.out.println("Currency Converter");
        System.out.println("1: USD to EUR");
        System.out.println("2: EUR to USD");
        System.out.println("3: USD to GBP");
        System.out.println("4: GBP to USD");
        System.out.println("5: EUR to GBP");
        System.out.println("6: GBP to EUR");

        System.out.print("Select conversion type (1-6): ");
        int choice = scanner.nextInt();

        System.out.print("Enter amount: ");
        double amount = scanner.nextDouble();

        double convertedAmount = 0;
        String fromCurrency = "", toCurrency = "";

        switch (choice) {
            case 1:
                convertedAmount = amount * usdToEurRate;
                fromCurrency = "USD";
                toCurrency = "EUR";
                break;
            case 2:
                convertedAmount = amount * eurToUsdRate;
                fromCurrency = "EUR";
                toCurrency = "USD";
                break;
            case 3:
                convertedAmount = amount * usdToGbpRate;
                fromCurrency = "USD";
                toCurrency = "GBP";
                break;
            case 4:
                convertedAmount = amount * gbpToUsdRate;
                fromCurrency = "GBP";
                toCurrency = "USD";
                break;
            case 5:
                convertedAmount = amount * eurToGbpRate;
                fromCurrency = "EUR";
                toCurrency = "GBP";
                break;
            case 6:
                convertedAmount = amount * gbpToEurRate;
                fromCurrency = "GBP";
                toCurrency = "EUR";
                break;
            default:
                System.out.println("Invalid choice!");
                scanner.close();
                return;
        }

        System.out.printf("%.2f %s is equivalent to %.2f %s\n", amount, fromCurrency, convertedAmount, toCurrency);
        scanner.close();
    }
}
