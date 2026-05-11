package Classes_and_objects;

public class Rectangle {
    int width;
    int height;

    public Rectangle(int newHeight,int newWidth){
        this.height = newHeight;
        this.width = newWidth;
    }

    int getHeight(){
        return this.height;
    }

    int getWidth(){
        return this.width;
    }

     public void setWidth(int newWidth){
        this.width = newWidth;
     }

     int calculateArea(){
        return width * height;
     }


}
