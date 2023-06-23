import java.util.*;
public class Panagram{
    public static boolean isPanagram(String str){
        boolean[] mark = new boolean[26];
        int index = 0;
        for(int i=0;i<str.length();i++){
            if(str.charAt(i) >= 'A' && str.charAt(i) <= 'Z'){
                index = str.charAt(i) - 'A';
            }else if(str.charAt(i) >= 'a' && str.charAt(i) <= 'z'){
                index = str.charAt(i) - 'a';
            }else{
                continue;
            }mark[index] = true;
    }
    for(int i=0;i<=25;i++){
        if(mark[i] == false){
            return false;
        }
        
    }
    return true;
}   
    public static void main(String[] args){
        String str = "The quick brown fox jumps over the lazy dog";
        if(isPanagram(str) == true){
            System.out.println("Is panagram");
        }else{
            System.out.println("Not a panagram");
        }
    }
}