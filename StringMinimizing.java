import java.util.*;
public class StringMinimizing{
    public static void main(String[] args){
        String str="aabcccabba";
        System.out.println(getMinLength((str)));
    }
    public static int getMinLength(String str){
        int n=str.length();
        StringBuilder sb=new StringBuilder();
        String s1="";
        String s2="";
        for(int i=0;i<n;i++){
            if(i<n/2){
                s1+=str.charAt(i);
            }else{
                s2+=str.charAt(i);
            }
        }
        sb.append(s2);
        sb.append(s1);
        System.out.println(sb.toString());
        
        // System.out.println(i);
        getString(sb.toString());
        System.out.println();
        
        return 0;
    }
    public static void getString(String s){
        int n=s.length();
        int i=n/2-1;
        int j=n/2+1;
        String res;
        while(i<=0 && j<n){
            if(s.charAt(i)==s.charAt(j)){
                s=s.substring(0,i)+s.substring(j);
                getString(s);
                System.out.println(s);
            }else{
                System.out.println(s);
            }
        }
        // return s;
    }
}