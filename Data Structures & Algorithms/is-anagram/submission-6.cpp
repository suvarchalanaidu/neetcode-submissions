class Solution {
public:
    bool isAnagram(string s, string t) 
    {
        unordered_map<char,int> hm1; //unordered_map needs two template arguments, not one.
        unordered_map<char,int> hm2;
        for(char c:s)
        {
            hm1[c]++;
        }
        for(char d:t)
        {
            hm2[d]++;
        }

return hm1==hm2;
        
    }
};
