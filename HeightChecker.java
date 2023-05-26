class HeightChecker {
    public int heightChecker(int[] heights) {
        int[] exp = heights.clone();
        Arrays.sort(exp);
        int ans = 0;
        for(int i=0;i<heights.length;i++){
            if(exp[i]!=heights[i]){
                ans++;
            }
        }return ans;
    }
}