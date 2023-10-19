package pr3.mathrandom.task2;
import java.util.Random;
/*
Создать класс точка Point, описывающий точку на плоскости.
Создать Circle класс, в котором одно поле представляет точку – центр окружности,
и добавить другие свойства, позволяющие задать точку на плоскости. Создать третий класс
Tester который использует для хранения объектов массив объектов Circle и второе поле
количество элементов в массиве. Добавить в класс методы, позволяющие найти самую маленькую
и самую большую окружность. Добавить в класс метод, упорядочивающий хранение окружностей в массив.
Для инициализации полей радиуса и длины окружностииспользуйте класс Random или метод random()
класса Math по желанию
 */
public class Tester {
    public static void main(String[] args) {
        Random rand = new Random();
        int l = rand.nextInt(1, 30);
        Circle[] cir = new Circle[l];
        for (int i=0; i<l; i++){
            Point point = new Point(rand.nextInt(100), rand.nextInt(100));
            cir[i] = new Circle(rand.nextDouble(100.0), point);
        }
        for (int i=0; i<l; i++){
            System.out.println(cir[i]);
        }
        System.out.printf("\nМинимальная окружность: %s", minr(cir, l));
        System.out.printf("\nМаксимальная окружность: %s\n\n", maxr(cir, l));
        sortcir(cir, l);
        System.out.println("Отсортированные окружности:");
        for (int i=0; i<l; i++){
            System.out.println(cir[i]);
        }


    }
    public static double minr(Circle[] cir, int l){
        double minr = 101;
        for (int i=0; i<l; i++){
            if (cir[i].getR()<minr){
                minr = cir[i].getR();
            }
        }
        return minr;
    }
    public static double maxr(Circle[] cir, int l){
        double maxr = -1;
        for (int i=0; i<l; i++){
            if (cir[i].getR()>maxr){
                maxr = cir[i].getR();
            }
        }
        return maxr;
    }
    public static void sortcir(Circle[] cir, int l){
        for (int i=0; i<l; i++){
            for (int j=0; j<l-1; j++){
                if (cir[j].getR()>cir[j+1].getR()){
                    Circle tmp = cir[j];
                    cir[j] = cir[j+1];
                    cir[j+1] = tmp;
                }
            }
        }
    }
}
