import java.util.Arrays;
import java.lang.*;

import static java.lang.Math.abs;

public class Multiply
{
    public static void main(String args[])
    {
        int arr1[] = {-1,1};
        int arr2[] = {1,1,1,9};
        int result[] = multiply(arr1,arr2);
        printArray(result);
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

    public static void reverseArray(int arr[])
    {
        int size = arr.length;
        for(int i = 0; i < size/2; i ++)
        {
            int temp = arr[i];
            arr[i] = arr[size-1-i];
            arr[size-1-i] = temp;
        }
    }

    public static int[] multiply(int x[], int y[])
    {
        boolean negativeFlag = false;
        if((x[0] > 0 && y[0] < 0) || (x[0] < 0 && y[0] > 0))
        {
            negativeFlag = true;
        }
        x[0] = abs(x[0]);
        y[0] = abs(y[0]);
        reverseArray(x);
        reverseArray(y);
        int xSize = x.length;
        int ySize = y.length;
        int result[] = new int[xSize + ySize];
        Arrays.fill(result,0);

        for(int i = 0; i < xSize; i++)
        {
            for(int j = 0; j < ySize ; j++)
            {
                result[i+j] += x[i] * y[j];
                result[i+j+1] += result[i+j]/10;
                result[i+j] = result[i+j]%10;
            }
        }
        reverseArray(result);

        if(negativeFlag == true)
        {
            for(int i = 0; i < result.length; i++)
            {
                if(result[i] != 0)
                {
                    result[i] = result[i]*-1;
                    break;
                }

            }

        }
        return result;

    }
}
