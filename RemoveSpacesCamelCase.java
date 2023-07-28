// given a sentence,task is to remove spaces and rewrite it in camel case.
// I got to intern at iamNeo  op= IGotToInternAtIAmNeo

import java.util.*;
public class RemoveSpacesCamelCase{
    public static String getCamelCase(String str){
        int i=0;
        while(true){
            i=0;
            while(i<str.length()){
                if(str.charAt(i)==' '){
                    char nextchar=Character.toUpperCase(str.charAt(i+1));
                    str=str.substring(0,i)+nextchar+str.substring(i+2);
                    break;
                }
                i++;
            }
            if(i==str.length()){
                break;
            }
        }
        return str;
    } 
    public static void main(String[] args){
        String s="I got to intern at iamNeo";
        System.out.println(getCamelCase(s));
    }
}