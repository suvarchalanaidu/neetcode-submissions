class Solution {
public:
    vector<int> twoSum(vector<int>& nums, int target) 
    {
        unordered_map<int,int> hm;
        vector<int> result;

        for(int i=0;i<nums.size();i++)
        {
            int diff =  target -nums[i]; //7-3
            if(!hm.count(diff))
            {
                hm[nums[i]]=i;
            }
            else
            {
                result.push_back(hm[diff]);
                result.push_back(i);
                return result;
            }
        }
        return result;
        
    }
};
