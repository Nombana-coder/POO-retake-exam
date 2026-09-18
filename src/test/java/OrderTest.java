import org.junit.jupiter.api.Test;

import java.util.Collections;
import java.util.Date;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertSame;

public class OrderTest {

    @Test
    public void shouldReturnOrderDetails() {
        Client customer = new Client(
                "client-1",
                "John",
                "Doe",
                new Date(90, 4, 15),
                "123 Main St",
                "john.doe@email.com",
                "555-1234");
        Date orderDate = new Date(126, 5, 1);
        Order order = new Order(
                "order-1",
                customer,
                orderDate,
                "Summer clothes order",
                Collections.emptyList(),
                Collections.emptyList());

        assertEquals("order-1", order.getId());
        assertSame(customer, order.getClient());
        assertSame(orderDate, order.getOrderDate());
        assertEquals("Summer clothes order", order.getDescription());
    }

    @Test
    public void shouldHaveZeroTotalWhenNoClothesAreOrdered() {
        Order order = new Order(
                "order-1",
                null,
                new Date(),
                "Empty order",
                Collections.emptyList(),
                Collections.emptyList());

        assertEquals(0.0, order.getTotalAmount(), 0.001);
    }
}
