//HASHMAP - TC- O(n)
class Solution {
    public boolean isAnagram(String s, String t) 
    {   
        Map<Character,Integer> map = new HashMap<>();
        for(char ch : s.toCharArray()) //O(n)
        {
            map.put(ch,map.getOrDefault(ch,0)+1); //O(1)
        }
        for(char ch : t.toCharArray()) //O(n)
        {
            map.put(ch,map.getOrDefault(ch,0)-1); //O(1)
        }
        for(int n : map.values()) //O(n)
        {
            if(n != 0)
            {
                return false;
            }
        }
        return true;
    }
}

//Array TC- O(n) less space
// since Alphabets only have 26 characters we can get away with an array
class Solution {
    public boolean isAnagram(String s, String t) 
    {   
        int[] count = new int[26];
        if(s.length() != t.length())
        {
            return false;
        }
        for(int i =0;i<s.length();i++)
        {
            count[s.charAt(i) - 'a']++;
            count[t.charAt(i) - 'a']--;
        }
        for(int n : count)
        {
            if(n != 0)
            {
                return false;
            }
        }
        return true;
    }
}
