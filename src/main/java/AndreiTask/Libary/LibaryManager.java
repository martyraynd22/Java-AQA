package AndreiTask.Libary;

import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;

public class LibaryManager {
    List<Book> biblioteka = new ArrayList<>();

    public void changeInAvailability(String name,String author, int age){
        Book book = biblioteka.stream()
                .filter( b -> b.getName().equalsIgnoreCase(name) & b.getAuthor().equalsIgnoreCase(author) & b.getAge() == age)
                .findFirst()
                .orElseThrow(() -> new NoSuchElementException("Книга не найдена"));
                book.setAvailability(!book.isAvailability());
    }

    public List<Book> searchByAuthor(String author){
        return biblioteka.stream()
                .filter(book -> book.getAuthor().equalsIgnoreCase(author))
                .toList();
    }

    public List<Book> searchByAge(int age){
        return biblioteka.stream()
                .filter(book -> book.getAge() == age)
                .toList();
    }
}
