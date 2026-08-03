package ComplexTask.Task5;

public class Main {

    public static void main(String[] args) {

        InventoryService service = new InventoryService();
        Product camera = new Product("Камера", 11111, "Фототехника");
        Product videoCamera = new Product("Видео-камера", 12000, "Фототехника");
        Product micro = new Product("Микрофон", 111, "Фототехника");
        Product laptopHp = new Product("Ноутбук HP", 1111121, "Компьютеры");
        Product laptopAsus = new Product("Ноутбук ASUS", 11111, "Компьютеры");
        Product laptopLenovo = new Product("Ноутбук Lenovo", 11154311, "Компьютеры");
        Product tvLg = new Product("Телевизор LG", 111121, "Телевизоры");
        Product gblMicro = new Product("Наушники GBL", 1111, "Фототехника");

        service.setInventoryStatus();
        service.addProduct(camera);
        System.out.println(service);

    }
}