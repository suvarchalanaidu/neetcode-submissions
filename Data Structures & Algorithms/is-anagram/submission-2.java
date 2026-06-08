class Solution {
    public boolean isAnagram(String s, String t) {
        int[] smallAlphabets = new int[26];

        if(s.length() != t.length())
        {
            return false;
        }
        for(int i=0;i<s.length();i++)
        {
            smallAlphabets[s.charAt(i) -'a']++;
            smallAlphabets[t.charAt(i) -'a']--;
        }

        for(int sa:smallAlphabets)
        {
            if(sa!=0)
            {
                return false;
            }
        }
        
        return true;
    }
}
