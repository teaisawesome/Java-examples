// It must return an integer representing the minimum number of swaps to sort the array.

// input: 
// 4
// 4 3 1 2

// output:
// 3


// Complete the minimumSwaps function below.
    static int minimumSwaps(int[] arr)
    {
        int sum = 0;

        for(int i = 0; i < arr.length; i++)
        {
            if(arr[i] != (i+1))
            {
                int j = i+1;

                while(arr[j] != i+1)
                {
                    j++;
                }

                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;

                sum++;
            }
        }

        return sum;
    }
