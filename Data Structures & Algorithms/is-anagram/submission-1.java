class Solution {
    public boolean isAnagram(String s, String t) 
    {
        if(s.length() != t.length())
        {
            return false;
        }
        HashMap<Character,Integer> s_map = new HashMap<>();
        HashMap<Character,Integer> t_map = new HashMap<>();
        for(char c: s.toCharArray())
        {
            s_map.put(c, s_map.getOrDefault(c,0)+1);
        }
        for(char d: t.toCharArray())
        {
            t_map.put(d, t_map.getOrDefault(d,0)+1);
        }
        return s_map.equals(t_map);
        
    }
}
