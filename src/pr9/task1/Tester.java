package pr9.task1;
import java.util.Random;
import java.util.random.*;
public class Tester {
    public static void main(String[] args) {
        Student[] students = new Student[10];
        int l = students.length;
        Random rand = new Random();
        for (int i=0; i<l; i++) {
            students[i] = new Student(rand.nextInt(10000));
            System.out.println(students[i].getIDNumber());
        }
        for (int i =0; i<l; i++){
            Student tmp = students[i];
            int j;
            for (j=i; j>0 && students[j-1].getIDNumber() > tmp.getIDNumber(); j--) {
                students[j] = students[j-1];
            }
            students[j] = tmp;
        }
        System.out.println("Отсортированный вставками массив");
        for (int i=0; i<l; i++) {
            System.out.println(students[i].getIDNumber());
        }
    }
}