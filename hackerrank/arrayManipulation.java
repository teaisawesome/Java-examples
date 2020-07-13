// NOT FINISHED TASK - HAS TO BE OPTIMIZED
// It must return an integer, the maximum value in the resulting array. 

// input:
/*
5 3
1 2 100
2 5 100
3 4 100
*/

// output
/*
 200
 
 
 
 
After the first update list will be 100 100 0 0 0.
After the second update list will be 100 200 100 100 100.
After the third update list will be 100 200 200 200 100.
The required answer will be 200. 
*/

static long arrayManipulation(int n, int[][] queries)
{
    long max = 0;

    int[] array = new int[n];

    // init array
    for(int i : array)
    {
        i = 0;
    }

    for(int i = 0; i < queries.length; i++)
    {
        for(int j = queries[i][0]-1; j < queries[i][1]; j++)
        {
            array[j] += queries[i][2];

            if(array[j] > max)
                max = array[j];
        }
    }

    return max;

}
