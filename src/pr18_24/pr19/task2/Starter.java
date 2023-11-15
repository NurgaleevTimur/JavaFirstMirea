package pr18_24.pr19.task2;
import java.util.ArrayList;

public class Starter {
    public static void main(String[] args) {
        ArrayList<Student> s = new ArrayList<>();
        s.add(new Student("Нургалеев Тимур", 67, 12, 18));
        s.add(new Student("Болдаев Михаил", 57, 12, 18));
        s.add(new Student("Арзуманов Георгий", 93, 12, 19));
        s.add(new Student("Татарников Антон", 24, 2, 18));
        s.add(new Student("Анискин Ефим", 66, 12, 18));

        new LabClassUI(s);
    }

}