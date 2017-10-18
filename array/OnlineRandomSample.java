public class OnlineRandomSample
{
    public static void main(String args[])
    {
        Integer arr[] = {1,2,3,4,5,6,7,8};
        int k = 4;
        Integer sampleArray[] = sample(arr,k);
        printArray(sampleArray);

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

    public static Integer[] sample(Integer arr[], int k)
    {
        Integer sampleArray[] = new Integer[k];
        int i;
        for(i = 0; i < k;i++)
        {
            sampleArray[i] = arr[i];
        }
        for(int j = i; j< arr.length;j++)
        {
            int randomIndex = (int)(Math.round(Math.random()*(j)));
            if(randomIndex < k)
            {
                sampleArray[randomIndex] = arr[j];
            }
        }
        return sampleArray;
    }
}
