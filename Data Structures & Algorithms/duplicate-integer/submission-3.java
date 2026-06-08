class Solution {
    public boolean hasDuplicate(int[] nums) 
    {
        // brute-force compare with each other element in array O(n) this should be done with every other element
        // time -O(n^2) space - O(1)
        // sorting and doing it- takes extra complexity time O(n log n) space O(1)
        // little extra memory better time complexity using hashset time O(n) space O(n)

        HashSet<Integer> numbers = new HashSet<>();

        for(int i=0;i< nums.length ; i++)
        {
            if(!numbers.contains(nums[i]))
            {
                numbers.add(nums[i]);
            }
            else
            {
                return true;
            }
        }
        return false;
      

    }
     
}