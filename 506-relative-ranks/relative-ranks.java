class Solution {
    public String[] findRelativeRanks(int[] score) {
        int n=score.length;
        String ans[]=new String[n];
        Integer ind[]=new Integer[n];
        for(int i=0;i<n;i++)
        {
            ind[i]=i; // [0,1,2,3,4]
        }
        //Sort the Indices [0,3,2,4,1]
        Arrays.sort(ind,(a,b) -> score[b]-score[a]);
        
        for(int i=0;i<n;i++)
        {
            if(i==0)
            {
                ans[ind[i]]="Gold Medal";
            }
            else if(i==1)
            {
                ans[ind[i]]="Silver Medal";
            }
            else if(i==2)
            {
                ans[ind[i]]="Bronze Medal";
            }
            else
            {
                ans[ind[i]]=String.valueOf(i + 1);
            }
        }
        return ans;
        
    }
}