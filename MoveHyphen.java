import java.util.*;
public class MoveHyphen{
    public static String moveHyphen(String str){
        String res="";
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)=='-'){
                res=str.charAt(i)+res;
            }else{
                res=res+str.charAt(i);
            }
        }
        return res;
    }
    public static void main(String[] args){
        String str="str.Move-Hyphens-to-Front";
        System.out.println(moveHyphen(str));
    }
}