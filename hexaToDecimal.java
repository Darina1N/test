package sk.kosickaakademia.kolesarova.sustavy;

import java.util.Scanner;

public class Main3 {

    public static void main(String[] args) {
        String number;
        System.out.println("zadaj reťazec alfanumerických znakov");
        Scanner sc = new Scanner(System.in);
        number = sc.nextLine();
        int lenghtArray= number.length();
        int e=0;
        int result=0;
        for(int i=lenghtArray-1;i>=0;i--){
          char sign=number.charAt(i);
         switch (sign){
             case '0':result=result+sign*(int)Math.pow(16,e);break;
             case '1':result=result+sign*(int)Math.pow(16,e);break;
             case '2':result=result+sign*(int)Math.pow(16,e);break;
             case '3':result=result+sign*(int)Math.pow(16,e);break;
             case '4':result=result+sign*(int)Math.pow(16,e);break;
             case '5':result=result+sign*(int)Math.pow(16,e);break;
             case '6':result=result+sign*(int)Math.pow(16,e);break;
             case '7':result=result+sign*(int)Math.pow(16,e);break;
             case '8':result=result+sign*(int)Math.pow(16,e);break;
             case '9':result=result+sign*(int)Math.pow(16,e);break;
             case 'A':result=result+10*(int)Math.pow(16,e);break;
             case 'a':result=result+10*(int)Math.pow(16,e);break;
             case 'B':result=result+11*(int)Math.pow(16,e);break;
             case 'b':result=result+11*(int)Math.pow(16,e);break;
             case 'C':result=result+12*(int)Math.pow(16,e);break;
             case 'c':result=result+12*(int)Math.pow(16,e);break;
             case 'D':result=result+13*(int)Math.pow(16,e);break;
             case 'd':result=result+13*(int)Math.pow(16,e);break;
             case 'E':result=result+14*(int)Math.pow(16,e);break;
             case 'e':result=result+14*(int)Math.pow(16,e);break;
             case 'F':result=result+15*(int)Math.pow(16,e);break;
             case 'f':result=result+16*(int)Math.pow(16,e);break;
             }e++;
        }
        System.out.println(result);

    }
}
