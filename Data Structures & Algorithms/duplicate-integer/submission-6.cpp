class Solution {
public:
    bool hasDuplicate(vector<int>& nums) 
    {
        //plan to use set as set is about sorted and unique 
        unordered_set<int> hs;

        for(int i=0;i<nums.size();i++)
        {
            if(hs.count(nums[i])) 
            {
                return true;
            }
            else
            {
                hs.insert(nums[i]);
            }
        }
        return false;
    }
};