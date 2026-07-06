class Solution {
public:
    vector<vector<int>> threeSum(vector<int>& nums) 
    {
        int n=nums.size(); //6
        //int total = 0;
        vector<vector<int>> res;
        sort(nums.begin(),nums.end()); // -4 -1 -1 0 1 2

        for(int i=0;i<=(n-3);i++)
        {
            if(i>0 && nums[i] == nums[i-1]) continue; //this also I forget
            int l = i+1; //l=1
            int r = n-1; //r=5

            while(l < r)
            {
                int total = nums[i] + nums[l] +nums[r]; //-3
                if(total ==0)
            {
                res.push_back({nums[i],nums[l],nums[r]});
                r--;
                l++; //I always forget to move both pointer which results in infirnite loop

                while(l<r && (nums[l] == nums[l-1]))
                {
                    l++;
                }
                while(l<r && (nums[r] == nums[r+1]))
                {
                    r--;
                }//i also forget to add this duplicate check two while loops here
            }

            else if(total <0) //
            {
                l++; //r value=1
            }

            else
            {
              r--;
            }
            }
           

            //total = nums[i] + nums[l] +nums[r]; //-4
        }
        return res;
    }
};
