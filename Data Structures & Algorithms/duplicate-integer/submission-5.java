class Solution {
    public boolean hasDuplicate(int[] nums) 
    {
        // brute-force compare with each other element in array O(n) this should be done with every other element
        // time -O(n^2) space - O(1)
        // sorting and doing it- takes extra complexity time O(n log n) space O(1)
        // little extra memory better time complexity using hashset time O(n) space O(n)


//this is a "hashset" problem not a hashmap
// hashset stores unique values
// we dont need a key -> value here
        HashSet<Integer> numbers = new HashSet<>();

        for(int i=0;i< nums.length ; i++)  //or  for(int n:nums)
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

/*
HashSet<Integer> hs = new HashSet();
for(int i:nums)  // worst case n times
{

if(hs.contains(i) //O(1)
{
return true;
}

hs.add(i); //O(1) // IF NO DUPLICATES O(N*1) = O(n)

}
return false;
Time complexity is O(n) since each element is processed once with 
constant-time HashSet operations. Space complexity is O(n) due to storing seen elements.*/ 