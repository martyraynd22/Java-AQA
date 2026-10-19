package AndreiTask.Libary;

public class Main {
    public static void main(String[] args) {

        Book nigga = new Book("Андрюха синьор", "ErAndrei", true, 2026);
        Book knigga = new Book("Даня Джун", "Java Pshe", false, 2027);

        LibaryManager libaryManager = new LibaryManager();
        libaryManager.biblioteka.add(knigga);
        libaryManager.biblioteka.add(nigga);
        System.out.println(libaryManager.biblioteka);
        System.out.println(libaryManager.searchByAuthor("ErAndrei"));
        libaryManager.changeInAvailability("Андрюха синьор", "ErAndrei",2026);
        System.out.println(libaryManager.biblioteka);
        libaryManager.changeInAvailability("Даня Джун", "Java Pshe", 2027);
        System.out.println(libaryManager.biblioteka);

    }
}