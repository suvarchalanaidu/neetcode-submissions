class Solution {
public:
    bool isAnagram(string s, string t) //pass by valus O(n)
    {
        sort(t.begin(),t.end()); //I first only sorted one of the strings and it modifies the original string
        sort(s.begin(),s.end());
        if(s==t)
        {
            return true;
        }
        else
        {
            return false;
        }
        
    }


};

//sort complexity is O(nlogn)
//sort(s.begin(), s.end()) → another O(n log n).
//s == t → O(n) 
// O(n log n) + O(n log n) + O(n) = O(n log n) overall