// Complete the sherlockAndAnagrams function below.
    static int sherlockAndAnagrams(String s)
    {
        char[] T = s.toCharArray();

        int ans = 0;

        for(int i = 0; i < T.length; i++)
        {
            for(int j = i+1; j < T.length; j++)
            {
                if(i != j && T[i] == T[j])
                {
                    ans++;
                }
            }
        }

        int counter = 2;

        while(counter != T.length)
        {
            for(int j = 0; j < T.length - counter + 1; j++)
            {
                String sub = s.substring(j, counter+j);

                char[] subT = sub.toCharArray();

                for(int h = j + 1; h < T.length - counter + 1; h++)
                {
                    String sub2 = s.substring(h, counter+h);

                    char[] subT2 = sub2.toCharArray();

                    int n = subT.length; 
                    int m = subT2.length; 

                    // If lengths of array are not equal means 
                    // array are not equal 
                    if (n == m)
                    {
                        // Sort both arrays 
                        Arrays.sort(subT); 
                        Arrays.sort(subT2); 

                        // Linearly compare elements 
                        boolean same = true;

                        for (int i = 0; i < n; i++) 
                            if (subT[i] != subT2[i]) 
                                same = false;

                        // If all elements were same. 
                        if(same)
                            ans++;

                    }

                }
            }
            counter++;
        }

        return ans;

    }
