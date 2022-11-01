package pricedisplay;

public class PriceDisplay {
  void main(String[] args) {

  }

  String getPriceLabel(String itemName, Integer itemPrice) {
    Double itemPriceDouble = (double) itemPrice;
    String outputText = String.format("The price for %s is %.2f.\n", itemName, itemPriceDouble);
    return outputText;
  }
}
