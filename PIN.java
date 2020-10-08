package sk.kosickaakademia.kolesarova.interfeic.planimetry;

public class Main2 {
    public static void main(String[] args) {
        int x = 1;
        while (x < 10000) {
            int c1 = x % 10;
            int c2 = (x / 10) % 10;
            int c3 = (x / 100) % 10;
            int c4 = x / 1000;
            int cs = c1 + c2 + c3 + c4;

            if (x % 2 == 1) {
                if (cs % 3 != 0) {
                    if (x % 113 == 0) {
                        if (c1 != c2 && c1 != c3 && c1 != c4 && c2 != c3 && c2 != c4 && c3 != c4) {
                            if(x<1000){
                                System.out.println("PIN: 0"+x);
                            }else
                            System.out.println("PIN: " + x);

                        }


                    }
                }
            }x++;
        }
    }
}
