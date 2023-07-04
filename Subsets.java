import java.util.*;
public class Subsets{
    public static void getSubsets(String str,String ans,int i){
        if(i == str.length()){
            System.out.println(ans);
            return;
        }
        //yes choice
        getSubsets(str,ans+str.charAt(i),i+1);
        //no choice
        getSubsets(str,ans,i+1);
    }
    public static void main(String[] args){
        String str = "abc";
        getSubsets(str," ",0);
    }
}