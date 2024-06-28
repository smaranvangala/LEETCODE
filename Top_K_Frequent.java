class Solution {
  
    public int[] topKFrequent(int[] nums, int k) {
       Map<Integer,Integer> map = new HashMap<>();
       List<Integer>[] bucket = new List[nums.length+1];

       for(int num: nums)
       {
           map.put(num,map.getOrDefault(num,0)+1);
       }

       for(int key: map.keySet())
       {
           int freq = map.get(key);
           if(bucket[freq] == null)
           {
               bucket[freq] = new ArrayList<>();
           }
           bucket[freq].add(key);
       }

       int[] res = new int[k];
       int index = 0;
       for(int pos = bucket.length-1;pos>=0;pos--)
       {
           if(bucket[pos] != null)
           {
               for(int num : bucket[pos])
               {
                   res[index] = num;
                   index++;
                   if(index >=k) break;
               }
           }
           if(index >= k) break;
       }
       return res;

   }
}