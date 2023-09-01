import java.util.*;
public class CountAnalogousArrays {
    public static void main(String[] args) {
        List<Integer> baseArray = new ArrayList<>();
        baseArray.add(-2);
        baseArray.add(-1);
        baseArray.add(-2);
        baseArray.add(5);
        int lower = 3;
        int upper = 10;
        int arrayMatches = 0;
        
        for(int i=lower; i<=upper; i++) {
            boolean match = false;
            int[] array = new int[baseArray.size() + 1];
            int matchCount = 0;
            for(int j = 0; j<=array.length-1; j++) {
                
                if(j == 0) {
                    array[j] = i;
                    continue;
                }
                    
                int matchValue = baseArray.get(j -1);
                
                for(int b=lower; b<=upper;b++) {
                    if(array[j-1] - b == matchValue) {
                        matchCount++;
                        array[j]=b;
                    }
                }
                    
            }
            if(matchCount == baseArray.size()) {
                arrayMatches++;
            }
        }
        System.out.println(arrayMatches);
    
    }
}
