package GenericsTask;

public class Task2 <X,Y>{
    private X x;
    private Y y;

    public void setX(X x) {
        this.x = x;
    }

    public void setY(Y y) {
        this.y = y;
    }

    public X getX() {
        return x;
    }

    public Y getY() {
        return y;
    }
}
