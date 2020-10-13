package sk.kosickaakademia.kolesarova.sustavy;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int c=0;
        int sustava=0;
        do {
            System.out.println("Zadaj číslo, ktoré chceš previesť: ");
            Scanner n = new Scanner(System.in);
            c = n.nextInt();
            if(c<=0)
                System.out.println("Číslo musí byť kladné a nesmie sa rovnať 0");
        }while(c<=0);
        do{
            System.out.println("Zadaj sústavu do ktorej chceš číslo previesť. Môže byť 2, 8 alebo 16:");
            Scanner s=new Scanner(System.in);
            sustava= s.nextInt();
            if(sustava!=2 && sustava!=8 && sustava!=16) {
                System.out.println("Vybral si si neakceptované číslo sústavy.");

            }
            }while(sustava!=2 && sustava!=8 && sustava!=16);
        if(sustava==2) {
            long y = 0;
            int p = 0;
            while (c > 0) {
                y = (long) (y + (c % 2) * Math.pow(10, p));
                c = c / 2;
                p++;
            }
            System.out.println(y);
        }
        if(sustava==8) {
            long y = 0;
            int p = 0;
            while (c > 0) {
                y = (long) (y + (c % 8) * Math.pow(10, p));
                c = c / 8;
                p++;
            }
            System.out.println(y);
        }
        if(sustava==16) {
            String y = "";
            while (c > 0) {
                int p=(c%16);
                switch(p){
                    case 10: y="A"+y; break;
                    case 11: y="B"+y; break;
                    case 12: y="C"+y; break;
                    case 13: y="D"+y; break;
                    case 14: y="E"+y; break;
                    case 15: y="F"+y; break;
                    default: y=p+y;
                }
                c=c/16;
            }
            System.out.println(y);
        }
    }
}
