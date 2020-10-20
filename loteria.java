package sk.kosickaakademia.kolesarova.loteria;

import java.util.Arrays;
import java.util.Scanner;

public class Loteria {
    private int[] tip = new int[5];//definujem si tu aby bolo možné použiť všade v celom programe
    private int[] zreb = new int[10];
    private float vklad;
    private int count=0;

    public static void main(String[] args) {
        Loteria loteria = new Loteria();//vytvorila som si novú premennú zavolaním
        //0 vklad
        loteria.vklad();
        //1 zadavanie
        loteria.inputNumbers();//volám metódu na tipovanie čísel
        //2 zrebovanie
        loteria.randomNumbers();
        //3 overovanie
        loteria.checkTip();
        // 4 výhra
        loteria.win();
    }


    public float vklad() {//0 môj vklad
        do{ System.out.println("Zadaj koľko chceš vložiť: ");
            Scanner sc=new Scanner(System.in);
            vklad=sc.nextFloat();
            if(vklad<=0)
            System.out.println("Ak chceš ozaj niečo vyhrať tak musíš aj niečo vložiť! Koľko chceš teda vložiť? ");
        }while(vklad<=0);
        return vklad;
    }

    public void inputNumbers() {//1. môj tip
        int i = 0;
        int in;
        Scanner sc = new Scanner(System.in);
        while (i < 5) {
            System.out.print("zadaj" + (i + 1) + ". číslo: ");//dávam i+1 len preto aby sa na obrazovku zobrazilo že 1. číslo keďže i mi ide od 0
            in = sc.nextInt();
            if (in > 0 && in < 21 && checkArray(i, in)) {//potrebujem ošetriť, čiže môže ísť len od 1 do 20 a nesmie sa opakovať. to opakovanie urobím cez ďalšiu podmetódu
                tip[i] = in;//ak zistím, že podmienky sú OK tak mi do poľa i zapíš tipované číslo in
                i++;//posun na ďalšie okienko poľa
            } else
                System.out.println("Chybné číslo! Zadaj ešte raz.");
        }
        System.out.println("Tvoj tip: ");
        for (i = 0; i < 5; i++) {
            System.out.print(tip[i] + " ");//vypíše mi moje tipované čísla a keďže je to pole tak preto cez for
        }
    }

    public boolean checkArray(int i, int in) {//metóda na porovnanie či sa dané číslo už vyskytuje alebo nie, preto boolean lebo T alebo F
        if (i == 0)//prvá pozícia je hneď T
            return true;
        for (int j = 0; j < i; j++) {//musím prechádzať to pole, ale nie celé, ale len od začiatku doteraz čiže do i
            if (tip[j] == in)//ak sa to číslo zhoduje s už zadaným tak F ak T tak automaticky vráti T
                return false;
        }
        return true;
    }

    public void randomNumbers(){//2.žrebovanie
         int i=0;
         int randomNumbers;
         while (i<10){
             randomNumbers=(int)(Math.random()*20+1);//nech mi náhodne vyberá medzi číslami od 1 do 20
             if(checkArray2(i,randomNumbers)){
                zreb[i]=randomNumbers;
                i++;
             }
         }
         Arrays.sort(zreb);
         System.out.println("Vyžrebované čísla: ");
         for (i = 0; i < 10; i++) {
             System.out.print(zreb[i] + " ");
         }
    }

    public boolean checkArray2(int i, int randomNumbers) {//metóda na porovnanie či sa dané číslo už vyskytuje alebo nie, preto boolean lebo T alebo F
        if (i == 0)//prvá pozícia je hneď T
            return true;
        for (int j = 0; j < i; j++) {//musím prechádzať to pole, ale nie celé, ale len od začiatku doteraz čiže do i
            if (zreb[j] == randomNumbers)//ak sa to číslo zhoduje s už zadaným tak F ak T tak automaticky vráti T
                return false;
        }
        return true;
    }

    public int checkTip() {//3.overenie tipu
        int i;
        int j;
        for(i=0;i<5;i++){
            for(j=0;j<10;j++){
                if(tip[i]==zreb[j]){
                    count++;
                    break;//ak nájdem zhodu tak aby zbytočne neprechádzal celé j ale zbehol odznova a hľadal ďalšie
                }
            }
        }
        System.out.println();
        System.out.println("Uhádol si "+count+" čísla");
        return count;
    }

    public void win() {//4. výhra
        switch (count){
            case 0:
                System.out.println("Vyhral si "+vklad*0+" €");break;
            case 1:
                System.out.println("Vyhral si "+vklad*0+" €");break;
            case 2:
                System.out.println("Vyhral si "+vklad*2+" €");break;
            case 3:
                System.out.println("Vyhral si "+vklad*15+" €");break;
            case 4:
                System.out.println("Vyhral si "+vklad*500+" €");break;
            case 5:
                System.out.println("Vyhral si "+vklad*10000+" €");break;
        }
    }

}
