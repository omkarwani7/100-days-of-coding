import java.util.*;
public class PrintString{
    public static String getString(String s1,String s2){
        HashMap<Character,Integer> map=new HashMap<>();
        StringBuilder sb=new StringBuilder();
        // HashMap<String,Integer> map2=new HashMap<>();
        for(int i=0;i<s1.length();i++){
            if(map.containsKey(s1.charAt(i))){
                map.put(s1.charAt(i),map.get(s1.charAt(i))+1);
            }else{
                map.put(s1.charAt(i),1);
            }
        }
        for(int i=0;i<s2.length();i++){
            if(map.containsKey(s2.charAt(i))){
                map.put(s2.charAt(i),map.get(s2.charAt(i))-1);
            }else{
                map.put(s2.charAt(i),1);
            }
        }
        for(Map.Entry<Character,Integer> entry:map.entrySet()){
            char key=entry.getKey();
            int val=entry.getValue();
            if(val<=3){
                sb.append(key);
            }
        }
        return sb.toString();
        // for(Map.Entry<String,Integer> entry2:map2.entrySet()){
        //     int key2=entry2.getKey();
        //     int val2=entry2.getValue();
        // }
    }
    public static void main(String[] args){
        String s1="abbabababa";
        String s2="aaabbbabb";
        System.out.println(getString(s1,s2));
    }
}