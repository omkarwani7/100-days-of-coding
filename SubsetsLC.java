// leetcode Q. 78

import java.util.*;
class SubsetsLC{
    public static List<List<Integer>> subsets(int[] nums){
        List<List<Integer>> res = new ArrayList();
        getSubsets(0,nums,new ArrayList(),res);
        return res;
    }

    static void getSubsets(int index,int[] nums,List<Integer> temp,List<List<Integer>> res){
        res.add(new ArrayList(temp));
        for(int i=index;i<nums.length;i++){
            temp.add(nums[i]);
            getSubsets(i+1,nums,temp,res);
            temp.remove(temp.size()-1);
        }
    }

    public static void main(String[] args){
        int[] nums = {1,2,3};
        System.out.println(subsets(nums));
    }
}