package pr18_24.pr18;
import java.util.Scanner;

public class Task67 {
    public void getKey() throws Exception {
        String key;
        try (Scanner myScanner = new Scanner(System.in)) {
            System.out.print("Enter Key ");
            key = myScanner.nextLine();
        }
        printDetails(key);
    }

    public void printDetails(String key) throws Exception {
        String message = getDetails(key);
        System.out.println(message);
    }

    private String getDetails(String key) throws Exception {
        if (key.equals("")) {
            throw new Exception("Key set to empty string");
        }
        return "data for " + key;
    }

    public static void main(String[] args) {
        Task67 td = new Task67();
        try {
            td.getKey();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
