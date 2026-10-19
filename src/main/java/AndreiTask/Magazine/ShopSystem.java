package AndreiTask.Magazine;

public class ShopSystem {

    public boolean checkProduct(Cart cart,String name) {
        return cart.getProducts().stream()
                .anyMatch(product -> product.getName().equalsIgnoreCase(name));
    }

    public boolean checkDiscount(Cart cart, String name){
        return cart.getProducts().stream()
                .anyMatch(product -> product.getName().equalsIgnoreCase(name) & product.isDiscount());
    }
}
