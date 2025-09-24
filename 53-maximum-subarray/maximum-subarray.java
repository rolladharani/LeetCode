class Solution {
    public int maxSubArray(int[] nums) {
        int max_sum_so_far=nums[0],max_sum=nums[0];
        for(int i=1;i<nums.length;i++)
        {
            max_sum_so_far=Math.max(nums[i],nums[i]+max_sum_so_far);
            max_sum=Math.max(max_sum_so_far,max_sum);
        }
        return max_sum;
    }
}