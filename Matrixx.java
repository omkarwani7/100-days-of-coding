import java.util.*;
public class Matrixx{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int row=sc.nextInt();
        int col=sc.nextInt();
        int[][] arr=new int[row][col];
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                arr[i][j]=sc.nextInt();
            }
        }
        System.out.println("-----");

        // print entire matrix
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }

        System.out.println("-----");

        // print specific row in matrix
        for(int i=0;i<arr[1].length;i++){
            System.out.print(arr[1][i]+" ");
        }
        System.out.println();

        System.out.println("-----");

        // print rows that does not contains -1
        for(int i=0;i<arr.length;i++){
            boolean hasMinusOne=false;
            for(int j=0;j<arr[i].length;j++){
                if(arr[i][j]==-1){
                    hasMinusOne=true;
                    break;
                }
            }
            if(!hasMinusOne){
                for(int j=0;j<arr[i].length;j++){
                    System.out.print(arr[i][j]+" ");
                }
                System.out.println();
            }
        }

        System.out.println("-----");

        // print rows except the ones having all elements as -1
        for(int i=0;i<arr.length;i++){
            boolean allMinusOne=true;
            for(int j=0;j<arr[i].length;j++){
                if(arr[i][j]!=-1){
                    allMinusOne=false;
                    break;
                }
            }
            if(!allMinusOne){
                for(int j=0;j<arr[i].length;j++){
                    System.out.print(arr[i][j]+" ");
                }
                System.out.println();
            }
        }

    }
}