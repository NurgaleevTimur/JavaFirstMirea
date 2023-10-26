package pr13.task4;

public class Tester {
    public static void main(String[] args) {
        String[] shirts = new String[11];
        Shirt[] clothes = new Shirt[11];
        shirts[0] = "S001,Black Polo Shirt,Black,XL";
        shirts[1] = "S002,Black Polo Shirt,Black,L";
        shirts[2] = "S003,Blue Polo Shirt,Blue,XL";
        shirts[3] = "S004,Blue Polo Shirt,Blue,M";
        shirts[4] = "S005,Tan Polo Shirt,Tan,XL";
        shirts[5] = "S006,Black T-Shirt,Black,XL";
        shirts[6] = "S007,White TShirt,White,XL";
        shirts[7] = "S008,White T-Shirt,White,L";
        shirts[8] = "S009,Green T-Shirt,Green,S";
        shirts[9] = "S010,Orange T-Shirt,Orange,S";
        shirts[10] = "S011,Maroon Polo Shirt,Maroon,S";
        for (int i=0; i<=10; i++)
        {
            String art = new String(shirts[i].substring(0, shirts[i].indexOf(",")));
            shirts[i]=shirts[i].substring(shirts[i].indexOf(",")+1);
            String name = new String(shirts[i].substring(0, shirts[i].indexOf(",")));
            shirts[i]=shirts[i].substring(shirts[i].indexOf(",")+1);
            String color = new String(shirts[i].substring(0, shirts[i].indexOf(",")));
            shirts[i]=shirts[i].substring(shirts[i].indexOf(",")+1);
            String size = shirts[i];
            clothes[i] = new Shirt(art, name, color, size);
            //String[] parts = shirts[i].split(",");
            //clothes[i] = new Shirt(parts[0], parts[1], parts[2], parts[3]);
            System.out.println(clothes[i]);
        }

    }
}
