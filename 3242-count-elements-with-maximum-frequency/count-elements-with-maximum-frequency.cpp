class Solution {
public:
    int maxFrequencyElements(vector<int>& nums) {
        unordered_map<int,int>mpp;
        for(int i:nums)
        {
            mpp[i]++;
        }
        int p=INT_MIN;
        for(auto& i:mpp)
        {
            p=max(p,i.second);
        }
        int s=0;
        for(auto& i:mpp)
        {
            if(i.second==p)
            {
                s+=p;
            }
        }
        return s;
        
    }
};