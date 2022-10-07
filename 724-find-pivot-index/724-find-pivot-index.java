class Solution {
    public int pivotIndex(int[] nums) {
        int sum=Arrays.stream(nums).reduce(0, (a, b) -> a + b);
        int lsum=0;
        int rsum=sum;
        for(int i=0; i<nums.length; i++){
            rsum-= nums[i];
            
            if(lsum==rsum){
                return i;
            }
            else{
                lsum+=nums[i];
            }
        }
        return -1;
        
    }
}