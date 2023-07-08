import java.util.*;
public class Base17{
    public static void main(String[] args){
        HashMap<Character,Integer> map = new HashMap<>();
        map.put('A',10);
        map.put('B',11);
        map.put('C',12);
        map.put('D',13);
        map.put('E',14);
        map.put('F',15);
        map.put('G',16);
        String str = "23GF";
        int num=0;
        int j=0;
        for(int i=str.length()-1;i>=0;i--){
            if(str.charAt(i)>='A' && str.charAt(i)<='Z'){
                num = num + map.get(str.charAt(i))*(int)Math.pow(17,j++);
            }else{
                num = num + ((str.charAt(i)-'0')*(int)Math.pow(17,j++));
            }
        }
        System.out.println(num);
    }
}