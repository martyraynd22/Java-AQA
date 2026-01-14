package JAVAMVP;

public class Circle {
    double radius;

    public  Circle(double newRadius){
        this.radius = newRadius;
    }

    void setRadius(double newRadius){
        this.radius = newRadius;
    }

    double getRadius(){
        return this.radius;
    }

   public double calculateArea(){
        return Math.PI * (radius * radius);
    }
   public double calculateCircumference(){
       return  2 * Math.PI * radius;
   }

   void print(){
       System.out.println("Площадь равна " + calculateArea() + " Длина окружности " + calculateCircumference());
   }
}
