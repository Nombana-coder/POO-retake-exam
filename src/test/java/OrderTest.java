import org.junit.jupiter.api.Test;
import java.time.LocalDate;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class OrderTest {

    @Test
    public void testGetTotalAmount() {
        Client customer = new Client("John", "Doe", LocalDate.of(1990, 5, 15), "123 Main St", "john.doe@email.com", "555-1234");
        Order order = new Order(LocalDate.now(), "Summer clothes order", customer);

        Clothe cottonTShirt = new Top("Cotton T-Shirt", Size.M, 19.99, material.COTTON, SleeveType.SHORT);
        Clothe blueJeans = new Bottoms("Blue Jeans", Size.L, 49.99, material.OTHER, 42);


        double expectedTotal = 159.95;
        assertEquals(expectedTotal, order.getTotalAmount(), 0.001, "The total amount of the order is incorrect.");
    }
}
