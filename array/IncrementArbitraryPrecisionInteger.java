
public class IncrementArbitraryPrecisionInteger
{
    public static void main(String args[])
    {
        int arr[] = {1,9,9,9,9};
        printArray(addOne(arr));
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

    public static int[] addOne(int arr[])
    {
        int carry = 1;
        for(int i = arr.length - 1; i >=0; i-- )
        {
            int sum = arr[i] + carry;
            if(sum > 9)
            {
                arr[i] = 0;
                carry = 1;
            }
            else
            {
                arr[i] = sum;
                carry = 0;
            }
        }

        if(carry == 1)
        {
            int temp[] = new int[arr.length + 1];
            temp[0] = carry;
            for(int j = 0; j < arr.length; j++)
            {
                temp[j+1] = arr[j];
            }
            return temp;
        }
        else
        {
            return arr;
        }
    }
}
