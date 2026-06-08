class Solution {
    public int[] twoSum(int[] numbers, int target) 
    {
        int left_pointer = 0;
        int right_pointer = numbers.length-1;

        while(left_pointer < right_pointer)
        {
            if(numbers[left_pointer] + numbers[right_pointer] == target)
            {
                return new int[]{left_pointer+1,right_pointer+1};
            }

            else if (numbers[left_pointer] + numbers[right_pointer] > target)
            {
                right_pointer--;
            }

            else if (numbers[left_pointer] + numbers[right_pointer] < target)
            {
                left_pointer++;
            }
        }
        return new int[]{0};
        
    }
}
