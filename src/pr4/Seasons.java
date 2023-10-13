package pr4;

public class Seasons {
    public enum Season {
        Winter(-10),
        Spring(0),
        Summer(20){
            @Override
            public String getDescription(){
                return "Теплое время года";
            }
        },
        Fall(0);
        private final int temp;
        private Season(int temp) {
            this.temp = temp;
        }
        public String getDescription(){
            return "Холодное время года";
        }

    }
    Season fav = Season.Winter;

    public static void iLove(Season season) {
        switch (season){
            case Winter -> System.out.println("I love Winter");
            case Spring -> System.out.println("I love Spring");
            case Summer -> System.out.println("I love Summer");
            case Fall -> System.out.println("I love Fall");
        }
    }
    public static void main(String[] args) {
        Season season;
        Season fav = Season.Winter;
        System.out.printf(fav.toString()+" is the season from December to February");
        for (Season s: Season.values()){
            System.out.printf("\n%s, t=%d\n", s, s.temp);
            System.out.println(s.getDescription());
            iLove(s);
        }
    }
}
