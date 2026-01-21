package Classes_and_objects;

public class Book {
    String author;
    String title;

    public Book (String newAuthor,String newTitle){
        this.author = newAuthor;
        this.title = newTitle;
    }

    String getAuthor(){
        return this.author;
    }

    String getTitle(){
        return this.title;
    }

    public void setAuthor(String newAuthor){
        this.author = newAuthor;
    }

    public void setTitle(String newTitle){
        this.title = newTitle;
    }

    void printInfo(){
        System.out.println("Название книги " + this.title + " Автор книги " + this.author);
    }


}
