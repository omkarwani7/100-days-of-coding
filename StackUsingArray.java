import java.util.*;
 class StackUsingArray{
    int arr[] = {1,2,3,4};
    int n = arr.length;

    static int top = -1;
    static boolean isEmpty(){
        if(top == -1){
            return;
        }
    }
    static int push(int x){
        if(top >= n-1 ){
            System.out.println("Stack full");
            return;
        }else{
            arr[top] = x;
            top++;
            System.out.println("1st element of stack is -" + x);
            return;
        }

    }
    static int pop(){
        if(top < 0){
            System.out.println("stack empty");
            return;
        }else{
            int x = arr[top];
            System.out.println("popped element is -"+ x);
        }
    }


    public static void main(String[] args){
        Stack<Integer> stack = new Stack<>();
        
    }
 }