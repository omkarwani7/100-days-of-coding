import java.io.*;
 
class ArrayDistinctElements {
 
    static void printDistinct(int arr[], int n)
    {
        for (int i = 0; i < n; i++)
        {
            int j;
            for (j = 0; j < i; j++)
            if (arr[i] == arr[j])
                break;
            if (i == j)
            System.out.print( arr[i] + " ");
        }
    }
    
    public static void main (String[] args)
    {
        int arr[] = {1,1,2,2,3};
        int n = arr.length;
        printDistinct(arr, n);
 
    }
}