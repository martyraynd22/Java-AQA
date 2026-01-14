package JAVAMVP;

public class Rectangle {
    int width;
    int height;

    public Rectangle(int newWidth, int newHeight) {
        this.width = newWidth;
        this.height = newHeight;

    }

    void setWidth(int newWidth) {
        this.width = newWidth;
    }

    int getHeight() {
        return this.height;
    }

    int getWidth() {
        return this.width;
    }
    int Ploshad(){
        return width * height;
    }
    void print() {
        System.out.println("Площадь прямоугольника равна "+ Ploshad());
    }
}