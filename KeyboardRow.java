class Solution {
    public String[] findWords(String[] words) {
       ArrayList<String> list = new ArrayList<>();


        for(String s : words)
        {
            
            String lowercaseStr = s;
            s = s.toLowerCase();
             boolean issame = true;
            int prev = consists(s.charAt(0));
            for(char c : s.toCharArray())
            {
                int value = consists(c);
               if(value!=prev)
               {
                issame = false;
                break;
               }
            }
           

            
            if(issame)
                list.add(lowercaseStr);
        }

        return list.toArray(new String[0]);

    }

    public static int consists(char c)
    {
        String first="qwertyuiop";
        String middle ="asdfghjkl";
        String last ="zxcvbnm";
        if(first.contains(String.valueOf(c)))
            return 1;
        else if(middle.contains(String.valueOf(c)))
            return 2;
        return 3;
    }
}
