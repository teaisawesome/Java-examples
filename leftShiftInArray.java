

// first number is the array's length, second is number of left shifting
// Input:
// 5 4
// 1 2 3 4 5


// output:
// 5 1 2 3 4


static int[] rotLeft(int[] a, int d)
{
    for(int i = 0; i < d; i++)
    {
        int temp = a[a.length - 1];

        a[a.length -1] = a[0];

        for(int j = a.length -2; j >= 0; j--)
        {
            int seged = a[j];
            a[j] = temp;
            temp = seged;
        }
    }

    return a;
}
