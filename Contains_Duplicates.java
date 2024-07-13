/*Double for Loop - Brute Force
Intuition - run the loop one for the first pointer and run the second loop 
for the next pointer, if the values of two pointers are the same we return true else, we return false 

Time Complexity - O(n^2) 
O(n)*O(n) for each loop for traversing*/
class Solution {
    public boolean hasDuplicate(int[] nums) {
        for(int i = 0;i<nums.length;i++)
        {
            for(int j = i+1;j<nums.length;j++)
            {
                if(nums[i] == nums[j])
                {
                    return true;
                }
            }
        }
        return false;
    }
}



/*HASH-SET  - Optimal
Instead of traversing two times we can add "O(1)" the numbers to hashset.
If we encounter the number which we already put in the hashset we return true

Time Complexity - O(n)
for traversing the array once*/

class Solution 
{
    public boolean containsDuplicate(int[] nums)
    {
        Set<Integer> myset = new HashSet<>();
        for(int i : nums)
        {
            if(myset.contains(i))
            {
                return true;
            }
            myset.add(i);
        }
        return false;
    }
}

/*HashMap
Intuition - We put the encountered number in the map and its corresponding occurrence 
if the occurrence is more than one we return true;
*/
class Solution 
{
    public boolean containsDuplicate(int[] nums)
    {
        Map<Integer,Integer> map = new HashMap<>();

        for(int n : nums)
        {
            if(map.containsKey(n) && map.get(n) >= 1)
            {
                return true;
            }
            map.put(n,map.getOrDefault(n,0)+1);
        }
        return false;
    }
}
