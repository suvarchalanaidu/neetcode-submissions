class Solution {
    public boolean isAnagram(String s, String t) 
    {
        if(s.length() != t.length())
        {
            return false;
        }
        HashMap<Character,Integer> countS = new HashMap<>();
        HashMap<Character,Integer> countT = new HashMap<>();

        //List<Character> list1 = new ArrayList(s);



        for(int i=0;i<s.length();i++)
        {
            char c= s.charAt(i); //s= "bba" charAt(2) a
            countS.put(s.charAt(i),countS.getOrDefault(c,0)+1); //put(key, value)
            //getOrDefault(key, 0) - If c exists in the map → return current count
            //countS.getOrDefault(c, 0) + 1
            //Adds one occurrence of character c
            //First time: 0 + 1 = 1
            //Subsequent times: increments existing count

//If c does NOT exist → return 0

            char d = t.charAt(i);
            countT.put(t.charAt(i),countT.getOrDefault(d,0)+1);
        }

        return countS.equals(countT);

    }
}
