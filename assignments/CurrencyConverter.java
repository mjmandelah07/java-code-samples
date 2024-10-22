import java.util.HashMap;
import java.util.Scanner;

public class CurrencyConverter {

    // Store exchange rates (1 USD = 1,648.00 NGN).
    // Prompt the user to enter,
        // The amount of money to convert.
        //The source currency (USD or NGN).
        //The target currency (NGN or USD).
    // check if the source and target currency exist
    // Based on the user input, get the exchange rate between the source and target currency.
    // Multiply/ divide the input amount by the exchange rate.
    // display the answer to user

    // OR

    // Display the conversion currency to user to select (1. USD - NGN)
    // Get user input for currency
    // get amount from user to convert from USD - NGN
    // If user input is USD - NGN, multiply the exchange rate with amount
    // if user select option that is not within the program, display error or ask user to reselect
    // display result

    // Method to define and get exchange rates
    private static HashMap<String, Double> getExchangeRates(){
        HashMap<String, Double> exchangeRates = new HashMap<>();

        // store exchange rates
        exchangeRates.put("USD_NGN", 1648.0);
        exchangeRates.put("NGN_USD", 1 / 1648.0);
        exchangeRates.put("EUR_NGN", 1779.4);
        exchangeRates.put("NGN_EUR", 1 / 1779.4);

        return exchangeRates;
    }

    // Method to convert currency
    private static double convertCurrency(double amount, String fromCurrency, String toCurrency){
        HashMap<String, Double> exchangeRates = getExchangeRates();
        String conversionKey = fromCurrency + "_" + toCurrency;

        // Check if the conversion rate exists
        if(exchangeRates.containsKey(conversionKey)) {
            double exchangeRate = exchangeRates.get(conversionKey);
            return amount * exchangeRate;
        } else {
            System.out.println("Conversion rate for " + fromCurrency + " to " + toCurrency + " not available.");
            return -1; // return error
        }

    }

    // Method to validate if the user entered a valid currency
    private static boolean isValidCurrency(String currency) {
        String[] validCurrencies = {"USD", "NGN", "EUR",};
        for (String validCurrency : validCurrencies) {
            if (validCurrency.equals(currency)) {
                return true;
            }
        }
        return false;
    }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean exit = false;

        // while user did to enter exit, keep converting
        // take user input for amount, currency source and target or to exit
        while(!exit){
            // Taking input from the user
            System.out.println("Enter the amount to convert (or type 'exit' to quit): ");
            String input = scanner.next();

            // if user type exit, exit = true
            if(input.equalsIgnoreCase("exit")){
                exit = true;
                break;
            }

            double amount;
            // If user enter amount, get it and assign to amount variable
            try {
                amount = Double.parseDouble(input);
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter a valid number for the amount.");
                continue;
            }

            // Getting valid source currency
            String fromCurrency;
            while (true) {
                System.out.println("Enter the source currency (USD, NGN, EUR): ");
                fromCurrency = scanner.next().toUpperCase();
                if (isValidCurrency(fromCurrency)) {
                    break;
                } else {
                    System.out.println("Invalid currency. Please select from USD, NGN, EUR");
                }
            }

            // Getting valid target currency
            String toCurrency;
            while (true) {
                System.out.println("Enter the target currency (USD, NGN, EUR): ");
                toCurrency = scanner.next().toUpperCase();
                if (isValidCurrency(toCurrency)) {
                    break;
                } else {
                    System.out.println("Invalid currency. Please select from USD, NGN, EUR");
                }
            }

            // Performing the conversion
            double result = convertCurrency(amount, fromCurrency, toCurrency);

            // Displaying the result
            if (result != -1) {
                System.out.println(amount + " " + fromCurrency + " is equal to " + result + " " + toCurrency);
            }
        }

        scanner.close();
        System.out.println("Currency converter exited.");
    }
}
