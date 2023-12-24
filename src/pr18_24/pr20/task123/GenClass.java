package pr18_24.pr20.task123;

public class GenClass<T extends Comparable<T>, V extends Animal, K> {
    private T t;
    private V v;
    private K k;

    public GenClass(T t, V v, K k) {
        this.t = t;
        this.v = v;
        this.k = k;
    }

    public T getT() {
        return t;
    }

    public void setT(T t) {
        this.t = t;
    }

    public V getV() {
        return v;
    }

    public void setV(V v) {
        this.v = v;
    }

    public K getK() {
        return k;
    }

    public void setK(K k) {
        this.k = k;
    }
    public Object getClassT(){
        return t.getClass();
    }
    public Object getClassV(){
        return v.getClass();
    }
    public Object getClassK(){
        return k.getClass();
    }
    public void getClasses(){
        System.out.println("Class of T: " + getClassT());
        System.out.println("Class of V: " + getClassV());
        System.out.println("Class of K: " + getClassK());
    }
}