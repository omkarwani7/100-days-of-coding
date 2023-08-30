

import java.util.*;
public class ChaechStringRotated{
    public static boolean checkRot(String a,String b,int k){
        if(a.length() != b.length()){
            return false;
        }
        String clock="";
        String anti="";
        int n=b.length();
        k=k%n;
    
        anti=anti+b.substring(n-k,n)+b.substring(0,n-k);
        clock=clock+b.substring(k)+b.substring(0,k);
    
        return (a.equals(anti) || a.equals(clock));
    }
    public static void main(String[] args){
        String str1="amazon";
        String str2="namazo";
        int k=7;
        System.out.println(checkRot(str1,str2,k));
    }
}