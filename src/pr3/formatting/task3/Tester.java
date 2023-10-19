package pr3.formatting.task3;

public class Tester {
    public static void main(String[] args) {
        Emploee []emploees = new Emploee[10];
        for (int i=0; i<10; i++){
            Emploee e = new Emploee("Emp "+ String.valueOf(i), 2000*i);
            emploees[i]=e;
        }
        System.out.println(emploees);
        Report r = new Report();
        r.generateReport(emploees);
    }
}
