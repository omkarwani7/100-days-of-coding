import java.util.*;
public class SeparateCamelCase{
    public static void separateStr(String str){
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)>='A' && str.charAt(i)<='Z'){
                String sub=str.substring(0,i);
                System.out.println(sub);
                separateStr(str.substring(i+1));
                break;
            }
        }
    }
    public static void main(String[] args){
        String str="helloMyNameIsXyz";
        separateStr(str);
    }
}