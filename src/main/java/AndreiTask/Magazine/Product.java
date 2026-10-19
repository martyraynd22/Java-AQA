package AndreiTask.Magazine;

public class Product {
    private String name;
    private int price;
    private boolean discount;

    public Product(String name, int price, boolean discount) {
        this.name = name;
        this.price = price;
        this.discount = discount;
    }

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }

    public boolean isDiscount() {
        return discount;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public void setDiscount(boolean discount) {
        this.discount = discount;
    }
}
