package pr18_24.pr20.task4;

import java.io.Serializable;

public class MinMax<E extends Comparable> implements Serializable{
    private E[] list;

    public MinMax(E[] list) {
        this.list = list;
    }

    public E[] getList() {
        return list;
    }

    public void setList(E[] list) {
        this.list = list;
    }
    public E min(){
        E min = list[0];
        for (int i=0; i<list.length; i++){
            if (list[i].compareTo(min)<0){
                min = list[i];
            }
        }
        return min;
    }
    public E max(){
        E max = list[0];
        for (int i=0; i<list.length; i++){
            if (list[i].compareTo(max)>0){
                max = list[i];
            }
        }
        return max;
    }
    @Override
    public String toString() {
        return "MinMax{" +
                "list=" + list +
                '}';
    }
}
