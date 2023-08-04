import java.util.*;
public class ReverseWordsInString{
    public static String getReverse(String s){
        String[] str=s.split("\\s+");
        StringBuilder sb=new StringBuilder("");
        for(int i=str.length-1;i>=0;i--){
            sb.append(str[i]);
            sb.append(" ");
        }
        return sb.toString().trim();
    }
    public static void main(String[] args){
        String s=" blue is the  sky  ";
        System.out.println(getReverse(s));
    }
}