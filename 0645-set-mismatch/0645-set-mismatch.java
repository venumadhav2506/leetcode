class Solution {
    public int[] findErrorNums(int[] nums) {
        Arrays.sort(nums);
       int n=nums.length;
        int tsum = n*(n+1)/2;
        int repeated=0;
        int sum =nums[0];
        int count=0;
        for(int i=1;i<n;i++){
        if(nums[i-1]==nums[i]){
            count++;
            repeated=nums[i];
        }
        sum = sum+nums[i];
           
    }
        
        int mnum = tsum -(sum-repeated);
        return new int[]{repeated,mnum};
    }
}