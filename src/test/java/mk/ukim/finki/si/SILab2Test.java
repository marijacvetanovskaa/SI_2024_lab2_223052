package mk.ukim.finki.si;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

public class SILab2Test {

    // test slucaj 4 od every branch
    // allItems != null, item.getName() != null && item.getName().length() > 0
    @Test
    public void testCheckCart1() {
        // Given
        List<Item> allItems = Arrays.asList(new Item("item1", "1234567890", 100, 0.1f));
        int payment = 1000;

        // When
        boolean result = SILab2.checkCart(allItems, payment);

        // Then
        assert result == true;
    }

    // test slucaj 4 od multiple condition
    // item.getPrice() > 300 && item.getDiscount() > 0 && item.getBarcode().charAt(0) == '0'
    @Test
    public void testCheckCart2() {
        // Given
        List<Item> allItems = Arrays.asList(new Item("item1", "0234567890", 301, 0.1f));
        int payment = 1000;

        // When
        boolean result = SILab2.checkCart(allItems, payment);

        // Then
        assert result == true;
    }
}