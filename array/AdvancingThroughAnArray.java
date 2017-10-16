import java.lang.*;

import static java.lang.Math.max;

public class AdvancingThroughAnArray
{
    public static void main(String args[])
    {
        int arr[] = {4,2,1,0,1,0};
        int lastIndex = advance(arr);
        System.out.println(lastIndex);
    }

    public static void printArray(int arr[])
    {
        int size = arr.length;
        for(int i = 0; i < size; i ++)
        {
            System.out.printf(arr[i]+" ");
        }
        System.out.println();
    }

    public static int advance(int arr[])
    {
        int size = arr.length;
        int maxToBeReached = 0;

        for(int i = 0; i <= maxToBeReached && maxToBeReached < size; i++ )
        {
            maxToBeReached = max(arr[i]+i,maxToBeReached);
        }

        if(maxToBeReached >= size -1)
        {
            maxToBeReached = size - 1;
        }
        return maxToBeReached;

    }
}
