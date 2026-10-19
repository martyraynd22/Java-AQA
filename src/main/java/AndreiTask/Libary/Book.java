package AndreiTask.Libary;

public class Book {
    private String name;
    private String author;
    private boolean availability;
    private int age;

    public Book(String name, String author, boolean availability, int age) {
        this.name = name;
        this.author = author;
        this.availability = availability;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public String getAuthor() {
        return author;
    }

    public boolean isAvailability() {
        return availability;
    }

    public int getAge() {
        return age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setAvailability(boolean availability) {
        this.availability = availability;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Book{" +
                "name='" + name + '\'' +
                ", author='" + author + '\'' +
                ", availability=" + availability +
                ", age=" + age +
                '}';
    }
}

