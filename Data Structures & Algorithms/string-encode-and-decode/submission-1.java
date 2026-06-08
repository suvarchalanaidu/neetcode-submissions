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
        return sb.toString();
    }

    public List<String> decode(String str) //5#Hello5#World
    {
        List<String> result = new ArrayList<>();
        char s_array[] = str.toCharArray(); //['5','#','H'---]
        for(int i=0;i<s_array.length;i++)
        {
            StringBuilder sb1 = new StringBuilder(); //sb1 = " "
            while(s_array[i]!= '#') //5 => i=1
            {
                sb1.append(s_array[i]);
                i++;
            }
            i++; //skips '#' sb1="5"

            int count = Integer.valueOf(sb1.toString()); //count = 5
            int end = i+count; //2..5 end = 2+5 = 7
            StringBuilder sb2 = new StringBuilder(); 
            while(i<end) //2<7
            {
               
                sb2.append(s_array[i]); //Hello
                i++;
            }
            i--;
            System.out.println(sb2.toString()); //Hello and in next line //World
            result.add(sb2.toString());;
        }
        return result;

    }
}
