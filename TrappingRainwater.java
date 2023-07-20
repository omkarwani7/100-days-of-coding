import java.util.*;
public class TrappingRainwater{
    
    public static int getMinOperations(String series){
        int count = 0;
        for(int i=0;i<=series.length();i++){
            // char x = series.charAt(i);
            while(series.length()>0){
            if(series.charAt(i) == series.charAt(i++)){
                series = series.substring(0,i-1) + series.substring(i+1,series.length());
                count++;
                getMinOperations(series);
                
            }
        }
        }return count;
        // HashMap<Character,Character> map = new HashMap<>();
        // for(int i=0;i<series.length();i++){
        //     if(map.containsKey(series.charAt(i))){

        //     }
        // }
    }
    public static void main(String[] args){
        String series = "aabbaa";
        System.out.println(getMinOperations(series));
    }
}