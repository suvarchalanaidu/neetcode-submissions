class Solution {
    public int maxArea(int[] heights) 
    {
        int a_ptr = 0;
        int b_ptr = (heights.length)-1;
        System.out.print(b_ptr);
        int max_amount = 0;
        int area =0;

        while(a_ptr < b_ptr)
        {
            area = (b_ptr - a_ptr) * Math.min (heights[a_ptr],heights[b_ptr]);
            max_amount = Math.max(area,max_amount);
            if(heights[a_ptr] < heights[b_ptr])
            {
                a_ptr++;
            }
            else
            {
                b_ptr--;
            }
        }
        return max_amount;
        
    }
}
