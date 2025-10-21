class Solution {
    public int majorityElement(int[] nums) {
        //IT WORKS BUT IT IS BRUTE FORCE
        // int n=nums.length;
        // int count[] =new int[n];
        // for(int i=0 ; i < n;i++)
        // {
        //     for(int j=0;j<n;j++)
        //     {
        //         if(nums[i]==nums[j])
        //         {
        //             count[i]++;
        //         }
        //     }
        // }
        // int maxc=count[0],maxind=0;
        // for(int i=0;i<n;i++)
        // {
        //     if(maxc<count[i])
        //     {
        //         maxc=count[i];
        //         maxind=i;
        //     }
        // }
        // return nums[maxind];
        //BELOW IT WORKS WITH ONLY ONE LOOP
        int c=0,cand=0;
        for(int num:nums)
        {
            if(c==0)
            {
                cand=num;
            }
        c+= (num==cand) ? 1 :-1;
        }
        return cand;
    }
}