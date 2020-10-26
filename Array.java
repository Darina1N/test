package sk.kosickaakademia.kolesarova.twoarray;

import java.util.Random;

public class Array {
    private static int[][] array = new int[][]{{-2,4,9,0},{0,15,2,6},{3,7,8,11}};

    public static void main(String[] args) {
        Array arr = new Array();
        arr.changeArray (array);

    }

    public static void changeArray(int[][] array) {
        int lenRow= array.length;
        int lenCol=array[0].length;
        int i,j;
        for( i=0;i< lenRow;i++){
            for( j=0;j< lenCol;j++){
                if (array[i][j] < 0) {
                    array[i][j]=absolut(array[i][j]);
                }else if(array[i][j]>0 && array[i][j]%2==1){
                    array[i][j]=neparne(array[i][j]);
                }else if(array[i][j]==0) {
                    array[i][j]=mojRandom(array[i][j]);
                }
            }
    }
        for(i=0;i<lenRow;i++){
            for(j=0;j<lenCol;j++){
                System.out.print(array[i][j]+" ");
            }
            System.out.println("");
        }
    }

    private static int mojRandom(int rand) {
        Random rnd=new Random();
        rand=rnd.nextInt(90)+10;
        return rand;
    }

    private static int neparne(int neparne) {
        int c=neparne%10;
        if (c==1 || c==3){
            neparne--;
        }else neparne++;
        return neparne;
    }

    private static int absolut(int hodnota) {
        if (hodnota<0) {
            hodnota = hodnota * (-1);
        }return hodnota;
    }

}
