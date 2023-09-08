// You are using Java
import java.util.*;
public class ShortestString{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        // String s1=sc.nextLine();
        // String s2=sc.nextLine();
        String s1="LPEnIHKqQI";
        String s2="axYfGVbEnW";
        HashSet<Character> set=new HashSet<>();
        for(int i=0;i<s1.length();i++){
            set.add(s1.charAt(i));
        }
        for(int i=0;i<s2.length();i++){
            set.add(s2.charAt(i));
        }
        int count=0;
        for(char ch:set){
            System.out.print(ch+" ");
            count++;
        }
        System.out.println(count);
    }
}