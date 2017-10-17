public class ComputeNextPermutation
{
    public static void main(String args[])
    {
        Integer arr[] = {1,5,4,3,2,1};
        Integer nextPermutation[] = nextPermutation(arr);
        printArray(nextPermutation);

    }

    public static <T> void printArray(T arr[])
    {
        int size = arr.length;
        for(int i = 0; i < size; i ++)
        {
            System.out.printf(arr[i]+" ");
        }
        System.out.println();
    }

    public static void swap(Integer arr[], int index1, int index2)
    {
        int temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;
    }

    public static Integer[] nextPermutation(Integer arr[])
    {
        int i;
        for(i = arr.length-1; i > 0; i--)
        {
            if(arr[i-1] < arr[i])
            {
                break;
            }
        }
        if(i == 0)
        {
            return new Integer[]{};
        }

        int min = Integer.MAX_VALUE;
        int minIndex = i;
        for(int j = i; j < arr.length-1; j++)
        {
            if((arr[j] > arr[i-1]) && arr[j] < min)
            {
                min = arr[j];
                minIndex = j;
            }
        }

        swap(arr,i-1,minIndex);

        for(int k = i; k < i+((arr.length-i)/2); k++)
        {
            int temp = arr[k];
            arr[k] = arr[arr.length-1-k+i];
            arr[arr.length-1-k+i] = temp;
        }

        return arr;
    }
}
