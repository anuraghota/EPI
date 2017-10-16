public class DeleteKeyFromArray
{
    public static void main(String args[])
    {
        int arr[] = {2,2,1,1,1,3};
        deleteKey(arr,1);
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

    public static void deleteKey(int arr[],int key)
    {
        int writeId = 0;
        int count = 0;
        for(int i = 0; i < arr.length; i++)
        {
            if(arr[i] != key)
            {
                arr[writeId] = arr[i];
                writeId++;
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
