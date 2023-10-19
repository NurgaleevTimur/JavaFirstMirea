package pr3.formatting.task3;

public class Emploee {
    private String fullname;
    private int salary;

    public Emploee(String fullname, int salary) {
        this.fullname = fullname;
        this.salary = salary;
    }

    public String getFullname() {
        return fullname;
    }

    public void setFullname(String fullname) {
        this.fullname = fullname;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Emploee{" +
                "fullname='" + fullname + '\'' +
                ", salary=" + salary +
                '}';
    }
}
