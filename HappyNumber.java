// leetcode Q. 202
import java.util.*;
class HappyNumber {
    public boolean isHappy(int n) {
        HashSet<Integer> set = new HashSet<>();
        while(n != 1 && !set.contains(n)){
            set.add(n);
            n = getNextNum(n);
        }
        return n==1;
    }    

        public int getNextNum(int n){
            int totalsum = 0;
            while(n>0){
                int temp = n % 10;
                n = n / 10;
                totalsum += temp * temp;
            }
            return totalsum;
        
    }
}