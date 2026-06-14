class Solution {
public:
    vector<vector<int>> threeSum(vector<int>& nums) 
    {
        vector<vector<int>> result;
        int n = nums.size();

        // Step 1: Sort the array
        // This enables two pointer technique and makes duplicate detection easy
        // [-1, 0, 1, 2, -1, -4] → [-4, -1, -1, 0, 1, 2]
        sort(nums.begin(), nums.end());

        // Step 2: Fix the first element with outer loop
        // Stop at n-2 because we need at least 3 elements: i, j, k
        // Example: for array of size 6, i goes from 0 to 3
        for(int i = 0; i < n-2; i++)
        {
            // Step 3: Skip duplicate values for i
            // Compare BACKWARDS (i-1) not forwards
            // Reason: we already processed this value in the previous iteration
            // Example: [-1, -1, 0, 1] → when i=1, nums[1]==-1==nums[0], skip
            // i>0 guard prevents out-of-bounds on first iteration
            if(i > 0 && nums[i] == nums[i-1]) continue;

            // Two pointers: j starts just after i, k starts at the end
            int j = i + 1;
            int k = n - 1;

            // Step 4: Two pointer search for remaining two elements
            while(j < k)
            {
                int total = nums[i] + nums[j] + nums[k];

                if(total < 0)
                {
                    // Sum too small → need a bigger number → move left pointer right
                    // Works because array is sorted: moving j right increases total
                    j++;
                }
                else if(total > 0)
                {
                    // Sum too big → need a smaller number → move right pointer left
                    // Works because array is sorted: moving k left decreases total
                    k--;
                }
                else
                {
                    // Found a valid triplet
                    result.push_back({nums[i], nums[j], nums[k]});

                    // Move both pointers inward to search for next triplet
                    j++;
                    k--;

                    // Step 5: Skip duplicate values for j
                    // Compare to j-1 (where j just came from) not j+1
                    // Reason: after j++, if new nums[j] == nums[j-1], it's the same
                    // value we just used → would produce duplicate triplet
                    // Example: [-2, 0, 0, 2, 2] after pushing {-2,0,2} and j++ 
                    // j is now at index 2 (value 0), nums[j-1] is also 0 → skip
                    while(j < k && nums[j] == nums[j-1]) j++;

                    // Step 6: Skip duplicate values for k
                    // Compare to k+1 (where k just came from) not k-1
                    // Reason: after k--, if new nums[k] == nums[k+1], it's the same
                    // value we just used → would produce duplicate triplet
                    // Example: [-2, 0, 0, 2, 2] after pushing {-2,0,2} and k--
                    // k is now at index 3 (value 2), nums[k+1] is also 2 → skip
                    while(j < k && nums[k] == nums[k+1]) k--;
                }
            }
        }

        return result;
    }
};

/*
PATTERN: 3Sum = Sort + Fix one element + Two Pointer on the rest

RECOGNITION SIGNAL:
→ Find triplets / pairs that sum to a target in an unsorted array → Sort + Two Pointer

TIME COMPLEXITY:  O(n²)
→ Sorting is O(n log n)
→ Outer loop O(n) × inner two pointer O(n) = O(n²) dominates
→ O(n²) is the theoretical lower bound — cannot be optimized further

SPACE COMPLEXITY: O(1)
→ No extra data structures used
→ Result vector is output, does not count as extra space

KEY RULES TO REMEMBER:
1. Always sort first — enables two pointer and duplicate skipping
2. Outer loop goes to n-2, not n — need 3 elements minimum
3. Duplicate skip for i: compare BACKWARDS → nums[i] == nums[i-1]
4. Duplicate skip for j: compare BACKWARDS → nums[j] == nums[j-1] (after j++)
5. Duplicate skip for k: compare FORWARDS  → nums[k] == nums[k+1] (after k--)
6. The golden rule: after moving a pointer, always compare against
   where it came from, not where it is going

VARIANTS OF THIS PATTERN:
→ Two Sum (sorted)     : same idea, no outer loop, just two pointers
→ 4Sum                 : add one more outer loop, same two pointer inside
→ 3Sum Closest         : same structure, track minimum difference instead
*/