package Classes_and_objects;

public class Point {
    int x;
    int y;

    public Point (int newX,int newY){
        this.x = newX;
        this.y = newY;
    }

    public void setX(int newX) {
        this.x = newX;
    }

    public int getX(){
        return  this.x;
    }

    public int getY(){
        return this.y;
    }

    void print(){
        System.out.println("Координаты " + this.x + " " + this.y);
    }
}
