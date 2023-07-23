import java.util.*;
public class ProductOfArrayExceptSelf{
    public static int[] productExceptSelf(int[] nums){
        int n=nums.length;
        int[] res = new int[n];

        int product=1;
        for(int i=0;i<n;i++){
            product *= nums[i];
            res[i] = product;
        }

        product=1;
        for(int i=n-1;i>0;i--){
            res[i] = res[i-1]*product;
            product *= nums[i];
        }

        res[0] = product;
        return res;
    }

    public static void main(String[] args){
        int[] nums = {1,2,3,4};
        for(int i=0;i<productExceptSelf(nums).length;i++){
            System.out.print(productExceptSelf(nums)[i]+" ");
        }
    }
}