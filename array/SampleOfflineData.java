
public class SampleOfflineData
{
    public static void main(String args[])
    {
        Integer arr[] = {1,2,3,4};
        int k = 2;
        sample(arr,k);
        printArray(arr);

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

    public static void sample(Integer arr[], int k)
    {
        for(int i = 0; i < k;i++)
        {
            int random = i + (int)(Math.round(Math.random()*(k-i)));
            swap(arr,i,random);
        }
    }
}
