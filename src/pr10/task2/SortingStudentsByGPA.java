package pr10.task2;
import pr10.task1.Student;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

public class SortingStudentsByGPA {
    private ArrayList<Student> students;

    public SortingStudentsByGPA() {
        students = new ArrayList<>();
    }

    public void setArray(Student[] students) {
        this.students.addAll(Arrays.asList(students));
    }

    public void quickSort(Comparator<Student> comparator) {
        students.sort(comparator);
    }

    public void outArray() {
        for (Student student : students) {
            System.out.println("ID: " + student.getiDNumber() + ", GPA: " + student.getGpa());
        }
    }

    public static void main(String[] args) {
        Student[] studentsArray = {
                new Student(1, 3.5),
                new Student(2, 3.8),
                new Student(3, 3.2)
        };
        SortingStudentsByGPA sorter = new SortingStudentsByGPA();

        sorter.setArray(studentsArray);

        Comparator<Student> gpaComparator = Comparator.comparingDouble(student -> student.getGpa());
        sorter.quickSort(gpaComparator.reversed());

        sorter.outArray();
    }
}
