package sk.kosickaakademia.kolesarova.password;

import java.util.Random;

public class Password {
   public static void main(String[] args) {
       Password password=new Password();
       password.randomCapitalPassword();
   }
        public String randomCapitalPassword() {
            String pass = "";
            Random rnd = new Random();
            int i;
            for (i = 0; i < 10; i++) {
                int j= rnd.nextInt(3);//aby mi ten switch bežal náhodne od 0-2
                char z=0;
                switch (j){
                    case 0: z = (char) (rnd.nextInt(26) + 65);break;//veľké písmená
                    case 1: z = (char) (rnd.nextInt(26) + 97);break;//malé písmená
                    case 2: z = (char) (rnd.nextInt(10) + 48);break;//čísla
                }
                pass += z;
                }
            System.out.println(pass);
            return pass;

            }
        }