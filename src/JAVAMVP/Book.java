package JAVAMVP;

public class Book {
    String title;
    String author;

    public Book (String newTitle,String newAuthor){
        this.title = newTitle;
        this.author = newAuthor;
    }

    String getTitle(){
        return this.author;
    }

    String getAuthor(){
        return this.title;
    }

    void setAuthor(String NewAuthor){
        this.author = NewAuthor;
    }

    void print(){
        System.out.println("Автор книги:" + this.author +"\n" + "Название Книги:" + this.title);
    }
}
