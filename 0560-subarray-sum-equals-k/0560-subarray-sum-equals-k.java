class Solution {
    public int subarraySum(int[] nums, int k) {
        int n= nums.length;
        if(n==0){
            return 0;
        }
        
        HashMap<Integer, Integer> map =new HashMap<>();
        int currSum = 0;
        int ans=0;
        
        for(int i=0; i<n;i++){
            currSum+=nums[i];
            
            if(currSum == k)
                ans++;
            
            if(map.containsKey(currSum-k)){
                ans+=map.get(currSum-k);
            }
            map.put(currSum, map.getOrDefault(currSum, 0) + 1);
        }
        return ans;
    }
}