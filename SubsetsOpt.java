import java.util.*;
public class SubsetsOpt{
    public static List<List<Integer>> subsets(int[] arr){
        List<List<Integer>> res=new ArrayList();
        getSubsets(res,new ArrayList(),0,arr);
        return res;
    }
    public static void getSubsets(List<List<Integer>> res,List<Integer> temp,int index,int[] arr){
        res.add(new ArrayList(temp));
        for(int i=index;i<arr.length;i++){
            temp.add(arr[i]);
            getSubsets(res,temp,index+1,arr);
            temp.remove(temp.size()-1);
        }
    }
    public static void main(String[] args){
        int[] arr={1,2,3};
        System.out.println(subsets(arr));
    }
}