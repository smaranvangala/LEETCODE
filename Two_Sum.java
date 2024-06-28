//HASHMAP - TC -O(n)
class Solution {

    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer> container = new HashMap<>();
        for(int i =0 ;i<nums.length;i++)
        {
            int diff = target-nums[i];
            if(container.containsKey(diff))
            {
                return new int[]{container.get(diff),i};
            }
            container.put(nums[i],i);
        }
        return new int[]{};
    }
}