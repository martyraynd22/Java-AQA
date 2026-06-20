package SolutionManual.Jenerics;

public class Task4 <K,V> {
    private K key;
    private V value;

    public Task4(K key, V value){
        this.key = key;
        this.value = value;
    }

    public K getKey() {
        return key;
    }

    public V getValue(){
        return value;
    }

    public void setKey(K key){
        this.key = key;
    }

    public void setValue(V value){
        this.value = value;
    }

    public String toString(){
        return "(" + key + " " + value + ")";
    }

    public static void main(String[] args) {
        Task4<String,Integer> pair = new Task4<>("Коля",25);

        System.out.println(pair.toString());
    }
}
