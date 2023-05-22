class ContainerWithMostWater {
    public int maxArea(int[] height) {
        int water = 0; 
        int right = height.length-1; 
        int left = 0;
        while(left < right){
            water = Math.max(water, Math.min(height[left], height[right]) * (right - left));
            if(height[left] > height[right]){
                right--;
            }else{
                left++;
            }
        }
        return water;
    }
}