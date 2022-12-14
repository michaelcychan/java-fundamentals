/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package apptest.getpricelabel;

public class App {
    public String getGreeting() {
        return "Hello World!";
    }

    public static void main(String[] args) {
        System.out.println(new App().getGreeting());
    }

    public String getPriceLabel(String itemName, Integer itemPrice) {
        Double itemPriceDouble = (double) itemPrice;
        String outputText = String.format("The price for %s is %.2f.\n", itemName, itemPriceDouble);
        return outputText;
    }
}
