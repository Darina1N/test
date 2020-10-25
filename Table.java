package sk.kosickaakademia.kolesarova.twoarray;

public class Table {

    private int [][] array=new int[][]{{2,5,8,0},{0,1,7,9},{-1,1,8,14}};
    int lenght=array.length;
    int lenghtcol=array[0].length;
    int len=lenght*lenghtcol;
    private static int [][] arr=new int[][]{{2,5,8,0},{0,1,7,9},{-1,1,8,14}};

    public static void main(String[] args) {
        Table table=new Table();
        int [][] result=Table.transponovana(arr);
        table.print(result);
        int value=table.min();
        int value2= table.max();
        double value3=table.average();
        int value4= table.sumDiagolala();

        System.out.println("Minimálna hodnota v tabuľke je "+value);
        System.out.println("Maximálna hodnota v tabuľka je "+value2);
        System.out.println("Priemerná hodnota tabuľky je "+value3);
        System.out.println("Súčet prvkov pod diagonálov je "+value4);
    }


    public int min(){
        int minimum=array[0][0];
        int i,j;
        for(i=0;i<3;i++){
            for(j=0;j<4;j++){
                if(array[i][j]<minimum)
                    minimum=array[i][j];
            }
        }
        return minimum;
    }

    public int max(){
        int maximum=array[0][0];
        int i,j;
        for(i=0;i<3;i++){
            for(j=0;j<4;j++){
                if(array[i][j]>maximum)
                    maximum=array[i][j];
            }
        }
        return maximum;
    }

    public double average() {
        double average=0;
        int i,j;
        double c=0;
        for (i=0;i<3;i++){
            for (j=0;j<4;j++){
                c+=array[i][j];
            }
            average=c/len;
        }return average;
    }

    public int sumDiagolala(){
        int sum=0;
        int i,j;
        for(i=1;i<3;i++){
            for(j=0;j<i;j++){
                sum+=array[i][j];
            }
        }
        return sum;
    }

    public static int [][] transponovana(int[][] p){
        int row=p.length;
        int col=p[0].length;
        int [][] r= new int [col][row];
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                r[j][i]=p[i][j];
            }
        }return r;
    }

    private void print(int[][] result) {
        int row= result.length;
        int col=result[0].length;
        for(int j=0;j<row;j++){
            for(int i=0;i<col;i++){
                System.out.print(result[j][i]+" ");
            }System.out.println("");
        }
    }
}
