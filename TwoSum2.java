// leetocde Q. 167

class TwoSum2 {
    public int[] twoSum(int[] numbers, int target) {
        int a = 0;
        int b = numbers.length-1;
        while(a <= b){
            int sum = numbers[a]+numbers[b];
            if(sum > target){
                b--;

            }else if(sum < target){
                a++;

            }else{
                return new int[] {a+1,b+1};
            }
        }
        return new int[] {a+1,b+1};
    }
}