package pr3.formatting.task3;

public class Report {
    public static void generateReport(Emploee[] emps){
        System.out.printf("%-15s %15s %n", "Имя сотрудника", "Зарплата");
        for (int i=0; i<emps.length; i++)
            System.out.printf("%-15s %15s %n", emps[i].getFullname(), emps[i].getSalary());
    }
}
