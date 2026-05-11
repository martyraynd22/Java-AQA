package Classes_and_objects;

public class Circle {
    double radius;

    public Circle (double newRadius){
        this.radius = newRadius;
    }

    public void setRadius(double newRadius) {
        this.radius = newRadius;
    }
        public double getRadius(){
            return this.radius;
        }

        public double calculateArea(){
        return Math.PI * (radius * radius);
        }

        public double calculateCircumference(){
        return 2 * Math.PI * radius;
        }
    }

