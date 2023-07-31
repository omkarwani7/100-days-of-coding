// largest dearrangement of sequence
// ip- {5,4,3,2,1} op- {4,5,2,1,3}

import java.util.*;
public class LargestDearrangementOfSequence{
    public static void getDearr(int[] arr,int n){
        PriorityQueue<Integer> pq=new PriorityQueue(Collections.reverseOrder());
        for(int i=0;i<n;i++){
            pq.add(arr[i]);
        }
        int[] res=new int[n];
        for(int i=0;i<n;i++){
            int p=pq.peek();
            pq.remove();
            if(p!=arr[i] || i==n-1){
                res[i]=p;
            }
            else{
                res[i]=pq.peek();
                pq.remove();
                pq.add(p);
            }
        }        
        if(res[n-1]==arr[n-1]){
            res[n-1]=res[n-2];
            res[n-2]=arr[n-1];
        }
        for(int i=0;i<n;i++){
            System.out.print(res[i]+" ");
        }
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int[] arr= {5,4,3,2,1};
        int n=arr.length;
        getDearr(arr,n);
    }
}