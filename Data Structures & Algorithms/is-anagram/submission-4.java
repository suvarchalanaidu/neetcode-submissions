class Solution {
    public boolean isAnagram(String s, String t) 
    {
        int[] alphabets = new int[26];
        if(s.length() != t.length())
        {
            return false;
        }

        for(int i=0;i<s.length();i++) //you tend to forget length() bracs here
        {
            alphabets[s.charAt(i)- 'a']++;
            alphabets[t.charAt(i)- 'a']--;
        }

        for(int sum:alphabets)
        {
            if(sum!=0)
            {
                return false;
            }
        }
        return true;

    }
}
