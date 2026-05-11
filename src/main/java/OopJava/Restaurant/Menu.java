package OopJava.Restaurant;

public class Menu {
    private Dish dish;

    public void addDish(Dish dish) {
        this.dish = dish;
        System.out.println("Вы добавили блюдо в меня: " + dish.getName());
    }

    public void watschdish() {
        if (dish != null) {
            dish.stats();
        }
        else {
            System.out.println("Добавьте блюдо в меню для его демонстрации");
        }
    }
}


