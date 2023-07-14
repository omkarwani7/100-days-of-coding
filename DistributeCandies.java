// leetcode Q.575

class DistributeCandies {
    public int distributeCandies(int[] candyType) {
        HashSet<Integer> set = new HashSet<>();
        for(int i:candyType){
            set.add(i);
        }
        return Math.min(candyType.length/2, set.size());
    }
}