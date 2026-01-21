package Classes_and_objects;

public class Rectangle {
    int weight;
    int height;

    public Rectangle(int newHeight,int newWeight){
        this.height = newHeight;
        this.weight = newWeight;
    }

    int getHeight(){
        return this.height;
    }

    int getWeight(){
        return this.weight;
    }

     public void setWeight(int newWeight){
        this.weight = newWeight;
     }

     int calculateArea(){
        return weight * height;
     }


}
