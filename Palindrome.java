import java.util.*;
public class Palindrome{
    public static void main(String[] args){
        String str = "abcba";
        int n = str.length();
        for(int i=0;i<=n;i++){
            for(int j=n-1;j>=0;j--){
                if(str.charAt(i)==str.charAt(j)){
                    System.out.println("Is palindrome");
                }
            }
        }
    }
}