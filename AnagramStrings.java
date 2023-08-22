import java.util.*;
public class AnagramStrings{
    public static boolean checkAnagram(String s,String t){
        if(s.length()!=t.length()){
            return false;
        }
        HashMap<Character,Integer> map=new HashMap<>();
        for(int i=0;i<s.length();i++){
            if(map.containsKey(s.charAt(i))){
                map.put(s.charAt(i),map.get(s.charAt(i))+1);
            }else{
                map.put(s.charAt(i),1);
            }
        }
        for(int i=0;i<t.length();i++){
            if(map.containsKey(t.charAt(i))){
                map.put(t.charAt(i),map.get(t.charAt(i))-1);
            }else{
                return false;
            }
        }
        Set<Character> set=map.keySet();
        for(char key:set){
            if(map.get(key)!=0){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args){
        String s="listen";
        String t="silent";
        System.out.println(checkAnagram(s,t));
    }
}