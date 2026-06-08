class Solution {
    public int[] productExceptSelf(int[] nums) 
    {
        //int forward_arr[4] ={0,0,0,0};
        int n = nums.length;
        int forward_arr[] = new int[n];
        int reverse_arr[] = new int[n];
        int result[] = new int[n];

        forward_arr[0] = 1;
        for(int i=1;i<n;i++)
        {
            forward_arr[i] = forward_arr[i-1]*(nums[i-1]);
            
        }
        reverse_arr[n-1] = 1;
        for(int j= n-2;j>=0;j--)
        {
            reverse_arr[j] = reverse_arr[j+1]*(nums[j+1]);
        }
        

        for(int z=0;z<n;z++)
        {
            result[z] = forward_arr[z] * reverse_arr[z];
        }

        return result;
    }
}  
