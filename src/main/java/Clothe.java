public abstract class Clothe {
    private String id;
    private Size size;
    private Double price;
    private String material;

    public Clothe(String id, Size size, Double price, String material) {
        this.id = id;
        this.size = size;
        this.price = price;
        this.material = material;
    }

    public Clothe() {
    }

    public String getId() {
        return id;
    }

    public Size getSize() {
        return size;
    }

    public Double getPrice() {
        return price;
    }

    public String getMaterial() {
        return material;
    }
}
