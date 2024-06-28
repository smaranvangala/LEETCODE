//TC - O(n.k log k)
class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String,List<String>> map = new HashMap<>();
        for(String word : strs)
        {
            char[] ch = word.toCharArray();
            Arrays.sort(ch);
            String sorted_word = new String(ch);
            if(!map.containsKey(sorted_word))
            {
                map.put(sorted_word, new ArrayList<>());
            }
            map.get(sorted_word).add(word);
        }
        return new ArrayList<>(map.values());
    }
}
