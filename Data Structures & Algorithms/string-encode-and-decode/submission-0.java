class Solution 
{
    public String encode(List<String> strs) 
    {
        StringBuilder sb = new StringBuilder();
        for(String s:strs) // "Hello"
        {
            sb.append(s.length()); //5
            sb.append("#"); //5#
            sb.append(s); //5#Hello
        }
        return sb.toString(); //returning string
    }

    public List<String> decode(String str) 
    {
        List<String> result = new ArrayList<>();
        //convert the incoming string to char array
        char str_array[] = str.toCharArray(); //['5','#',"H","e"-------]

        for(int i=0;i<str_array.length;i++) //5Hello
        {
            StringBuilder sb = new StringBuilder(); //sb= " "
            while(str_array[i] != '#')  //'5' != '#' -> true
            {
               
               sb.append(str_array[i]); 
               i++; // 5 is appended to sb => sb="5"
               // i is now 1 while runs again but as it becomes false i++ next is performed  
            }
            i++; // i=2
                int count = Integer.valueOf(sb.toString());  //5 as an integer
                int end = i+count;
                StringBuilder sb1 = new StringBuilder();
                while(i<end)
                {
                    sb1.append(str_array[i]);
                    i++;
                }

                i--;
                result.add(sb1.toString());
        }

       return result;
    }
    
}
