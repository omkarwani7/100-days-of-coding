// leetcode Q. 448

class NoDisappearArray {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        List<Integer> list = new ArrayList<>();
        for(int i=0;i<nums.length;i++){
            int index=Math.abs(nums[i])-1;
            if(nums[index]>0){
                nums[index]=nums[index]*-1;
            }
        }
        for(int i=0;i<nums.length;i++){
            if(nums[i]>0){
                int elemtmissing=i+1;
                list.add(elemtmissing);
            }
        }
        return list;

    }
}