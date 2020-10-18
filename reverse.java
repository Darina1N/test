package sk.kosickaakademia.kolesarova.interfeic.cyclus;

import java.util.Scanner;

public class Reverse {
    public static void main(String[] args) {
        System.out.println("Napíš nejaké slovo:");
        Scanner sc=new Scanner(System.in);
        String word= sc.nextLine();
        int lenghtArray= word.length();
        for(int i=lenghtArray-1;i>=0;i--){
            System.out.print(word.charAt(i));
        }
    }
}
