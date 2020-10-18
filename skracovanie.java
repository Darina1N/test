package sk.kosickaakademia.kolesarova.interfeic.cyclus;

import java.util.Scanner;

public class Skracovanie {
    public static void main(String[] args) {
        System.out.println("Napíš nejaké slovo:");
        Scanner sc = new Scanner(System.in);
        String word = sc.nextLine();

        int lenghtArray = word.length();
        int newLenght = lenghtArray;
        do {
            if (newLenght == lenghtArray) {
                for (int i = 0; i <lenghtArray; i++) {
                    System.out.print(word.charAt(i));
                }
                lenghtArray--;
            } else {
                System.out.println();
                newLenght--;
            }
        } while (newLenght != 0);
    }
}
