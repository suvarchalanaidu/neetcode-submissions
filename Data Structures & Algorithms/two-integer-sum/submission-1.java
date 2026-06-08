class Solution {
    public int[] twoSum(int[] nums, int target) 
    {
        for(int i=0; i<nums.length;i++)
        {
            for(int j=i+1;j<nums.length;j++)  //.length only not length() as this is not a string
            {
                if(nums[i]+ nums[j] == target)
                {
                    return new int[]{i,j};
                    /*“I want these values in order”
                    This is an array initializer.
                    int[] a = new int[]{5, 7};
                    Java does:
                    Count values → size = 2
                    Put 5 in box 0
                    Put 7 in box 1
                    Result:
                    [5, 7]*/
                }
            }
        }
        return new int[]{0};
    }
}
