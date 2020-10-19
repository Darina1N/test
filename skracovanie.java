package sk.kosickaakademia.kolesarova.interfeic.cyclus;

import java.util.Scanner;

public class Skracovanie {
    public static void main(String[] args) {
        System.out.println("Napíš nejaké slovo:");
        Scanner sc = new Scanner(System.in);
        String word = sc.nextLine();
        int lenghtArray = word.length();
        int j=0;
        do {
              for (int i = j; i<lenghtArray; i++) {
                    System.out.print(word.charAt(i));
                }
                j++;
                System.out.println();
            } while (j != lenghtArray);
    }
}