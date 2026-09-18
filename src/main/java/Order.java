import java.util.ArrayList;
import java.time.LocalDate;
import java.util.List;

public class Order {
    private String id;
    private Client client;
    private LocalDate orderDate;
    private String description;
    private List<Clothe> clothesOrdered;

    public Order(String id, Client client, LocalDate orderDate, String description, List<Top> topsOrdered, List<Bottoms> bottomsOrdered) {
        this.id = id;
        this.client = client;
        this.orderDate = orderDate;
        this.description = description;
        this.clothesOrdered = clothesOrdered;
    }

    public String getId() {
        return id;
    }
    public Client getClient() {
        return client;
    }
    public LocalDate getOrderDate() {
        return orderDate;
    }
    public String getDescription() {
        return description;
    }
    public List<Clothe> getClothesOrdered;

    public Double getTotalAmount() {
        List<Double> pricelist = new ArrayList<>();
        return this.getClothesOrdered.stream()
                .mapToDouble( Clothe::getPrice)
                .sum();
    }

}
