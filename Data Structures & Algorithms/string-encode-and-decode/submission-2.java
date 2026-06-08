/*
Step 1: Append the count of string and separate strings using a delimiter
Step 2: We use StringBuilder a lot in this code, remember methods of StringBuilder
        sb.toString();
        sb.append();

        String methods like str.toCharArray();
        Integer.valueOf(sb.toString()); converts string or int to an integer -> needed for count of characters

        List method .add
Step 3: In the decode method , we convert string from encode to char array
Step 4: Append string if there is no delimiter
Step 5: append the value of count to i(current i) to get the string

*/
class Solution {

    public String encode(List<String> strs) 
    {
        StringBuilder sb = new StringBuilder();
        for(String s:strs)
        {
            sb.append(s.length());
            sb.append("#");
            sb.append(s);
        }
        System.out.println(sb.toString());
        return sb.toString();

    }

    public List<String> decode(String str) //"5#Hello5#World"
    {
        List<String> result = new ArrayList<>();
        char s_arr[] = str.toCharArray();//['5','#','H'---]

        for(int i=0;i<s_arr.length;i++)
        {
            StringBuilder sb1 = new StringBuilder(); //sb1=" "
            while(s_arr[i] != '#')
            {
                sb1.append(s_arr[i]); //sb1 = "5"
                i++;
            }
            i++; //important
            int count = Integer.valueOf(sb1.toString());
            int end = i+count; //5+2
            StringBuilder sb3 = new StringBuilder();
            while(i<end)
            {
                sb3.append(s_arr[i]);
                i++;
            }
            i--; //important
            result.add(sb3.toString());
        }
        return result;

    }
}
