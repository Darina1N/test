package sk.kosickaakademia.kolesarova.sustavy;

import java.util.Scanner;

public class Main1 {
    public static void main(String[] args) {
        int vysledok = 0;
        int i;
        do {
            System.out.println("zadaj číslo: ");
            Scanner cs = new Scanner(System.in);
            i = cs.nextInt();
            if (i != 0) {
                vysledok += i;
            }
           } while (i != 0);
        System.out.println(vysledok);
    }
}