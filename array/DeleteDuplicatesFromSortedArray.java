public class DeleteDuplicatesFromSortedArray
{
    public static void main(String args[])
    {
        int arr[] = {1,1,1,2,3,3,4,5,5,5,6};
        deleteDuplicates(arr);
        printArray(arr);
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

    public static void deleteDuplicates(int arr[])
    {
        int writeIndex = 1;
        int count = 0;
        for(int i = 1; i < arr.length; i++)
        {
            if(arr[writeIndex-1] != arr[i])
            {
                arr[writeIndex] = arr[i];
                writeIndex++;
            }
            else
            {
                count++;
            }
        }
        int index = arr.length-1;
        while(count > 0)
        {
            arr[index] = 0;
            index--;
            count--;
        }
    }
}
