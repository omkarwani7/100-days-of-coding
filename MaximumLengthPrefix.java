// Maximum length prefix of one string that occurs as subsequence in another

import java.util.*;
public class MaximumLengthPrefix{
    public static int maxPrefix(String s,String t){
        int count=0;
        for(int i=0;i<t.length();i++){
            if(count==s.length()){
                break;
            }
            if(t.charAt(i)==s.charAt(count)){
                count++;
            }
        }
        return count;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String s="digger";
        String t="biggerdiagram";
        System.out.println(maxPrefix(s,t));
    }
}