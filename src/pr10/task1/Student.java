package pr10.task1;

public class Student {
    public int getiDNumber() {
        return iDNumber;
    }

    public void setiDNumber(int iDNumber) {
        this.iDNumber = iDNumber;
    }

    public double getGpa() {
        return gpa;
    }

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }

    private int iDNumber;
    private double gpa;

    public Student(int iDNumber, double gpa) {
        this.iDNumber = iDNumber;
        this.gpa = gpa;
    }


}
