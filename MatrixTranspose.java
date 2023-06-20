// code to find transpose of matrix

public class MatrixTranspose{  
    public static void main(String args[]){  
    int original[][]={{1,2,3},{8,4,6},{9,5,7}};    
    
    for(int i=0;i<3;i++){    
        for(int j=0;j<3;j++){    
            System.out.print(original[i][j]+" ");    
        }    
        System.out.println();
    }    
    System.out.println("--------");
    for(int i=0;i<3;i++){    
        for(int j=0;j<3;j++){
            System.out.print(original[j][i]+" ");
        }
    System.out.println();
            }
        }
    }
    
    