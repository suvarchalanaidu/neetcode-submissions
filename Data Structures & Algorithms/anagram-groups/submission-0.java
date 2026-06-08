class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        //char[] strs_array = new char[]();
        //Anagrams become identical when their characters are sorted.
        // list, map is a collection
        List<List<String>> result = new ArrayList<>(); //List<List<String>> is the return type expected
        HashMap<String,List<String>> map = new HashMap<>();
       
        for(String s:strs)
        {
            char string_array[] = s.toCharArray(); 
            Arrays.sort(string_array); 
            String sorted_char = new String(string_array);

            if(map.containsKey(sorted_char) == false)
            {
                map.put(sorted_char, new ArrayList<>());
            }
            map.get(sorted_char).add(s);
        }

        for(List<String> group : map.values())
        {
            result.add(group);
        }
        //or use result.addAll(map.values()); instead of above
        return result;

    }
}
