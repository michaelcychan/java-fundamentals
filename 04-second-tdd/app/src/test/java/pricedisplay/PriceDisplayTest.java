package pricedisplay;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class PriceDisplayTest {
  @Test public void testPriceDisplay() {
    PriceDisplay pd = new PriceDisplay();
    assertEquals("Should return a sentence 'The price for coffee mug is 4.00.", String.valueOf("The price for coffee mug is 4.00.\n"), pd.getPriceLabel("coffee mug", 4));
  }
}
